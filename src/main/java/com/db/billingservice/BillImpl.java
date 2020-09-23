package com.db.billingservice;

public class BillImpl {
	double i1,i2,i3,i4;
	public double printBill(IBill biller) {
		return biller.calculateBill(i1, i2, i3, i4);
	}
	
	public void setItems(double i1, double i2, double i3, double i4) {
		this.i1 = i1;
		this.i2 = i2;
		this.i3 = i3;
		this.i4 = i4;
	}
}
