package com.finersoft.chap04;

import java.util.Random;
import java.util.Scanner;

/**
 * 名称：猜数字游戏（目标数字范围为0～99）<br/>
 * 说明：<br/>
 * 
 * @author Finersoft
 * @date 2018年5月4日
 */
public class Kazuate {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		try {
			// 目标数字：生成一个0～99的随机数
			int no = rand.nextInt(100);
			System.out.println("猜数字游戏开始!!");
			System.out.println("请猜一个0～99的数字。");
			int x; // 玩家输入的数字
			do {
				System.out.print("是多少呢：");
				x = stdIn.nextInt();

				if (x > no) {
					System.out.println("比这个数字小呦。");
				} else if (x < no) {
					System.out.println("比这个数字大呦。");
				}
			} while (x != no);
			System.out.println("回答正确。");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
