package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Mateen", "Rafiq", "BestCustomer123");
        Customer customer2 = new Customer("Rodney", "Muyanga", "RichCustomer123");
        customers.add(customer1);
        customers.add(customer2);
        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer i : customers) {
            System.out.println(i);
        }
    }
}




