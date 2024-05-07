package com.example.myapplication

import kotlin.random.Random

fun main() {
    var number = Random.nextInt (0,100)
    println("Please enter any number from 0 to 100: -")
    while (2 > 1) {
        var userGuess: Int = readln()!!.toInt()
        if (userGuess == number) {
            println("success")
        } else if (userGuess < number) {
            println("increase your guess")
        } else {
            println("decrease your guess")
        }
    }

}