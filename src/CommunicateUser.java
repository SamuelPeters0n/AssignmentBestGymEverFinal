import javax.swing.*;
import java.util.ArrayList;

public class CommunicateUser {
    public String askUserForNameOrId(){

        String nameOrId =  JOptionPane.showInputDialog(
                "Enter social security number or full name please:");
        return nameOrId.trim();
    }
    public void answerUser(boolean inputIsCustomer, String userInput, ArrayList<Customer> allCustomers, int customerIndex){
        if (inputIsCustomer) {
            Customer inputCustomer = allCustomers.get(customerIndex);
            JOptionPane.showMessageDialog(null, inputCustomer.getMessage(inputCustomer.isActiveCustomer()));
        }
        else {
            JOptionPane.showMessageDialog(null,"\"" + userInput+ "\"" + " does not have any membeship.");
        }
    }
}
