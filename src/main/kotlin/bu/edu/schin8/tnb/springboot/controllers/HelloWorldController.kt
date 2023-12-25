package bu.edu.schin8.tnb.springboot.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    // Use base mapping as the mapping
    @GetMapping
    fun helloWorld(): String {
        return "Hello, this is a REST endpoint"
    }
}