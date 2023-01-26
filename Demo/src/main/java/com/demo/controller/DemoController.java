package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Demo;
import com.demo.service.DemoService;

@RestController
@RequestMapping("demo")
public class DemoController {

	@Autowired
	DemoService demoSer;

	@PostMapping("/save")
	public ResponseEntity<Demo> saveDemoInfo(@RequestBody Demo demo) {

		Demo saveDemo = demoSer.saveDemoInfo(demo);
		return ResponseEntity.ok().body(saveDemo);

	}

	@GetMapping("/get")
	public List<Demo> getAllDemoInfo(Demo demo) {
		List<Demo> getAllDemo = demoSer.getAllDemoInfo(demo);
		return getAllDemo;
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Demo>> getDemoById(@PathVariable("id") String id) {

		Optional<Demo> getById = demoSer.getDemoById(id);
		return ResponseEntity.ok().body(getById);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteBYId(@PathVariable("id") String id) {
		demoSer.deleteById(id);
	}

}
