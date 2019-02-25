package com.john.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.john.dubbo.MyService;

@Service
public class DubboServiceImpl implements MyService{

	@Override
	public String callDubbo() {
		return "dubbo";
	}
	
	
}
