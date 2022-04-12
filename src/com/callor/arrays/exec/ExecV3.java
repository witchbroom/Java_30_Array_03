package com.callor.arrays.exec;

public class ExecV3 {

	public static void main(String[] args) {

		int[] aNum = new int[100];

		for (int index = 0; index < aNum.length; index++) {
			aNum[index] = (int) (Math.random() * 100) + 1;
		}

		int resultNum = 0;

		for (int index = 0; index < aNum.length ; index++) {
			if (aNum[index] % 2 == 0) {
				resultNum++;
			}
		}

		System.out.println("짝수의 개수는 " + resultNum + " 개 입니다.");
	}

}
