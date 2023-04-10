package com.example.demo.contro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class Demo {
@GetMapping("/deo/{name}")
public String et(@PathVariable String name) {
	return "<h1>Hai "+name+" greetings</h1>";
}
}
