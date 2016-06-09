package com.gm.filesystem.extensions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadExtensions {

	public static void main(String[] args) {
		final String locationextens = "C:/hybris/hybris/config/localextensions.xml";

		BufferedReader reader = null;
		List<String> extensions = new ArrayList();
		File file = new File(locationextens);
		try {
			reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				// System.out.println(line);
				extensions.add(parseExtensionName(line));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		List<String> projects = new ArrayList();
		getlistProjects(projects);
		List<String> excludeProjects = projectsToExcludeList(extensions, projects);
		System.out.println(excludeProjects);

	}

	private static List<String> projectsToExcludeList(List<String> extensions,
			List<String> projects) {
		List<String> excludeProjects = new ArrayList<String>();
		for(String project: projects){
			if(!extensions.contains(project)){
				excludeProjects.add(project);
			}
		}
		return excludeProjects;
	}

	private static void getlistProjects(List<String> projects) {

		String directoryName = "D:/workspace/hybris57-oms/.metadata/.plugins";
		File directory = new File(directoryName);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		for (File file : fList) {
			if (file.isDirectory()) {
				System.out.println(file.getName());
			}
		}
	}

	private static String parseExtensionName(String line) {
		if (line.trim().startsWith("<extension")) {
			String[] split = line.trim().split("'");
			if (split.length > 2) {
				return split[1];
			}

		}

		return null;
	}

}
