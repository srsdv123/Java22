package com.day8_arrays;

public class ReverseString {
	public static String reverse(String input) {
		String result = "";
		System.out.println("Displaying the reverse of " + input);
		for (int i = input.length() - 1; i >= 0; i--) {
			// System.out.print(str.charAt(i));
			result = result + input.charAt(i);
		}
		return result;

	}

	public static void main(String[] args) {
		String reverse = reverse("Deeksha");
		System.out.println(reverse);
	}

}
