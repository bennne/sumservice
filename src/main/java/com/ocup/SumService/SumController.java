package com.ocup.SumService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {
	Logger logger = LoggerFactory.getLogger(SumController.class);
	
	static {
		System.out.println("hier");
	}

	@RequestMapping("/sum")
	public Double sum(@RequestParam(value = "val1", defaultValue = "0") double val1,
			@RequestParam(value = "val2", defaultValue = "0") double val2) {
		logger.debug("SUM: " + val1 + " + " + val2);
		System.out.println("SUM: " + val1 + " + " + val2);
		return val1 + val2;
	}
}
