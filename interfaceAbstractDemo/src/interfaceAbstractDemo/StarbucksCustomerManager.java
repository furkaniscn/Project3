package interfaceAbstractDemo;

public class StarbucksCustomerManager implements StarbucksCustomerService{


	@Override
	public boolean control(Customer customer) {
		if(customer.getFirstName().length() >= 2 && customer.getLastName().length() >= 2 && customer.getNationalityId().length() == 11 &&
			customer.getBirthYear() < 2003	) {
			
			System.out.println("Doðrulama baþarýlý");
			return true;
			
		}else {
			System.out.println("Doðrulama baþarýsýz");
			return false;
		}
		
	}

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanýna kaydedildi: " + customer.getFirstName());
		
	}


}
