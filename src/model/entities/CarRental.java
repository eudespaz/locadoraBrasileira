package model.entities;

import java.util.Date;

public class CarRental {
	
	private Date start;
	private Date Finish;
	
	private Veiculos veiculos;
	private Invoice invoice;
	
	
	
public CarRental(){
}

public CarRental(Date start, Date finish, Veiculos veiculos) {
	super();
	this.start = start;
	Finish = finish;
	this.veiculos = veiculos;
}



public Date getStart() {
	return start;
}



public void setStart(Date start) {
	this.start = start;
}



public Date getFinish() {
	return Finish;
}



public void setFinish(Date finish) {
	Finish = finish;
}



public Veiculos getVeiculos() {
	return veiculos;
}



public void setVeiculos(Veiculos veiculos) {
	this.veiculos = veiculos;
}



public Invoice getInvoice() {
	return invoice;
}



public void setInvoice(Invoice invoice) {
	this.invoice = invoice;
}

}
