package com.finersoft.chap05;
// 以0.001为单位从0.0递增至1.0，并显示合计值（用float控制循环）

class FloatSum1 {
public static float MILLESIMAL= 0.001F;
public static float ONE_TENTH=1.0F;
public static float ZERO= 0.0F;
	public static void main(String[] args) {
		float sum = 0.0F;

		for (float x =ZERO; x <= ONE_TENTH; x +=MILLESIMAL) {
			System.out.println("x = " + x);
			sum += x;
		}
		System.out.println("sum = " + sum);
	}
}
