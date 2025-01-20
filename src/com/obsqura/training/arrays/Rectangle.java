package com.obsqura.training.arrays;

class Rectangle extends Shape{
	void row() {
		System.out.println("This is rectangle");
		super.row();
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.row();

	}
}