package main;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Account {
    private final int accID;
    private int balance;
    private static Set<Integer> listOfAllAccountIDs = new HashSet<>();

    public Account(int accID, int balance) {
        this.accID = accID;
        this.balance = balance;
    }

    int getAccID() {
        return accID;
    }

    void addAccToSet(int accID) {
        listOfAllAccountIDs.add(accID);
    }

    static Set<Integer> getListOfAllAccountIDs() {
        return listOfAllAccountIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accID == account.accID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accID);
    }

    @Override
    public String toString() {
        return "{" +
                "accID=" + accID +
                ", balance=" + balance +
                '}';
    }
}
