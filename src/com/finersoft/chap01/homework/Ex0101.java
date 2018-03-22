package com.finersoft.chap01.homework;

/**
 * 名称：作业1-1 说明：让写程序试验一下没有分号结尾的语句
 * 
 * @author Finersoft
 * @date 2018年3月22日
 */
public class Ex0101{

	public static void main(String[] args) {
		// 下面语句没有分号结尾，然后他被编译器抓起来打了一顿
		/*
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
		 * Syntax error, insert ";" to complete BlockStatements
		 * 
		 * at com.finersoft.chap01.homework.ex01.main(ex01.java:13)
		 */
		// System.out.println("我没有分号，你能拿我怎样")

		System.out.println("规范代码，从我做起");
	}

}
