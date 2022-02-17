package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// ask user to enter their country and capture it
		// once values are caputred print which language user spreaks

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter what country you are from");

		String Country = input.next();

		String Language;

		switch (Country.toLowerCase()) {

		case "usa":
			Language = "English";
			break;

		case "turkey":
			Language = "Turkish";
			break;

		case "russia":
			Language = "Russian";

		case "france":
			Language = "French";

			break;
		default:
			Language = "Unknown";

		}

		System.out.println(Country + " speaks " + Language + " language.");

	}

}
