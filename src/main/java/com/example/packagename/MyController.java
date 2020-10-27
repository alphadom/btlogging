package com.example.packagename;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MyController.class);
	@GetMapping("/mylog")
	public String message()
	{
		LOGGER.error("error log");
		LOGGER.warn("warn log");
		LOGGER.info("info log");
		LOGGER.debug("debug log");
		LOGGER.trace("trace log");
		return "My string";
	}

}
