import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.Objects;

public class CustomerTest {


    @Test
    public void isActiveCustomerTest() {
        Customer activeCustomer = new Customer("3456721", "Kalle", LocalDate.now().toString());
        Customer nonactiveCustomer = new Customer("456789", "Pelle", LocalDate.now().minusYears(10).toString());

        assert (activeCustomer.isActiveCustomer());
        assert (!nonactiveCustomer.isActiveCustomer());
    }
    @Test
    public void getMessageTest(){
        Customer activeCustomer = new Customer("3456721", "Kalle", LocalDate.now().toString());
        Customer nonactiveCustomer = new Customer("456789", "Pelle", LocalDate.now().minusYears(10).toString());

        String rightMessageForActiveCustomer = "Kalle has an active/paid membership.";
        String rightMessageForNonActiveCustomer  = "Pelle has a nonactive/unpaid membership.";
        String wrongMessage = "efewrfgsef";

        assert (Objects.equals(activeCustomer.getMessage(true), rightMessageForActiveCustomer));
        assert (Objects.equals(nonactiveCustomer.getMessage(false), rightMessageForNonActiveCustomer));
        assert (!(Objects.equals(activeCustomer.getMessage(true), wrongMessage)));
        assert (!(Objects.equals(nonactiveCustomer.getMessage(false), wrongMessage)));
    }
}
