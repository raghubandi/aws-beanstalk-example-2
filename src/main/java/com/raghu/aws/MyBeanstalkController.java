package com.raghu.aws;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("names")
public class MyBeanstalkController {

	@GetMapping("/{name}")
	public ResponseEntity<String> getPerson(@PathVariable("name") String name) {
		return new ResponseEntity<String>("Hi "+name+" Welcome to AWS CI CD pipeline", HttpStatus.OK);
	}
	
}
