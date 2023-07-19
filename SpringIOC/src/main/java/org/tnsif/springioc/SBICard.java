package org.tnsif.springioc;

public class SBICard implements DebitCard {

	@Override
	public void deposit() {
		System.out.println("depositing an amount of 1 lakh rupees");
		
	}

	@Override
	public void withdraw() {
		System.out.println("depositing an amount of 20 thousand rupees");
		
	}

}
