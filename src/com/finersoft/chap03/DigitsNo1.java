package com.finersoft.chap03;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明： 判断读入的整数值的位数（0／１位／２位以上）
 * 
 * @author Finersoft
 * @date 2018年3月24日
 */
class DigitsNo1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
int  negtive9=-9;
int positive9=9;
		try {
			System.out.print("整数值：");
			int n = stdIn.nextInt();
			// 0
			if (n == 0) {
				System.out.println("是0。");
			}
			// １位
			else if (n >= negtive9 && n <= positive9) {
				System.out.println("是1位数值。");
			}
			// ２位以上
			else {
				System.out.println("是2位以上的数值。");
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
