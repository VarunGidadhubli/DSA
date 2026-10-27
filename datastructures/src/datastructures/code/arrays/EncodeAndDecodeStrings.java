package datastructures.code.arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

	public static void main(String[] args) {

		String arr[] = { "neet", "code", "1dsatest" };

		String encodedString = encodedStringFunc(arr);
		System.out.println("Encoded string is " + encodedString);

		List<String> decodedString = decodedStringFunc(encodedString);
		System.out.println("Decoded String is " + decodedString);
	}

	private static String encodedStringFunc(String arr[]) {

		String finalString = "";

		for (int i = 0; i < arr.length; i++) {

			finalString = finalString.concat(String.valueOf(arr[i].length()));
			finalString = finalString.concat(arr[i]);
		}

		return finalString;
	}

	private static List<String> decodedStringFunc(String stringToDecode) {

		int startIndex = 1, encodedNumberIndex = 0;
		List<String> decodedString = new ArrayList<String>();

		while (encodedNumberIndex < stringToDecode.length()) {

			int length = Character.getNumericValue(stringToDecode.charAt(encodedNumberIndex));

			decodedString.add(stringToDecode.substring(startIndex, startIndex + length));

			encodedNumberIndex = encodedNumberIndex + length + 1;

			startIndex = encodedNumberIndex + 1;
		}

		return decodedString;
	}
}
