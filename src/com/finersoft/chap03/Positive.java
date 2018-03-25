package com.finersoft.chap03;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：读入的整数值是正值吗？<br/>
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
class Positive {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("整数值：");
			int n = stdIn.nextInt();
			if (n > 0) {
				System.out.println("该值为正。");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
