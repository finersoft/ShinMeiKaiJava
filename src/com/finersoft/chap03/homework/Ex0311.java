package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：判断两数差值与10的大小<br/>
 * @author Finersoft
 * @date 2018年3月25日
 */
public class Ex0311 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("请输入一个整数值n：");
			int n = stdIn.nextInt();
			System.out.print("请输入一个整数值m：");
			int m = stdIn.nextInt();
		int minus = Math.abs(m-n);
		
		System.out.println(minus<=10?"差值小于等于10":"差值大于等于11");
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
