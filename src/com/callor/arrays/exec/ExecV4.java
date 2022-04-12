package com.callor.arrays.exec;

public class ExecV4 {
	
	public static void main(String[] args) {
		
		int[] aNum = new int[100];

		for (int index = 0 ; index < aNum.length ; index++) {
			aNum[index] = (int) (Math.random() * 100) + 1;
		}

		int resultNum = 0;

		for (int index = 0 ; index < aNum.length ; index++) {
			if (aNum[index] % 2 == 0) {
				resultNum += aNum[index];
			}
		}
		
		System.out.println("모든 짝수의 합은 " + resultNum + " 입니다.");
	}

}
