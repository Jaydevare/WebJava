package com.app;

public class Date 
{
	int dd,mm,yy;
	
	public Date() {}

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	
}
