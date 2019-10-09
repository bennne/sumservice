package com.ocup.SumService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

	@RequestMapping("/sum")
	public Double sum(@RequestParam(value = "val1", defaultValue = "0") double val1,
			@RequestParam(value = "val2", defaultValue = "0") double val2) {
		System.out.println("SUM: " + val1 + " + " + val2);
		Double result = val1 + val2;
		System.out.println("SUM RESULT: " + result);
		return result;
	}
}
