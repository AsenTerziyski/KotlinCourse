package test.old._02_joiningoncoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        delay(1000)
        println("World")
    }

    print("Hello, ")
    job.join()
    delay(2000)
    println("xxxxxxxxxxxxxxxxxxxxxxxxxxx")
}