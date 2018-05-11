package com.finersoft.chap05;
// 以0.001为单位从0.0递增至1.0，并显示合计值（用int控制循环）

class FloatSum2 {
	public static final int ONE_THOUSAND = 1000;
	public static void main(String[] args) {
		float sum = 0.0F;

		for (int i = 0; i <= ONE_THOUSAND; i++) {
			float x = (float)i / ONE_THOUSAND;
			System.out.println("x = " + x);
			sum += x;
		}
		System.out.println("sum = " + sum);
	}
}
