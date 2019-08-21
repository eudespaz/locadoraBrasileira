package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerday;
	private Double pricePerHour;

	private BrazilTaxService taxService;
	
	public RentalService() {
	}

	public RentalService(Double pricePerday, Double pricePerHour, BrazilTaxService taxService) {
		this.pricePerday = pricePerday;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double horas = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double basicPayment;
		if (horas <= 12.0) {
			basicPayment = Math.ceil(horas) * pricePerHour;		
		}
		else {
			basicPayment = Math.ceil(horas / 24) * pricePerday;
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}

}
