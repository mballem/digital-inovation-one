"use strict"

const AWS = require('aws-sdk')

const getAllItems = async (evt) => {

    const dynamo = new AWS.DynamoDB.DocumentClient()

    let itemList;   

    try {

        const results = await dynamo.scan({
            TableName: "ItemTableNew"
        }).promise()

        itemList = results.Items

    } catch (err) {
        console.log(err)
    }


    return {
        statusCode: 200,
        body: JSON.stringify(itemList)
    }
}

module.exports = {
    handler: getAllItems
}