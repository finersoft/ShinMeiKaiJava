package com.finersoft.chap02.homework;

import java.util.Scanner;

/**
 * 名称：作业2-2 <br />
 * 说明：编写一个程序对三个整数赋值，并计算合计值和平均值。
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
public class Ex0202 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.println("本程序用于输入三个数，并输出总计和平均值。");
			System.out.print("请输入整数值a：");
			int a = stdIn.nextInt();
			System.out.print("请输入整数值b：");
			int b = stdIn.nextInt();
			System.out.print("请输入整数值c：");
			int c = stdIn.nextInt();
			
			System.out.println("你输入的a、b、c为："+a+"、"+b+"、"+c);
			System.out.println("三数之和为："+(a+b+c));
			System.out.println("三数之平均数为："+((a+b+c)/3));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
