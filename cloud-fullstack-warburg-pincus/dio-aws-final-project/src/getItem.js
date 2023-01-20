"use strict"

const AWS = require('aws-sdk')

const getItem = async (evt) => {

    const dynamo = new AWS.DynamoDB.DocumentClient()

    const {id} = evt.pathParameters

    let item;
    let statusCode = 0;
    
    const params = {
        TableName:"ItemTableNew",
        Key: {id}
    };

    try {

        const result = await dynamo.get(params).promise()

        item = result.Item
        statusCode = (item === undefined) ? 204 : 200

    } catch (err) {
        console.log(err)
        statusCode = 400
    }

    return {
        statusCode: statusCode,
        body: JSON.stringify(item)
    }
}

module.exports = {
    handler: getItem
}