import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {

    private String Id;
    private String name;
    private String lastPaid;


    @Override
    public boolean equals(Object obj) {

        if (obj != null && obj instanceof Customer) {
            Customer customer = (Customer) obj;
            if (customer.getName().equals(this.name) && customer.getId().equals(this.Id) && customer.getLastPaid().equals(this.lastPaid)) {
                return true;
            }
        }
        return false;
    }

    public String getMessage(boolean isActiveCustomer) {
        String message;
        if (isActiveCustomer) {
            message = this.getName() + " has an active/paid membership.";
        } else {
            message = this.getName() + " has a nonactive/unpaid membership.";
        }
        return message;

    }

    public boolean isActiveCustomer() {
        LocalDate lastpaid = LocalDate.parse((this.getLastPaid()));
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        boolean isActiveCustomer = true;
        if (lastpaid.isBefore(oneYearAgo)) {
            isActiveCustomer = false;
        }
        return isActiveCustomer;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "socialSecurityNumber='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", lastPaid='" + lastPaid + '\'' +
                '}';
    }

    public Customer(String Id, String name, String lastPaid) {
        this.Id = Id;
        this.name = name;
        this.lastPaid = lastPaid;
    }

    public String getId() {
        return Id;
    }

    public String getLastPaid() {
        return lastPaid;
    }

    public String getName() {
        return name;
    }
}

