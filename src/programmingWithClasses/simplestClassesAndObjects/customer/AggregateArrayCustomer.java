package programmingWithClasses.simplestClassesAndObjects.customer;

import java.util.Arrays;
import java.util.Comparator;

public class AggregateArrayCustomer {
    private Customer[] customers;

    public AggregateArrayCustomer(Customer[] customers) {
        this.customers = customers;
    }

    public void buyersAlphabetical(){
        Arrays.sort(customers, Comparator.comparing(Customer::getLastName).
                thenComparing(Customer::getFirstName).thenComparing(Customer::getPatronymic));
        for (Customer k : customers) {
            System.out.println(k);
        }
    }
     public void cardNumberInterval(int start, int end){
         for (Customer k : customers) {
             if (k.getCreditCardNumber()>=start&&k.getCreditCardNumber()<=end){
                 System.out.println(k);
             }
         }
     }


}
