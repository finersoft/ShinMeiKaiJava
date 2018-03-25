package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：按从大到小排列输入的两个数<br/>
 * 
 * @author Finersoft
 * @date 2018年3月26日
 */
public class Ex0315 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("整数a：");
			int a = stdIn.nextInt();
			System.out.print("整数b：");
			int b = stdIn.nextInt();
			System.out.println(a > b ? "" + a + "," + b + "" : "" + b + "," + a + "");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
