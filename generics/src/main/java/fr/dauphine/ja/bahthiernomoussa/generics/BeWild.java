package fr.dauphine.ja.bahthiernomoussa.generics;

import java.util.Arrays;
import java.util.List;

public class BeWild {
	
	private static void print(List<?> list) { // Pour String -> print(List<? extends CharSequence> list)
		for(Object o:list)
			System.out.println(o);
	}
	
	
	private static void printLength(List<? extends CharSequence> list) {
		
	}
	public static void main(String[] args) {
		List<String> list = Arrays.asList("foo","toto");
		print(list);
		
		List<Integer> l = Arrays.asList(2,3,5);
		print(l);
	}
}
