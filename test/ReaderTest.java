import org.testng.annotations.Test;
import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;


public class ReaderTest {

    Reader rTest = new Reader();

    @Test
    public void createCustomerArrayListTest() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("7502031234", "Anna Andersson", "2022-05-03"));
        customers.add(new Customer("8505132345", "Per Persson", "2019-12-29"));

        ArrayList<Customer> customers2 = rTest.createCustomerArrayList("test/CustomersTest.txt");
        System.out.println(customers);
        System.out.println(customers2);


        assertEquals(customers,customers2);




    }
}
