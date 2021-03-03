package com.qis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

/**
 * @author qishuo
 * @date 2021/2/23 11:00 下午
 */
@Controller
@RequestMapping("/demo")
public class DemoController {


	@RequestMapping("/handle01")
	@ResponseBody
	public String handle01(String name, Map<String, Object> model) {
		System.out.println("++++++++handler业务逻辑处理中....");
		Date date = new Date();
		model.put("date", date);
		return "success";
	}
}
