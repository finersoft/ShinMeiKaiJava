package com.finersoft.chap09;

//--- 二维坐标类 ---//
public class Point2D {
	private int x = 0; // Ｘ坐标
	private int y = 0; // Ｙ坐标

	public Point2D() {
	}

	public Point2D(int x, int y) {
		set(x, y);
	}

	public Point2D(Point2D p) {
		this(p.x, p.y);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void set(int x, int y) {
		setX(x);
		setY(y);
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
