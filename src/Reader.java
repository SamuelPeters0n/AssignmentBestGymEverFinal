import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public ArrayList<Customer> createCustomerArrayList(String fileName) {
        try {
            Scanner scan = new Scanner(new FileReader(fileName));
            ArrayList<Customer> Customers = new ArrayList<>();

            while (scan.hasNext()) {
                String IdAndName = scan.nextLine();
                String Id = IdAndName.substring(0, IdAndName.indexOf(','));
                String name = IdAndName.substring(IdAndName.indexOf(',') + 2);
                String lastPaid = scan.nextLine();
                Customers.add(new Customer(Id, name, lastPaid));
            }

            return Customers;

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        return null;
    }
}
