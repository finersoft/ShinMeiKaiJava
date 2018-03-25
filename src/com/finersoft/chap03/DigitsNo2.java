package com.finersoft.chap03;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：判断读入的整数值的位数（是否是2位以上）
 * 
 * @author Finersoft
 * @date 2018年3月24日
 */
class DigitsNo2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int negtive10 = -10;
		int positive10 = 10;
		try {
			System.out.print("整数值：");
			int n = stdIn.nextInt();
			// ２位以上
			if (n <= negtive10 || n >= positive10) {
				System.out.println("是2位以上的数值。");
			}
			// 不足２位
			else {
				System.out.println("是不足2位的数值。");
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
