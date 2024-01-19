package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MultiThreadTestController {
@RequestMapping("/multithread")
public void test(String client, ModelMap model) throws Exception {
	//ModelMap model = new ModelMap();
	long start = System.currentTimeMillis();
	for(int i=1; i <= 10000; i++) {
		System.out.println(client + "==>" + i + " 번째 반복중");
		//Thread.sleep(1000);
	}
	long end = System.currentTimeMillis() - start;
	model.addAttribute("time", end+"(1/1000초) 소요");
	
}
}
