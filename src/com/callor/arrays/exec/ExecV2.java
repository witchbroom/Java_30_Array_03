package com.callor.arrays.exec;

public class ExecV2 {
	
	public static void main(String[] args) {
		
		int[] aNum = new int[100];
		int index = 0;
				
		for(index = 0 ; index < aNum.length ; index ++) {
			aNum[index] = (int)(Math.random() * 100) + 1;
		}
		
		for(index = 0 ; index < aNum.length ; index ++) {
			if(aNum[index] % 2 == 0) {
				System.out.println(aNum[index] + "은(는) 짝수\n");
			} else {
				System.out.println(aNum[index] + "은(는) 홀수\n");
			}
		}
	}

}
