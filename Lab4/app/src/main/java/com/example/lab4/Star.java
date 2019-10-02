package com.example.lab4;

public class Star extends Shape {
	private int sides = 0;
	public Star(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		sides = x + y;
	}
}
