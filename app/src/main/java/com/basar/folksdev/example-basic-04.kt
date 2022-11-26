package com.basar.folksdev

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
fun main() = runBlocking {
    doWorld3()
    println("Done")
}
*/

// Concurrently executes both sections
suspend fun doWorld3() = coroutineScope {
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}