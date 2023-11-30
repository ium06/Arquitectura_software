package org.sisoftware;

public class Square extends Shape {

	private int side;
	public Square(int side) {
		this.side = side;
	}

	public void setSide(int side) {
		setWidth(side);
		setHeight(side);
	}

	@Override
	public int getWidth() {
		return 0;
	}

	@Override
	public void setWidth(int width) {
		setSide(width);
	}

	@Override
	public int getHeight() {
		return 0;
	}

	@Override
	public void setHeight(int height) {
		setSide(height);
	}

	@Override
	public int computeArea() {
		return side * side;
	}
}
