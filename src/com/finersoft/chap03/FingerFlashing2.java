package com.finersoft.chap03;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：根据读入的值显示对应的猜拳手势（其２：switch语句）
 * 
 * @author Finersoft
 * @date 2018年3月24日
 */
class FingerFlashing2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("请选择手势（0…石头／1…剪刀／2…布）：");
			int hand = stdIn.nextInt();
			switch (hand) {
			case 0:
				System.out.println("石头");
				break;
			case 1:
				System.out.println("剪刀");
				break;
			case 2:
				System.out.println("布");
				break;
			default:
				System.out.println("请出石头剪刀布中的一种");
				break;
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
