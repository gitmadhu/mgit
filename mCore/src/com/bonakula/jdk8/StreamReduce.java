package com.bonakula.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StreamReduce {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("java", ""));
		list.add(new Student("java1", ""));
		list.add(new Student("java2", ""));
		list.add(new Student("java3", ""));
		list.add(new Student("java4", ""));
		list.add(null); // filter(Objects::nonNull) will ignore this value
		
		//list = new ArrayList<>();
		
		String result = list.stream().filter(Objects::nonNull)
				.map(x -> x.name)
				.reduce((i,j) -> i+","+j).get();
		System.out.println("reduce string with "+ result);

	}
	
}

class Student{
	public String name;
	public String group;
	
	Student(String name, String group){
		this.name = name;
		this.group = group;
	}
	
}
