package interfaceAbstractDemo;

public class NeroCustomerManager implements NeroCustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanýna kaydedildi "  + customer.getFirstName());

	}

}
