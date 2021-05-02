package interfaceAbstractDemo;

public class StarbucksCustomerManager implements StarbucksCustomerService{


	@Override
	public boolean control(Customer customer) {
		if(customer.getFirstName().length() >= 2 && customer.getLastName().length() >= 2 && customer.getNationalityId().length() == 11 &&
			customer.getBirthYear() < 2003	) {
			
			System.out.println("Do�rulama ba�ar�l�");
			return true;
			
		}else {
			System.out.println("Do�rulama ba�ar�s�z");
			return false;
		}
		
	}

	@Override
	public void save(Customer customer) {
		System.out.println("Veritaban�na kaydedildi: " + customer.getFirstName());
		
	}


}
