import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class PrinterTest {


    Printer printTest = new Printer();

    @Test
    public void printForPrivateTrainerTest() throws FileNotFoundException {
        Customer customer1 = new Customer("Test", "Test", null);
        Customer customer2 = new Customer("Test2", "Test2", null);

        ArrayList<Customer> allCustomersTest = new ArrayList<>();
        allCustomersTest.add(customer1);
        allCustomersTest.add(customer2);

        Scanner scan = new Scanner(new FileReader("test/CustomerTrainingDateHistoryForPrivateTrainerTEST.txt"));

        String messageAsString = null;
        String messageAsString2 = "Test";
        printTest.printForPersonalTrainer(true, 0, allCustomersTest,true);
        if (scan.hasNextLine()) {
            messageAsString = scan.nextLine();
        }

        printTest.printForPersonalTrainer(false, 1, allCustomersTest, true);
        if (scan.hasNextLine()) {
            messageAsString2 = scan.nextLine();
        }

        String desiredMessage = "Date of session: "+ LocalDate.now() + ". Name: Test. Id: Test";
        String desiredMessage2 = "Test";

        assert (messageAsString.equals(desiredMessage));
        assert (messageAsString2.equals((desiredMessage2)));
    }
}
