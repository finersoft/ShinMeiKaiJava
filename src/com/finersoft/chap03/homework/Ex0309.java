package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：判断两个实数值谁大谁小,输出大值<br/>
 * 
 * @author Finersoft
 * @date 2018年3月25日
 */
public class Ex0309 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("请输入一个实数值n：");
			double n = stdIn.nextDouble();
			System.out.print("请输入一个实数值m：");
			double m = stdIn.nextDouble();
			System.out.println(m > n ? m : n);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
