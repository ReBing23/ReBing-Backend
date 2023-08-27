package com.rebing.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController {

	@GetMapping("/")
	String home() {
		return "Hello ReBing!!";
	}
}