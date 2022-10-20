
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Printer {


    public void printForPersonalTrainer(boolean isCustomer, int customerIndex, ArrayList<Customer> allCustomers, boolean test) {
        if (test){
            try {
                String fileName = "test/CustomerTrainingDateHistoryForPrivateTrainerTEST.txt";

                BufferedWriter print = new BufferedWriter(new FileWriter(fileName, false));
                print.write("");


                BufferedWriter print2 = new BufferedWriter(new FileWriter(fileName, true));
                Customer inputCustomer = allCustomers.get(customerIndex);
                print.write("Date of session: " + LocalDate.now() + ". Name: " + inputCustomer.getName()
                        + ". Id: " + inputCustomer.getId());
                print.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }
        else if (isCustomer) {
            try {
                String fileName = "src/CustomerTrainingDateHistoryForPrivateTrainer.txt";
                BufferedWriter print = new BufferedWriter(new FileWriter(fileName, true));
                Customer inputCustomer = allCustomers.get(customerIndex);
                print.write("Date of session: " + LocalDate.now() + ". Name: " + inputCustomer.getName()
                        + ". Id: " + inputCustomer.getId() + "\n");
                print.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
