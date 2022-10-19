import org.testng.annotations.Test;

import java.util.ArrayList;

public class ValidateCustomerTest {

    ValidateCustomer vCTest = new ValidateCustomer();

    @Test
    public void isCustomerTest() {
        ArrayList<Customer> allCustomersTest = new ArrayList<>();
        allCustomersTest.add(new Customer("7502031234", "Anna Andersson", "2022-05-03"));
        allCustomersTest.add(new Customer("8505132345", "Per Persson", "2019-12-29"));

        String customerName = "Anna Andersson";
        String customerId = "8505132345";
        String wrongName = "TEST";
        String wrongId = "TEST";

        assert (vCTest.isCustomer(customerName, allCustomersTest));
        assert (vCTest.isCustomer(customerId, allCustomersTest));
        assert(!vCTest.isCustomer(wrongName, allCustomersTest));
        assert(!vCTest.isCustomer(wrongId, allCustomersTest));
    }
    @Test
    public void getCustomerIndexTest(){
        ArrayList<Customer> allCustomersTest = new ArrayList<>();
        allCustomersTest.add(new Customer("7502031234", "Anna Andersson", "2022-05-03"));
        allCustomersTest.add(new Customer("8505132345", "Per Persson", "2019-12-29"));

        String customerName = "Anna Andersson";
        String customerId = "8505132345";
        String wrongName = "TEST";
        String wrongId = "TEST";

        assert (vCTest.getCustomerIndex(customerName, allCustomersTest) == 0);
        assert (vCTest.getCustomerIndex(customerId, allCustomersTest) == 1);
        assert (vCTest.getCustomerIndex(wrongName, allCustomersTest) == -1);
        assert (vCTest.getCustomerIndex(wrongId, allCustomersTest) == -1);


    }
}
