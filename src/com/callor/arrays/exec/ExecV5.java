package com.callor.arrays.exec;

public class ExecV5 {

	public static int total() {
		

		int[] aNum = new int[100];
		int tNum = 0;
		
		for (int i = 0; i < aNum.length; i++) {
			aNum[i] = i;
			tNum += aNum[i] + 1;						
		}
				
		return tNum;
	}

	public static void main(String[] args) {
		
		System.out.println("모든 짝수의 합은 " + total() + " 입니다." );
		
	}

}
