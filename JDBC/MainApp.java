package deveshjdbc;

import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		CustDao details=new CustDaoImpl();
		Customer c=details.findCustomerById(001);
        System.out.println(c);
        
        System.out.println("___________******_____________-");
        
        System.out.println(details.set(new Customer(34,"Devesh","Sikandrabad",5436,86000)));
        
        System.out.println("___________*******_____________");
        
        System.out.println(details.delete(5));
        
        System.out.println("____________******____________");
        
        List<Customer> lst=details.listAll();
        for(Customer cus:lst)
        {
        	System.out.println(cus);
        }
	}

}
