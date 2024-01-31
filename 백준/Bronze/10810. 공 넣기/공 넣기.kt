package com.example.main

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val cnt =nextInt()
    val num = nextInt()

    var array = IntArray(cnt, {0})

    for(i in 0 until num){
        var a =nextInt()
        var j = nextInt()

        var value = nextInt()
        for (b in a - 1 until j) {
            array[b] = value
        }

    }
    array.forEach { print("$it ") }


}