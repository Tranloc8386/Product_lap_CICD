package com.vti.controller;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sys")
public class SysController {

	@GetMapping("/status")
	public ResponseEntity<Map<String, String>> status() {
		Map<String, String> body = new HashMap<>();
		body.put("status", "UP");
		body.put("version", "v1");
		body.put("time", Instant.now().toString());
		return ResponseEntity.ok(body);
	}
}