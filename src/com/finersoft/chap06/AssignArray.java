package com.finersoft.chap06;

/**
 * 名称：数组的赋值（错误）<br/>
 * 说明：<br/>
 * @author Finersoft
 * @date 2018年4月11日
 */
class AssignArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 5, 4, 3, 2, 1, 0};
	// 显示数组a中的全部元素
		System.out.print("a = ");		
		for (int i = 0; i < a.length; i++)
		{	System.out.print(a[i] + " ");}
		System.out.println();
	// 显示数组b中的全部元素
		System.out.print("b = ");		
		for (int i = 0; i < b.length; i++)
		{	System.out.print(b[i] + " ");}
		System.out.println();
		// 将数组a复制到b（？）
		b = a;				
// 改写数组a[0]的值
		a[0] = 10;				

		System.out.println("将a赋给了b。 ");
		// 显示数组a中的全部元素
		System.out.print("a = ");			
		for (int i = 0; i < a.length; i++)
			{System.out.print(a[i] + " ");}
		System.out.println();
	// 显示数组b中的全部元素
		System.out.print("b = ");		
		for (int i = 0; i < b.length; i++)
		{	System.out.print(b[i] + " ");}
		System.out.println();
	}
}
