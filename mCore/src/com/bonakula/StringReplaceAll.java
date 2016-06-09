package com.bonakula;

public class StringReplaceAll {

	public static void main(String[] args) {
		String template = "hello HELLO .. ...THIS is a sample template, that IS to test...";
		System.out.println(template.replaceAll("IS", "1111"));
		System.out.println(template.replaceAll("hello", "2222"));
	}

}
