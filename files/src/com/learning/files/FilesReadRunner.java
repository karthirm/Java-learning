package com.learning.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;

public class FilesReadRunner {

	public static void main(String[] args) throws IOException {
		
		Path file = Paths.get("./resources/data.txt");
		//List<String>Readlines = Files.readAllLines(file);
		//System.out.println(Readlines);
		
		Files.lines(file).
		map(String::toLowerCase).
		filter(str ->str.contains("a")).
		
		forEach(System.out::println );
		
	}

}
