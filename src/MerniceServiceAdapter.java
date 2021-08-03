
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
public class MerniceServiceAdapter implements ICustomerCheckService {
	

	@Override
	public boolean CheckIfRealPerson(Customer customer)throws NumberFormatException, RemoteException{
		KPSPublicSoapProxy consumer=new KPSPublicSoapProxy();
		boolean results= consumer.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName().toUpperCase(), 
				customer.getLastName().toUpperCase(),customer.getDateOfTime());
		if (results==true) {
            System.out.println("Ba�ar�l� Do�rulama !!!");

        }else {
            System.out.println("Ba�ar�s�z Do�rulama !!!");
        }
        return results;
	}

}
