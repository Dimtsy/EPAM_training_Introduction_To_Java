package programmingWithClasses.aggregationAndComposition.bank;

import java.util.ArrayList;
import java.util.Comparator;

public class Transactions {
    private ArrayList<Client> clients;

    public Transactions(ArrayList<Client> clients) {
        this.clients = clients;
    }



    public void onOfAccount(int numberAccount, boolean onOf ){
        clients.forEach(p->p.getClientAccounts().forEach(c->{if(c.getNumberAccount()==numberAccount){
            c.setOnOf(onOf);
        }}));
    }

    public void findAccount(int numberAccount){
        clients.forEach(p->p.getClientAccounts().forEach(c->{if(c.getNumberAccount()==numberAccount){
            System.out.println(p.getName()+" "+p.getLastName());
            System.out.println(c);
        }}));
    }
    public void sortAccount(int clientId){
        clients.forEach(c->{if(c.getClientId()==clientId){
            c.getClientAccounts().sort(Comparator.comparing(Account::getNumberAccount));
            c.getClientAccounts().forEach(System.out::println);
        }});

    }
    public void allBalanceClient(int clientId){
        clients.forEach(c->{if(c.getClientId()==clientId){
            double summa=0;
            for (int i = 0; i < c.getClientAccounts().size(); i++) {
                summa += c.getClientAccounts().get(i).getBalance();
            }
            System.out.println("Сумма по всем счетам клиента clientID "+clientId+" = "+summa+ " $");
        }});
    }
    public void allBalancePositiveNegative(int clientId){
        clients.forEach(c->{if(c.getClientId()==clientId){
            double summaPositive=0;
            double summaNegative=0;
            for (int i = 0; i < c.getClientAccounts().size(); i++) {
                if (c.getClientAccounts().get(i).getBalance()>=0){
                    summaPositive += c.getClientAccounts().get(i).getBalance();
                }else {
                    summaNegative += c.getClientAccounts().get(i).getBalance();
                }
            }
            System.out.println("Сумма по всем положительным счетам клиента clientID "+clientId+" = "+summaPositive+ " $"+
                    "\n отрицательным = "+summaNegative);
        }});
    }
}
