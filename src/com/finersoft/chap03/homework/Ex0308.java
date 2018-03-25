/**
 * 
 */
package com.finersoft.chap03.homework;

import java.util.Scanner;

/**
 * 名称：<br/>
 * 说明：按分数来输出成绩的等级<br/>
 * @author Finersoft
 * @date 2018年3月25日
 */
public class Ex0308 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		try {
			System.out.print("请输入分数n：");
			int n = stdIn.nextInt();
			if (n <= 0) {
				System.out.println("n不是分数");
			} else {
				int dengji = n / 10;
				if(dengji<6)
				{
					System.out.println("不及格");
				}
				else if (dengji<7 )
				{
					System.out.println("及格");
				}
				else if (dengji <8)
				{
					System.out.println("良");
				}
				else if(dengji<=10 && n<=100)
				{
					System.out.println("优");
				}
				else 
				{
					System.out.println("智商爆表");
				}
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
