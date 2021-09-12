package com.bridgelabz.algorithm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the Message");
		String message = sc.nextLine();

		System.out.println("Please Enter Your name");
		String name = sc.nextLine();

		System.out.println("Please Enter your fullanme");
		String fullname = sc.nextLine();

		System.out.println("Please Enter phone number");
		String phone = sc.nextLine();

		System.out.println("Please Enter date");
		String date = sc.nextLine();

		String output = RegularExpressions.regularExpression(name, fullname, phone, date, message);
		System.out.println(output);
		sc.close();

	}

	public static String regularExpression(String name, String fullname, String phone, String date, String message) {

		Pattern p = Pattern.compile("[a-zA-Z]");
		Pattern p1 = Pattern.compile("[a-zA-Z]");
		Pattern p2 = Pattern.compile("91-[0-9]{10}");
		Pattern p3 = Pattern.compile("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}");
		
		String names = "Invalid name..!!";
		String fullnm = "Invalid fullname..!!";
		String phn = "Invalid phone Number..!!";
		String dt = "Invalid Date Format..!!";
		String newMessage3 = null;

		Matcher m = p.matcher(name);
		if (m.find() != true) {
			return names;
		}

		Matcher m1 = p1.matcher(fullname);
		if (m1.find() != true) {
			return fullnm;

		}

		Matcher m2 = p2.matcher(phone);
		if (m2.find() != true) {
			return phn;

		}

		Matcher m3 = p3.matcher(date);
		if (m3.find() != true) {
			return dt;

		}
		String newMessage = message.replace("<<name>>", name);
		String newMessage1 = newMessage.replace("<<full name>>", fullname);
		String newMessage2 = newMessage1.replace("91-xxxxxxxxxx", phone);
		newMessage3 = newMessage2.replace("01/01/2016", date);
		return newMessage3;
	}

}
