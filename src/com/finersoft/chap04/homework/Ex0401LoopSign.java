package com.finersoft.chap04.homework;

import java.util.Scanner;

/**
 * 名称：循环读取用户输入数字，输出用户的输入数字的符号<br/>
 * 说明：<br/>
 * 
 * @author Finersoft
 * @date 2018年5月4日
 */
public class Ex0401LoopSign {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean bContinue = true;
		try {
			while (bContinue) {
				System.out.print("请输入一个整数值，我来判断这个整数值的符号：");
				int n = stdIn.nextInt();
				if (n > 0) {
					System.out.println("该值为正。");
				} else if (n < 0) {
					System.out.println("该值为负。");
				} else {
					System.out.println("该值为0。");
				}
				System.out.println("是否继续（0退出，1继续）？");
				int flag = stdIn.nextInt();
				if(flag ==0)
				{
					bContinue = false;
					System.out.println("收到退出指令，程序结束。");
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
