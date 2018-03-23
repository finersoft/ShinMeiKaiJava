package com.finersoft.chap02.homework;

import java.util.Scanner;

/**
 * 名称：作业2-6 <br />
 * 说明：编写一个程序接收三角形的底边长和高，并输出三角形的面积。
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
public class Ex0206 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("本程序用于接收三角形的底边长和高，并输出三角形的面积。");
			System.out.print("请输入三角形的底a：");
			double a = stdIn.nextDouble();
			System.out.print("请输入三角形的高b：");
			double b = stdIn.nextDouble();

			System.out.println("你输入的底（a）、高（b）为：" + a + "、" + b);

			System.out.println("三角形的面积为（底*高/2，a*b/2）：" + (a * b / 2));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
