package com.learning.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class FilesRunner {

	public static void main(String[] args) throws IOException {
		
		Path currentDirectory = Paths.get(".");
	Predicate<? super Path> Predicate = path -> String.valueOf(path).endsWith("java");
		//	Files.list(currentDirectory).forEach(System.out::println);
		Files.walk(currentDirectory, 1).
		filter(Predicate ).
		forEach(System.out::println);

	}

}
