package com.i2i.cetin.map;

import com.i2i.cetin.bean.BillingAccount;
import com.i2i.cetin.bean.Days;

import java.util.*;

public class ProductService {
    public static void main(String[] args) {
        /*TreeMap is a sorted order.*/
        treeMapFunc();

        /*LinkedHashMap is a insertionOrder. */
        linkedHashMapFunc();

        Map<Days, String> treeMapDays = new TreeMap<>();
        treeMapDays.put(Days.FRIDAY,"Friday");
        treeMapDays.put(Days.MONDAY,"Monday");

        treeMapDays.forEach((k,v) -> System.out.println(v));

       /* Map<String, String> s = new HashMap<>();
        s.put("CREATEBILLINGACCOUNT","AA");
        String a = "CREATEBILLINGACCOUNT";
        if(s.containsKey(a)){
            System.out.println("MEhmet Ali");
        }*/

        List<String> ss = new ArrayList<>();
        ss.add("CREATEBILLINGACCOUNT");
        String aa = "CREATEBILLINGACCOUNT";
        if(ss.contains(aa)){
            System.out.println("MEhmet Ali");
        }

        List<Long> sss = new ArrayList<>();
        sss.add(77L);
        Long aaa = 77L;
        if(sss.contains(aaa)){
            System.out.println("MEhmet Ali");
        }

        Map<Long,String> stringMap = new HashMap<>();
        stringMap.put(1l,"aa");

        stringMap.putAll(getMap());

        System.out.println(stringMap.values());
    }

    private static Map<Long, String> getMap() {
        Map<Long,String> stringMap = new HashMap<>();
        stringMap.put(2l,"bb");
        return stringMap;
    }


    private static void linkedHashMapFunc() {
        Map<Long, String> linkedHashMap = new LinkedHashMap<>();
        BillingAccount billingAccount   = new BillingAccount(5,"BillAcct5");
        BillingAccount billingAccount2  = new BillingAccount(4,"BillAcct4");
        BillingAccount billingAccount3  = new BillingAccount(3,"BillAcct3");
        BillingAccount billingAccount4  = new BillingAccount(1,"BillAcct1");
        BillingAccount billingAccount5  = new BillingAccount(2,"BillAcct2");
        linkedHashMap.put(billingAccount.getBillacctid(), billingAccount.getAccountName());
        linkedHashMap.put(billingAccount2.getBillacctid(), billingAccount2.getAccountName());
        linkedHashMap.put(billingAccount3.getBillacctid(), billingAccount3.getAccountName());
        linkedHashMap.put(billingAccount4.getBillacctid(), billingAccount4.getAccountName());
        linkedHashMap.put(billingAccount5.getBillacctid(), billingAccount5.getAccountName());


        linkedHashMap.forEach((k,v)-> System.out.println(v));
    }

    private static void treeMapFunc() {
        Map<Long, String> treeMap = new TreeMap<>();
        BillingAccount billingAccount   = new BillingAccount(5,"BillAcct5");
        BillingAccount billingAccount2  = new BillingAccount(4,"BillAcct4");
        BillingAccount billingAccount3  = new BillingAccount(3,"BillAcct3");
        BillingAccount billingAccount4  = new BillingAccount(1,"BillAcct1");
        BillingAccount billingAccount5  = new BillingAccount(2,"BillAcct2");
        treeMap.put(billingAccount.getBillacctid(), billingAccount.getAccountName());
        treeMap.put(billingAccount2.getBillacctid(), billingAccount2.getAccountName());
        treeMap.put(billingAccount3.getBillacctid(), billingAccount3.getAccountName());
        treeMap.put(billingAccount4.getBillacctid(), billingAccount4.getAccountName());
        treeMap.put(billingAccount5.getBillacctid(), billingAccount5.getAccountName());


        treeMap.forEach((k,v)-> System.out.println(v));
    }
}
