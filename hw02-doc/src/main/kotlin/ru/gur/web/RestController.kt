package ru.gur.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RestController {

    @GetMapping("/")
    fun index(@RequestParam("name") name: String) : String {
        return "Hello, $name!"
    }
}
