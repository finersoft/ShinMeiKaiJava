package com.finersoft.chap04;
// 显示读入的数值个*

import java.util.Scanner;

class PutAsteriskFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("要显示多少个*呢：");
			int n = stdIn.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.print('*');
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
