"use strict"

const AWS = require('aws-sdk')

const updateItem = async (evt) => {

    const dynamo = new AWS.DynamoDB.DocumentClient()

    const {itemStatus} = JSON.parse(evt.body)
    const {id} = evt.pathParameters

    await dynamo.update({
        TableName: "ItemTableNew",
        Key: {id},
        UpdateExpression: ' set itemStatus = :itemStatus ',
        ExpressionAttributeValues: {
            ':itemStatus' : itemStatus
        },
        ReturnValues: "ALL_NEW"
    }).promise()   

    return {
        statusCode: 200,
        body: JSON.stringify(
            { "msg": "Item updated" }
        )
    }
}

module.exports = {
    handler: updateItem
}