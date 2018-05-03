package com.finersoft.chap15;
//	字符串数组（读入并显示）

import java.util.Scanner;

class ReadStringArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("字符串的个数：");
			int n = stdIn.nextInt();
			String[] sx = new String[n];
			for (int i = 0; i < sx.length; i++) {
				System.out.print("sx[" + i + "] = ");
				sx[i] = stdIn.next();
			}
			for (int i = 0; i < sx.length; i++)
				System.out.println("sx[" + i + "] = \"" + sx[i] + "\"");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}		
	}
}
