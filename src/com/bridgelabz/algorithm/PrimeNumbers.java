package com.bridgelabz.algorithm;

public class PrimeNumbers {

	public static void main(String[] args) {

		int flag = 0;
		System.out.println("Prime Numbers between the range of 0 - 1000");
		int first = 0;
		int second = 1000;
		for (int i = first + 1; i < second; ++i) {
			flag = PrimeNumbers.checkPrimeNumber(i);

			if (flag == 1)
				System.out.print(i + " ");

		}

	}

	public static int checkPrimeNumber(int num) {
		int flag = 1;
		for (int j = 2; j <= num / 2; ++j) {
			if (num % j == 0) {
				flag = 0;
				break;
			}
		}
		return flag;
	}
}
