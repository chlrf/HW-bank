package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW_bank implements Bank {
    Map<Account, Client> map = new HashMap<>();

    @Override
    public void add(Client client, Account account) {
        if (!Account.getListOfAllAccountIDs().contains(account.getAccID())) {
            account.addAccToSet(account.getAccID());
            map.put(account, client);
            client.addAccount(account);
        }
    }

    @Override
    public Set<Account> getAccounts(Client client) {
        return client.getAccountsList();
    }

    @Override
    public Client findClient(Account account) {
        return map.get(account);
    }

    public static void main(String[] args) {
        Client clientA = new Client("Ivan", 23);
        Client clientB = new Client("Sergey", 31);

        Account account1 = new Account(111, 5000);
        Account account2 = new Account(222, 7000);
        Account account3 = new Account(333, 3500);
        Account account4 = new Account(444, 9900);
        Account account5 = new Account(111, 6300);

        HW_bank bank = new HW_bank();

        bank.add(clientA, account1);
        bank.add(clientA, account3);
        bank.add(clientB, account2);
        bank.add(clientB, account3);
        bank.add(clientB, account4);
        bank.add(clientA, account4);
        bank.add(clientA, account5);

        System.out.print("Счета клиента " + clientA + ": \n");
        System.out.println(bank.getAccounts(clientA));

        System.out.println();

        System.out.print("Счета клиента " + clientB + ": \n");
        System.out.println(bank.getAccounts(clientB));

        System.out.println();

        System.out.print("Клиент со счетом 444: ");
        System.out.println(bank.findClient(account4));
    }
}