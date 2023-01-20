"use strict"

const AWS = require('aws-sdk')

const deleteItem = async (evt) => {

    const dynamo = new AWS.DynamoDB.DocumentClient()

    const {id} = evt.pathParameters

    let message = ''
    let statusCode = 0
    
    const params = {
        TableName:"ItemTableNew",
        Key: {id}
    };

    try {

        await dynamo.delete(params).promise()
        statusCode = 200
        message = 'Item was removed'

    } catch (err) {
        message = err
        statusCode = 400
    }

    const response = {
        statusCode: statusCode,
        body: JSON.stringify(message)
    }

    return response
}

module.exports = {
    handler: deleteItem
}