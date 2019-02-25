package com.john.dubbo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.john.dubbo.MyService;

@RestController
public class MyController {
	@Reference
	private MyService dubboService;
	
	@RequestMapping("/dubbo")
	public String getDubbo(String msg) {
		return dubboService.callDubbo();
	}
}
