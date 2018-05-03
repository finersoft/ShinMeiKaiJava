//--- 二维坐标类 ---//

package com.finersoft.chap11.point;

public class Point2D {
	private int x = 0; // Ｘ坐标
	private int y = 0; // Ｙ坐标

	public Point2D() {
	}

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point2D(Point2D p) {
		this(p.x, p.y);
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
