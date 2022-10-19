import java.util.ArrayList;

public class MainProgram {
    public void mainProgramU() {
        CommunicateUser askAndAnswer = new CommunicateUser();
        String userInput = askAndAnswer.askUserForNameOrId();

        Reader read = new Reader();
        ArrayList<Customer> allCustomers = read.createCustomerArrayList("src/Coustomers.txt");


        ValidateCustomer vC = new ValidateCustomer();
        Boolean inputIsCustomer = vC.isCustomer(userInput, allCustomers);
        int customerIndex = vC.getCustomerIndex(userInput, allCustomers);

        askAndAnswer.answerUser(inputIsCustomer,userInput, allCustomers, customerIndex);

        Printer print = new Printer();
        print.printForPersonalTrainer(inputIsCustomer, customerIndex, allCustomers, false);



    }
}
