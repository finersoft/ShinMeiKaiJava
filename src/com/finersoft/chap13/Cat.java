package com.finersoft.chap13;

//--- 猫类 ---//
public class Cat extends Animal {
	private int age; // 年龄

	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.finersoft.chap13.Animal#bark()
	 */
	@Override
	public void bark() {
		System.out.println("喵!!");
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return age + "岁的" + getName();
	}
}
