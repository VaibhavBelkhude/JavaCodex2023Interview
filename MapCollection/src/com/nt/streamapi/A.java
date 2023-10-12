package com.nt.streamapi;

public class A {
	int i;
	int j;
	
	
	
	public A(int i, int j) {
		
		this.i = i;
		this.j = j;
	}


	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}

}
