package com.i2i.cetin.bean;

public class BillingAccount {
    long billacctid;
    String accountName;

    public BillingAccount(long billacctid, String accountName) {
        this.billacctid = billacctid;
        this.accountName = accountName;
    }

    public long getBillacctid() {
        return billacctid;
    }

    public void setBillacctid(long billacctid) {
        this.billacctid = billacctid;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
