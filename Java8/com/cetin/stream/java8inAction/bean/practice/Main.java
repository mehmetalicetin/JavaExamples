package com.cetin.stream.java8inAction.bean.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactionList = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        /*Find all transactions in the year 2011 and sort them by value (small to high).*/
        System.out.println("Find all transactions in the year 2011 and sort them by value (small to high)");
        List<Transaction> sortedTransactionListByYear = transactionList.stream()
                                                                        .filter(x->x.getYear() == 2011)
                                                                        .sorted(Comparator.comparing(Transaction::getValue))
                                                                        .collect(Collectors.toList());
        sortedTransactionListByYear.forEach(System.out::println);

        /*What are all the unique cities where the traders work?*/
        System.out.println("What are all the unique cities where the traders work?");
        List<String> uniqueCityNames = transactionList.stream()
                                .map(trader ->trader.getTrader().getCity())
                                .distinct()
                                .collect(Collectors.toList());
        uniqueCityNames.forEach(System.out::println);

        /*Find all traders from Cambridge and sort them by name.*/
        System.out.println("Find all traders from Cambridge and sort them by name.");
        List<Trader> cambridgeTraders = transactionList.stream()
                                                        .map(transaction ->transaction.getTrader())
                                                        .filter(trader -> trader.getCity().equalsIgnoreCase("Cambridge"))
                                                        .distinct()
                                                        .sorted(Comparator.comparing(Trader::getName))
                                                        .collect(Collectors.toList());
        cambridgeTraders.stream().map(trader->trader.getName()).forEach(System.out::println);



        /*Return a string of all traders’ names sorted alphabetically.*/
        System.out.println("Return a string of all traders’ names sorted alphabetically.");
        String allTraderNames = transactionList.stream()
                                                     .map(transaction -> transaction.getTrader().getName())
                                                     .distinct()
                                                     .sorted()
                                                     .reduce("", (n1,n2) ->n1+n2);
        System.out.println("all traders’ names sorted alphabetically."+allTraderNames);
        /*Note that this solution isn’t very efficient (all Strings are repeatedly concatenated, which creates
          a new String object at each iteration). In the next chapter, you’ll see a more efficient solution
          that uses joining() as follows (which internally makes use of a StringBuilder):*/
        /*Are any traders based in Milan?*/
         allTraderNames = transactionList.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining());
        System.out.println("all traders’ names sorted alphabetically."+allTraderNames);


        System.out.println("Are any traders based in Milan?");
        Optional<Trader> anyTraderBasedMilan = transactionList.stream()
                                                        .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Milan"))
                                                        .map(transaction -> transaction.getTrader())
                                                        .findAny();
        boolean isBasedOnMilan = transactionList.stream()
                                            .anyMatch(t->t.getTrader().getCity().equalsIgnoreCase("Milan"));
        anyTraderBasedMilan.ifPresent(System.out::println);

        /*Print all transactions’ values from the traders living in Cambridge.*/
        System.out.println("Print all transactions’ values from the traders living in Cambridge.");
        transactionList.stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .map(transaction -> transaction.getValue())
                .collect(Collectors.toList()).forEach(System.out::println);

        /*What’s the highest value of all the transactions?*/
        System.out.println("What’s the highest value of all the transactions?");
        Optional<Transaction> maxValueOfTransaction1 = transactionList.stream().max(Comparator.comparing(Transaction::getValue));
        Optional<Integer> maxValueOfTransaction = transactionList.stream()
                                                                 .map(Transaction::getValue)
                                                                 .reduce(Integer::max);
        maxValueOfTransaction.ifPresent(v->System.out.println("Highest value of all the transactions:"+v));


        /*Find the transaction with the smallest value.*/
        System.out.println("Find the transaction with the smallest value.");
        Optional<Integer> minValueOfTransaction = transactionList.stream()
                                                                  .map(Transaction::getValue)
                                                                  .reduce(Integer::min);

        minValueOfTransaction.ifPresent(v->System.out.println("The smallest value : "+v));
    }
}
