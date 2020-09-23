package com.db.billingservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BillTestCase {
	@InjectMocks
	BillImpl bill = new BillImpl();
	
	@Mock
	IBill biller;
	
	@Test
	public void testBillImp() {
		when(biller.calculateBill(10.0, 20.0, 30.0, 40.0)).thenReturn(100.0);
		bill.setItems(10.0, 20.0, 30.0, 40.0);
		System.out.println(bill.printBill(biller));
	}

}
