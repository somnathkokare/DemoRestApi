package com.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.RandomAccess;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Demo;
import com.demo.repository.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	DemoRepository demoRepo;

	@Override
	public Demo saveDemoInfo(Demo demo) {

		String randomID=UUID.randomUUID().toString();
		demo.setEmployeeId(randomID);
		Demo saveDemo = demoRepo.save(demo);

		return saveDemo;
	}

	@Override
	public List<Demo> getAllDemoInfo(Demo demo) {

		List<Demo> getAll = demoRepo.findAll();
		return getAll;
	}

	@Override
	public Optional<Demo> getDemoById(String id) {

		Optional<Demo> getById = demoRepo.findById(id);
		return getById;
	}

	@Override
	public void deleteById(String id) {
		demoRepo.deleteById(id);
	}

}
