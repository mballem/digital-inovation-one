"use strict"

const AWS = require('aws-sdk')
//const uuid = require('uuid')

const insertItem = async (evt) => {
    
    const {item} = JSON.parse(evt.body)
    const createAt = new Date().toISOString()
    const id = AWS.util.uuid.v4()

    const dynamo = new AWS.DynamoDB.DocumentClient()

    const newItem = {
        id, 
        item, 
        createAt, 
        itemStatus: false
    }    

    let statusCode
    let responseBody

    try {
        await dynamo.put({
            TableName: "ItemTableNew",
            Item: newItem
        }).promise()

        responseBody = JSON.stringify(newItem);
        statusCode = 200;
    } catch (err) {
        responseBody = JSON.stringify(err);
        statusCode = 400;
    }

    const response = {
        statusCode : statusCode,
        headers : {
            "Content-Type" : "application/json",
            "Access-Control-Allow-Origin" : "*",
            "Access-Control-Allow-Headers" : "*",
            "Access-Control-Allow-Credentials" : true
        },
        body : responseBody
    }

    return response
}

module.exports = {
    handler: insertItem
}