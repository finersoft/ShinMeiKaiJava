package com.finersoft.chap03;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：计算三个整数值中的最大值
 * 
 * @author Finersoft
 * @date 2018年3月24日
 */
class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("整数a：");
			int a = stdIn.nextInt();
			System.out.print("整数b：");
			int b = stdIn.nextInt();
			System.out.print("整数c：");
			int c = stdIn.nextInt();
			int max = a;
			if (b > max) {
				max = b;
			}
			if (c > max) {
				max = c;
			}
			System.out.println("最大值是" + max + "。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
