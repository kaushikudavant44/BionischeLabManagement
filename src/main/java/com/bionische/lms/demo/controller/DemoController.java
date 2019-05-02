package com.bionische.lms.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bionische.lms.demo.model.Item;
import com.bionische.lms.demo.repo.DemoRepository;
import com.bionische.lms.exception.ResourceNotFoundException;
import com.bionische.lms.lab.model.LabStaff;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

	Logger logger = LoggerFactory.getLogger(DemoController.class);

	@Autowired
	DemoRepository demoRepository;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@GetMapping("/items")
	public List<Item> getAllNotes() {
		return demoRepository.findAll();
	}

	@GetMapping("/test")
	public List<Item> getDynamic() {

		List<Item> itemList = new ArrayList();
		try {

			String name = "Beakers";

			itemList = jdbcTemplate.query("SELECT * FROM m_items WHERE m_items.item_name = '" + name + "'",
					new BeanPropertyRowMapper(Item.class));

		} catch (Exception e) {

			e.printStackTrace();
		}
		return itemList;
	}

	@PostMapping("/item")
	public Item createNote(@Valid @RequestBody Item note) {
		return demoRepository.save(note);
	}

	@GetMapping("/item/{id}")
	public ResponseEntity< Item> getNoteById(@PathVariable(value = "id") Long itemId) {



		Item item = demoRepository.findByItemId(itemId);

		if (item == null) {
			throw new ResourceNotFoundException("Item", "id", itemId);
		} else {

			return new ResponseEntity<Item>(item, HttpStatus.OK);
		}

	}

	@PostMapping("/getlogin")
	public LabStaff getNoteById(@RequestParam("userName") String userName, @RequestParam("password") String password) {

		logger.info("username " + userName);
		logger.info("password " + password);

		return new LabStaff();

	}

}
