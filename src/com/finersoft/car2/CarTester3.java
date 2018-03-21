package com.finersoft.car2;



import java.util.Scanner;
import com.finersoft.day5.Day;
/**
 * 名称：汽车类【第2版】的使用示例（其３）
 * 说明：
 * @author Finersoft
 * @date 2018年3月22日
 */
class CarTester3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("请输入汽车数据。");
		System.out.print("名称：");			String name = stdIn.next();
		System.out.print("车宽：");			int width = stdIn.nextInt();
		System.out.print("高度：");			int height = stdIn.nextInt();
		System.out.print("长度：");			int length = stdIn.nextInt();
		System.out.print("燃料数量：");     double fuel = stdIn.nextDouble();
		System.out.print("购买年份：");		int y = stdIn.nextInt();
		System.out.print("购买月份：");		int m = stdIn.nextInt();
		System.out.print("购买日期：");		int d = stdIn.nextInt();

		Car car2 = new Car(name, width, height, length, fuel, new Day(y, m, d));

		car2.putSpec();
		System.out.println("购买日期：" + car2.getPurchaseDay());
	}
}

