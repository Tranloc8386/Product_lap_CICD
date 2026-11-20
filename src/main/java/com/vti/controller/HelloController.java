package com.vti.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/hello")
@CrossOrigin("*")
public class HelloController {

	@GetMapping()
	public ResponseEntity<?> hello() {
		return ResponseEntity.ok("Hello from VTI Product Management!");
	}
}
