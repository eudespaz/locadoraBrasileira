package model.services;

import model.entities.CarRental;

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
	
	
	public Double getPricePerday() {
		return pricePerday;
	}

	public void setPricePerday(Double pricePerday) {
		this.pricePerday = pricePerday;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public BrazilTaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		
	}
	
	
	
	
	
}
