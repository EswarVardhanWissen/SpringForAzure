package com.example.SpringForAzure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockController {

	@GetMapping("success")
	public ResponseEntity<String> basicMethod(){
		return ResponseEntity.ok("Successfully Working");
	}
}
