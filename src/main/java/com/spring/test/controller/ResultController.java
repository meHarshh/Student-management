package com.spring.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.service.ResultService;

@RestController
public class ResultController {
	@Autowired
	private ResultService resultService;

}
