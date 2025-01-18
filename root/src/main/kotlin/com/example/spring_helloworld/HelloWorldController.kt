package com.example.spring_helloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController // このクラスのメソッドの返り値はHTTPメソッドの返り値になる
class HelloWorldController {
    @GetMapping("/") // GETリクエストのパス
    fun helloWorld(): String {
        return "Hello World!!"
    }
}