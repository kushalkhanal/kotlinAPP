package com.example.myapplication

fun main(args: Array<String>) {
    var data = mapOf(
        "nepal" to "nepal is land lock",
        "Usa" to "united states",
        "gootball" to " sport"
    )
    println("enter the word: ")
    var userInput: String = readln()
    var result = data[userInput]
    println("the meaning of $userInput is $result")
}