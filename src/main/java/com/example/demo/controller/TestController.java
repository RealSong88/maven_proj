package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.SalaryModel;
import com.example.demo.vo.TestVo;

@Controller
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String goTest(Model model) {
		
		TestVo tv = new TestVo(null, null);
		tv.setId("nene");
		tv.setName("한글");
		tv.setSecret("비밀문자");
		
		model.addAttribute("title", new TestVo("nada", "나다"));
		model.addAttribute("title2", tv);
		
		//문법 practice
		model.addAttribute("hello", "<strong>th:text</strong> 속성 체크...");
		model.addAttribute("btn", "cat");
		
		List<SalaryModel> salaryList = new ArrayList<SalaryModel>();
		
		//첫번째 데이터
		SalaryModel salaryModel;
		salaryModel = SalaryModel.builder()
						.id(1)
						.name("AAA")
						.email("AAA@naver.com").build();
		salaryList.add(salaryModel);
		
		//두번째 데이터
		salaryModel = SalaryModel.builder()
				.id(2)
				//.name("BBB")
				.email("BBB@naver.com").build();
		salaryList.add(salaryModel);
		
		//세번째 데이터
		salaryModel = SalaryModel.builder()
				.id(3)
				.name("CCC")
				.email("CCC@naver.com").build();
		salaryList.add(salaryModel);
		
		model.addAttribute("salaryList", salaryList);
		
		return "test";
	}
}
