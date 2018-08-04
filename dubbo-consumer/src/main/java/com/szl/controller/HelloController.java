package com.szl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.szl.service.IDemoService;

/**
 * @author szl
 * @data 2018年7月31日 下午10:07:20
 *
 */
@RestController
@RequestMapping("/dubbo")
public class HelloController {

	@Autowired
	private IDemoService demoService;
	
	@RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST})
	public String helloDubbo(){
		return demoService.sayHello("dubbo!");
	}
}
