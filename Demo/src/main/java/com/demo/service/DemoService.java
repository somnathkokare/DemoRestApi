package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.model.Demo;

public interface DemoService {

	public Demo saveDemoInfo(Demo demo);

	public List<Demo> getAllDemoInfo(Demo demo);

	public Optional<Demo> getDemoById(String id);

	public void deleteById(String id);

}
