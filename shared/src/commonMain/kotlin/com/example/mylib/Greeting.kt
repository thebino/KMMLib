package com.example.mylib

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}