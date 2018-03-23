package com.finersoft.chap02;

import java.util.Random;

/**
 * 名称： <br />
 * 说明：随机生成并显示一个0～9的幸运数字
 * 
 * @author Finersoft
 * @date 2018年3月23日
 */
class LuckyNo {

	public static void main(String[] args) {
		Random rand = new Random();
		// 0～9的随机数
		int lucky = rand.nextInt(10);

		System.out.println("今天的幸运数字是" + lucky + "。");
	}
}
