package coffeeShops;


import java.time.LocalDate;
import java.util.Date;
import abstracts.*;
import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapters;
import concrete.NeroCustomerManager;
import concrete.StarbuckCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdapters());
/*	Customer customer = new Customer(1,"furkan","ozan",1997,(long) 123456789);*/
		customerManager.save(new Customer((long) 123456789,"furkan","ozan",1997));
				

	}

}
