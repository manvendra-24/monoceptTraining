package com.techlabs.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIAssignment {
	public static void main(String args[]) {
		/*
		 * 1. Read the names from the provided text file (names.txt)
		 * and store them in a list of Strings
		 * 
		 * 2. Filter the names to include only those that start with a specific letter
		 * (e.g., 'A')
		 * 
		 * 3. Convert all names to uppercase
		 * 
		 * 4. Sort the names alphabetically
		 * 
		 * 5. Remove duplicate names from the list
		 * and Collect the names into a new list
		 * 
		 * 6. Count the number of names that satisfy a certain condition - 
		 * names that does not contain 'i'
		 * 
		 * 7. Concatenate all the names into single string separated by commas.
		 * 
		 * 8. Filter names that start with 'J' and convert them to uppercase,
		 *  sort them, and collect them into a list
		 * 
		 */
		String textFile = "names.txt";
		List<String> names = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(textFile))){
			String line;
			while((line = br.readLine()) != null){
				names.add(line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Complete list of names: ");
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println();
		
		
		System.out.println("Names that starts with 'A' letter: ");
		names.stream()
		.filter(name -> name.startsWith("A"))
		.forEach(x->System.out.println(x));
		System.out.println();
		
		
		System.out.println("All names in uppercase: ");
		names.stream()
		.map(String::toUpperCase)
		.forEach(x->System.out.println(x));
		System.out.println();
		
		
		System.out.println("List of names in sorted order: ");
		names.stream()
		.sorted()
		.forEach(x->System.out.println(x));
		System.out.println();
		
		
		System.out.println("Only Distinct names: ");
		List<String> distinctNames = names.stream()
				.distinct()
				.collect(Collectors.toList());
		distinctNames.stream()
		.forEach(x->System.out.println(x));
		System.out.println();
		
		
		System.out.println("Number of names that does not contain 'i': ");
		long count = names.stream()
                .filter(name -> !name.contains("i"))
                .count();
		System.out.println(count);
		System.out.println();
		
		
		System.out.println("Concatenated Names: ");
		String commaSeparatedNames = names.stream()
                .collect(Collectors.joining(", "));
		System.out.println(commaSeparatedNames);
		System.out.println();
		
		
		System.out.println("Names that start with 'J' -> Uppercase -> Sorted -> NewList: ");
		List<String> newList = names.stream()
				.filter(name-> name.startsWith("J"))
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());
		newList.stream()
		.forEach(x->System.out.println(x));
		
	}
}
