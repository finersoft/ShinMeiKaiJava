package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：写一个比较两个整数谁大的代码<br/>
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
public class Ex0304 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("请输入一个整数值n：");
			int n = stdIn.nextInt();
			System.out.print("请输入一个整数值m：");
			int m = stdIn.nextInt();
			if (m > n) {
				System.out.println("m更大");
			} else if (n > m) {
				System.out.println("n更大");
			} else if (n == m) {
				System.out.println("一样大");
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
