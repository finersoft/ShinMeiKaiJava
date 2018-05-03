package com.finersoft.chap14;
//--- 可穿戴的机器人 类 ---//
public class WearableRobot implements Color, Wearable {
	private int color;				// 颜色

	public WearableRobot(int color) { changeColor(color); }
	@Override
	public void changeColor(int color) { this.color = color; }

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		switch (color) {
		 case RED   : return "红色机器人";
		 case GREEN : return "绿色机器人";
		 case BLUE  : return "蓝色机器人";
		}
		return "机器人";
	}
	
	/** (non-Javadoc)
	 * @see com.finersoft.chap14.Wearable#putOn()
	 */
	@Override
	public void putOn() {
		System.out.println(toString() + " 戴上!!");
	}
	/** (non-Javadoc)
	 * @see com.finersoft.chap14.Wearable#putOff()
	 */
	@Override
	public void putOff() {
		System.out.println(toString() + " 摘下!!");
	}
}
