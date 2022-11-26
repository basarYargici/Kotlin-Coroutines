package com.basar.folksdev

import kotlinx.coroutines.*
/*
fun main() = runBlocking {
    println("Starting Thread  :" + Thread.currentThread().name)
    joinAll(
        async { dummyNetworkCall(1, 500) },
        async { dummyNetworkCall(2, 300) }
    )
    println("Ending thread :" + Thread.currentThread().name)
}*/

suspend fun dummyNetworkCall(number: Int, delay: Long) {
    withContext(Dispatchers.IO) {
        println("new Thread  :" + Thread.currentThread().name)
        println("Coroutine $number starts work")
        delay(delay)
        println("Coroutine $number has finished")
    }
}
