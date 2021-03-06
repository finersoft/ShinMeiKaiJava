package com.finersoft.chap04;
// 显示所读入的数值个*（其１）

import java.util.Scanner;

class PutAsterisk1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("要显示多少个*呢：");
			int n = stdIn.nextInt();
			int i = 0;
			while (i < n) {
				System.out.print('*');
				i++;
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}	
}
