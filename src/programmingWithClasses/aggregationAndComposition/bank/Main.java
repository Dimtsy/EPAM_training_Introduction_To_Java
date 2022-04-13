package programmingWithClasses.aggregationAndComposition.bank;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Account> vasiliev = new ArrayList<>();
        vasiliev.add(new Account(150,1237,false));
        vasiliev.add(new Account(1000,1234,true));
        vasiliev.add(new Account(-30,1235,true));
        vasiliev.add(new Account(40,1236,true));
        vasiliev.add(new Account(0,1238,true));
        vasiliev.add(new Account(-200,1239,true));

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client(1,"Vasia","Vasiliev",vasiliev));

        Transactions transactions = new Transactions(clients);
        transactions.allBalanceClient(1);
        transactions.allBalancePositiveNegative(1);
        System.out.println("Сортировка по номерам счетов клиената");
        transactions.sortAccount(1);
        System.out.println("Блокировка счета");
        transactions.onOfAccount(1238,false);
        System.out.println("Сортировка по номерам счетов клиената");
        transactions.sortAccount(1);
    }
}
