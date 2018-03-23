package com.finersoft.chap02.homework;

import java.util.Scanner;

/**
 * 名称：作业2-5 <br />
 * 说明：编写一个程序对两个浮点数赋值，并计算合计值和平均值。
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
public class Ex0205 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("本程序用于输入两个浮点数，并输出总计和平均值。");
			System.out.print("请输入浮点数值a：");
			double a = stdIn.nextDouble();
			System.out.print("请输入浮点数值b：");
			double b = stdIn.nextDouble();
			
			System.out.println("你输入的a、b为："+a+"、"+b);
			System.out.println("两数之和为："+(a+b));
			System.out.println("两数之平均数为："+((a+b)/2));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
