package com.bonakula.todo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoReader {

	public static void main(String[] args) {
		File todo = new File("D:\\m.txt");
		int tagIndex = 50;
		List<String> tags = getTags(todo);
		TagResult result = getLinesByTag(todo, tags.get(tagIndex));
		System.out.println("result for tag "+tags.get(tagIndex));
		System.out.println("\n\n"+result.result);
	}

	private static TagResult getLinesByTag(File todo, String tag) {
		StringBuilder sb = new StringBuilder();
		TagResult result = new TagResult();
		result.tag = tag;
		try {
			Scanner scanner = new Scanner(todo);
			boolean foudTag = false;
			int count = 10;
			while(scanner.hasNextLine() && count > 0){
				String nextLine = scanner.nextLine();
				if(nextLine.contains(tag)){
					sb.append(nextLine);
					sb.append("\n");
					foudTag = true;
				}
				if(foudTag){
					sb.append(nextLine);
					sb.append("\n");
					count--;
				}
				 result.lastLine = nextLine;
			 }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		result.result = sb.toString();
		return result;

	}

	private static List<String> getTags(File todo) {
		List<String> tags = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(todo);
			while(scanner.hasNext()){
				String word = scanner.next();
				if(foundTag(word)){
					tags.add(word);
				}
			}
			System.out.println("list of tags: "+tags);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tags;
	}

	private static boolean foundTag(String word) {
		return word.startsWith("#");
	}

}

class TagResult{
	public String tag;
	public String result;
	public String lastLine;
	
}
