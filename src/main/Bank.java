package main;


import java.util.Set;

public interface Bank {
    void add(Client client, Account account);
    Set<Account> getAccounts(Client client);
    Client findClient(Account account);
}
