package deveshjdbc;

import java.util.List;

public interface CustDao {

	public Customer findCustomerById(int id);

	public String set(Customer c);

	public String delete(int customerId);

	public List<Customer> listAll();

}
