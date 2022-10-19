import java.util.ArrayList;

public class ValidateCustomer {
    public boolean isCustomer(String nameOrId, ArrayList<Customer> allCustomers){
        boolean isCustomer = false;
        for (int i = 0; i < allCustomers.size(); i++) {
            if (nameOrId.equals((allCustomers.get(i)).getName()) || nameOrId.equals((allCustomers.get(i)).getId())){
                isCustomer = true;
            }
        }
        return isCustomer;
    }
    public int getCustomerIndex(String nameOrId, ArrayList<Customer> allCustomers) {
        int customerIndex = -1;
        for (int i = 0; i < allCustomers.size(); i++) {
            if (nameOrId.equals((allCustomers.get(i)).getName()) || nameOrId.equals((allCustomers.get(i)).getId())) {
                customerIndex = (i);
            }
        }
        return customerIndex;
    }
}
