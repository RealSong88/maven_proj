package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder @Data
public class SalaryModel {

	private int id;
	@NonNull @Builder.Default String name = "입력안함";
	private String email;
	
	
}
