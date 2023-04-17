package com.jinhwanB.exer;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		return width * height;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")" + "에서 크기가 " + width + "x" + height + "인 사각형");
	}
	
	public boolean contains(Rectangle r) {
		boolean isRight = false;
		if (r.x >= x && r.y >= y) {
			isRight = true;
		}
		return isRight == false ? false :
			r.x + r.width < x + width && r.y + r.height < y + height ? true : false;
	}
	
}
