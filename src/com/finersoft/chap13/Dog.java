package com.finersoft.chap13;

//--- 狗类 ---//
public class Dog extends Animal {
	private String type; // 狗的品种

	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}

	/** (non-Javadoc)
	 * @see com.finersoft.chap13.Animal#bark()
	 */
	@Override
	public void bark() {
		System.out.println("汪汪!!");
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return type + "的" + getName();
	}
}
