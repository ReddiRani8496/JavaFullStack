package training.iqgateway.business.impl;

import training.iqgateway.business.CurrencyConverter;

public class CurrencyConverterImpl implements CurrencyConverter {
	
	private Customer customerRef;
	
	public CurrencyConverterImpl() {
		System.out.println("Default constructor called");
	}

	public CurrencyConverterImpl(Customer customerRef) {
		super();
		System.out.println("parameterised constructor called");
		this.customerRef = customerRef;
	}
	
	

	public Customer getCustomerRef() {
		return customerRef;
	}



	public void setCustomerRef(Customer customerRef) {
		System.out.println("customer setter method in currency convertor");
		this.customerRef = customerRef;
	}



	@Override
	public String dollarToRS(double dollars) {
		// TODO Auto-generated method stub
		double result = 73.78 * dollars;
		return "Hey, " + customerRef.getName()+"Your currency converted value is " + result;
	}

	@Override
	public String poundsToRS(double pounds) {
		double result = 53.78 * pounds;
		return "Hey, " + customerRef.getName()+"Your currency converted value is " + result;
	}

	@Override
	public String eurosToRS(double euros) {
		double result = 43.78 * euros;
		return "Hey, " + customerRef.getName()+"Your currency converted value is " + result;
	}

	@Override
	public String riyalsToRS(double riyals) {
		double result = 63.78 * riyals;
		return "Hey, " + customerRef.getName()+"Your currency converted value is " + result;
	}

	@Override
	public String pesosToRS(double pesos) {
		double result = 23.78 * pesos;
		return "Hey, " + customerRef.getName()+"Your currency converted value is " + result;
	}

}
