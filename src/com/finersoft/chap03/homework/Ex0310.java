package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：输出两数差值<br/>
 * @author Finersoft
 * @date 2018年3月25日
 */
public class Ex0310 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("请输入一个整数值n：");
			int n = stdIn.nextInt();
			System.out.print("请输入一个整数值m：");
			int m = stdIn.nextInt();
			System.out.println(Math.abs(m-n));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
