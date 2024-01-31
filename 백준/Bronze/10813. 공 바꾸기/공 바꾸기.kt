package com.example.main

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val cnt =nextInt()
    val num = nextInt()

    var array = IntArray(cnt) {it+1}

    for (i in 0 until num){
        var a = nextInt()
        var b = nextInt()

        var temp = array[a-1]
        array[a-1] = array[b-1]
        array[b-1] = temp
    }
    array.forEach { print("$it ") }


}