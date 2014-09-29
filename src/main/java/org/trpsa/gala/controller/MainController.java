package org.trpsa.gala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class MainController {

	@RequestMapping("/")
	String index() {
		return "index";
	}

	@RequestMapping("/verti")
	String verti() {
		return "verti-index";
	}

	@RequestMapping("/right-sidebar")
	String rightSidebar() {
		return "right-sidebar";
	}

	@RequestMapping("/pages/buy_gala")
	String tickets() {
		return "pages/buy_gala";
	}

	@RequestMapping("/pages/corporate")
	String corporate() {
		return "pages/corporate";
	}

	@RequestMapping("properties")
	@ResponseBody
	java.util.Properties properties() {
		return System.getProperties();
	}
}
