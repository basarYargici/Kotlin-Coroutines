package com.basar.folksdev

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

/*
fun main() = runBlocking {
    var i = 0
    repeat(15) { // launch a lot of coroutines
        launch {
            i++
            yield()
            println("$i : ${Thread.currentThread().name} .")
        }
    }
    println("$i : ${Thread.currentThread().name}")
    println("Done")
}*/
