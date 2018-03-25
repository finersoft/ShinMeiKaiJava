package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：判断一个数是非正整数，还是3的倍数，或输出对3整除后的余数<br/>
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
public class Ex0307 {


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		try {
			System.out.print("请输入一个整数值n：");
			int n = stdIn.nextInt();
			if (n <= 0) {
				System.out.println("n不是正整数");
			} else {
				int yushu = n % 3;
				switch (yushu) {
				case 0:
					System.out.println("n能被3整除");
					break;
				case 1:
					System.out.println("n被3除余1");
					break;
				case 2:
					default:
					System.out.println("n被3除余2");
					break;
				}
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
