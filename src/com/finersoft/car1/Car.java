package com.finersoft.car1;



/**
 * 名称：汽车类【第1版】<br/>
 * 说明：<br/>
 * @author Finersoft
 * @date 2018年4月11日
 */
class Car {
		// 名称
	private String name;
	// 宽度
	private int width;		
	// 高度
	private int height;		
	// 长度
	private int length;		
		// 当前位置的Ｘ坐标
	private double x;	
		// 当前位置的Ｙ坐标
	private double y;	
	// 剩余燃料
	private double fuel;	

	
	/**
	 * 构造函数
	 * @param name
	 * @param width
	 * @param height
	 * @param length
	 * @param fuel
	 */
	Car(String name, int width, int height, int length, double fuel) {
		this.name = name;			this.width = width;		this.height = height;
		this.length = length;	this.fuel = fuel;
		x = y = 0.0;
	}
	// 获取当前位置的Ｘ坐标
	double getX() { return x; }		
	// 获取当前位置的Ｙ坐标
	double getY() { return y; }			
	// 获取剩余燃料
	double getFuel() { return fuel; }	


	/**
	 *  显示型号 
	 */
	void putSpec() {
		System.out.println("名称：" + name);
		System.out.println("车宽：" + width  + "mm");
		System.out.println("车高：" + height + "mm");
		System.out.println("车长：" + length + "mm");
	}


	/**向Ｘ方向移动dx、向Ｙ方向移动dy 
	 * @param dx
	 * @param dy
	 * @return
	 */
	boolean move(double dx, double dy) {
		// 移动距离
		double dist = Math.sqrt(dx * dx + dy * dy);	
		// 无法移动　… 燃料不足
		if (dist > fuel) {
			return false;
		}
		else {
			// 减掉移动距离所消耗的燃料
			fuel -= dist;				
			x += dx;
			y += dy;
			// 移动结束
			return true;			
		}
	}
}
