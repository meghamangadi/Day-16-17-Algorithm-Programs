 package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BubbleSort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter size of an array:");
		int number = sc.nextInt();
		int[] array = new int[number];
		int i;
		System.out.println("Enter the array elements:");
		for (i = 0; i < number; i++) {
			array[i] = sc.nextInt();
		}
		BubbleSort.bubbleSorting(array, number);

		sc.close();

	}

	public static void display(int array[], int number) {
		int i;
		for (i = 0; i < number; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void bubbleSorting(int array[], int number) {
		int i, j;
		for (i = 0; i < number - 1; i++) {

			for (j = i + 1; j < number; j++) {

				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		BubbleSort.display(array, number);
	}
}
