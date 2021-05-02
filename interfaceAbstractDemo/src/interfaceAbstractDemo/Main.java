package interfaceAbstractDemo;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Furkan");
		customer1.setLastName("Ýþcan");
		customer1.setNationalityId("12345678900");
		customer1.setBirthYear(1453);
		
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setFirstName("Abdülcabbar");
		customer2.setLastName("Hoþgeldin");
		customer2.setNationalityId("123456789");
		customer2.setBirthYear(2004);
		
		
		CustomerManager customerManager1 = new CustomerManager();
		customerManager1.save(customer1);
		CustomerManager customerManager2 = new CustomerManager();
		customerManager2.save(customer2);
		
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager();
		starbucksCustomerManager.control(customer1);
		starbucksCustomerManager.control(customer2);
	}

}
