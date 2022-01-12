package main;

import java.util.HashSet;
import java.util.Set;

public class Client {
   private final String name;
   private int age;
   private Set<Account> accountsList = new HashSet<>();

   public Client(String name, int age) {
      this.name = name;
      this.age = age;
   }

   void addAccount(Account a) {
      accountsList.add(a);
   }

   Set<Account> getAccountsList() {
      return accountsList;
   }



   @Override
   public String toString() {
      return
              "name='" + name + '\'' +
              ", age=" + age;
   }
}
