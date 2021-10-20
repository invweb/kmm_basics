package com.test.kmm_app

class Greeting {
    fun greeting(): String {
        return "Hello, test app on ${Platform().platform}!"
    }
}