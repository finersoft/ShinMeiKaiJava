package com.finersoft.car2;


import com.finersoft.day5.Day;
/**
 * 名称：汽车类【第2版】的使用示例（其２）
 * 说明：
 * @author Finersoft
 * @date 2018年3月22日
 */
class CarTester2 {

	public static void main(String[] args) {
		Car myCar = new Car("爱车", 1885, 1490, 5220, 90.0, new Day(2000, 11, 18));

		myCar.putSpec();
		System.out.println("购买日期：" + myCar.getPurchaseDay().toString());
	}
}
