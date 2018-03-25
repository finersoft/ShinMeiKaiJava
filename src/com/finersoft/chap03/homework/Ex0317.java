package com.finersoft.chap03.homework;

import java.util.Random;

/**
 * 名称：<br/>
 * 说明：随机生成0，1,2换算成石头剪刀布<br/>
 * 
 * @author Finersoft
 * @date 2018年3月26日
 */
public class Ex0317 {
	public static void main(String[] args) {

		try {
			System.out.print("请选择手势（0…石头／1…剪刀／2…布）：");
			int hand = new Random().nextInt(3);
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

		}
	}
}
