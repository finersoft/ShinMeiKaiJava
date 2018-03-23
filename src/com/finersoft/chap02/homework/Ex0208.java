package com.finersoft.chap02.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 名称：作业2-8<br/>
 * 说明：输入一个整数，显示这个整数前后5个数范围内的随机数
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
public class Ex0208 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		try {
			System.out.println("本程序用于输入一个整数，显示这个整数前后5个数范围内的随机数。");
			System.out.print("请输入整数值a：");
			int a = stdIn.nextInt();
			Random rand = new Random();
			// a的前后5个数，包括a自己，就是11个数，所以随机数肯定是11个，开区间定义如下 [0,11）
			// 怎么用0-10和a来表示a的前后5个数？
			// 把a-5再加上随机数[0,11)应该就可以了。
			// 最小 a-5+0
			// 最大a-5+10
			// 哎，倒指头算出来的公式
			System.out.println("输入数前后五个数以内的随机数可能为：" + (a -5+ rand.nextInt(10)));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stdIn != null) {
				stdIn.close();
			}
		}
	}
}
