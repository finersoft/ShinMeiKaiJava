package com.finersoft.chap14;

//--- 可穿戴的计算机 类 ---//
public class WearableComputer implements Wearable {
	private String name; // 名称

	public WearableComputer(String name) {
		this.name = name;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.finersoft.chap14.Wearable#putOn()
	 */
	@Override
	public void putOn() {
		System.out.println(name + " ON!!");
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.finersoft.chap14.Wearable#putOff()
	 */
	@Override
	public void putOff() {
		System.out.println(name + " OFF!!");
	}
}
