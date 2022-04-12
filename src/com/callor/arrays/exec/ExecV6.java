package com.callor.arrays.exec;

import java.util.Arrays;

public class ExecV6 {

	public static void main(String[] args) {
		int[] aNum = new int[100];

		for (int index = 0; index < aNum.length; index++) {
			aNum[index] = (int) (Math.random() * 100) + 1;
		}

		System.out.println("===================================");
		System.out.println("짝수 리스트");
		System.out.println("-----------------------------------");

		int countNum = 0;

		for (int index = 0; index < aNum.length; index++) {
			boolean bNum = (aNum[index] % 2) == 0;

			if (bNum) {
				System.out.print(aNum[index] + ",\t");
				countNum++;
				if (countNum % 5 == 0) {
					System.out.println();
				}
			}

		}

	}

}
