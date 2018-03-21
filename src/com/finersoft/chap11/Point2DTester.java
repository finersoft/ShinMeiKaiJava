package com.finersoft.chap11;


import  com.finersoft.chap11.point.Point2D;

/**
 * 名称：--- 测试二维坐标类 ---
 * 说明：
 * @author Finersoft
 * @date 2018年3月21日
 */
public class Point2DTester {

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D(10, 15);

		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
	}
}
