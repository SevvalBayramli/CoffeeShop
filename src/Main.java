import java.rmi.RemoteException;



public class Main {
	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Customer customer=new Customer(24764140536L, "�EVVAL", "BAYRAMLI", 2002);
		customer.setDateOfTime(2002);
		customer.setFirstName("�EVVAL");
		customer.setLastName("BAYRAMLI");
		customer.setNationalityId(24764140536L);
		
		BaseCustomerManager customerManager =new StarbucksCustomerManager(new MerniceServiceAdapter());
				customerManager.Save(new Customer(24764140536L, "BAYRAMLI","�EVVAL",2002));
		
	}

}
