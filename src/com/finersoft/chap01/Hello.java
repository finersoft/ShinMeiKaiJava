package com.finersoft.chap01;

/**
 * 名称：在画面上进行输出的程序
 * 说明：
 * @author Finersoft
 * @date 2018年3月21日
 */
public class Hello {

	public static void main(String[] args) {
		//单行注释，用于说明一条语句的作用，一般放在行尾。
		//但是阿里规范认为应该要放在代码行上面
		System.out.println("第一个Java程序。");
		/*传统注释，兼容c语言的注释*/
		/* 当传统注释一行写不下的时候
		 * 也可以换行
		 * 这也就是为什么它叫做多行注释的原因
		 * */
		System.out.println("输出到画面上。");
	}
}
