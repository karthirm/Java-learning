package com.learning.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesWriteRunner {

	public static void main(String[] args) throws IOException {
		
		Path pathFileToWrite = Paths.get("./resources/file.txt");
		List<String> list = List.of("Apple","Orange","Saathukudi");
		Files.write(pathFileToWrite, list);
		

	}

}
