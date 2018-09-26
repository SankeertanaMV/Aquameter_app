package com.example.sankeerthana.aquameter_app;

public class userDetails {
    int year;
    String month,name,email;
    float bill_ep1,bill_ep2,bill_ep3,bill_flat,usage_ep1,usage_ep2,usage_ep3,usage_flat;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getBill_ep1() {
        return bill_ep1;
    }

    public void setBill_ep1(float bill_ep1) {
        this.bill_ep1 = bill_ep1;
    }

    public float getBill_ep2() {
        return bill_ep2;
    }

    public void setBill_ep2(float bill_ep2) {
        this.bill_ep2 = bill_ep2;
    }

    public float getBill_ep3() {
        return bill_ep3;
    }

    public void setBill_ep3(float bill_ep3) {
        this.bill_ep3 = bill_ep3;
    }

    public float getBill_flat() {
        return bill_flat;
    }

    public void setBill_flat(float bill_flat) {
        this.bill_flat = bill_flat;
    }

    public float getUsage_ep1() {
        return usage_ep1;
    }

    public void setUsage_ep1(float usage_ep1) {
        this.usage_ep1 = usage_ep1;
    }

    public float getUsage_ep2() {
        return usage_ep2;
    }

    public void setUsage_ep2(float usage_ep2) {
        this.usage_ep2 = usage_ep2;
    }

    public float getUsage_ep3() {
        return usage_ep3;
    }

    public void setUsage_ep3(float usage_ep3) {
        this.usage_ep3 = usage_ep3;
    }

    public float getUsage_flat() {
        return usage_flat;
    }

    public void setUsage_flat(float usage_flat) {
        this.usage_flat = usage_flat;
    }

    public userDetails(int year, String month, String name, String email, float bill_ep1, float bill_ep2, float bill_ep3, float bill_flat,
                       float usage_ep1, float usage_ep2, float usage_ep3, float usage_flat){
        this.setYear(year);
        this.setMonth(month);
        this.setName(name);
        this.setEmail(email);
        this.setBill_ep1(bill_ep1);
        this.setBill_ep2(bill_ep2);
        this.setBill_ep3(bill_ep3);
        this.setBill_flat(bill_flat);

        this.setUsage_ep1(usage_ep1);
        this.setUsage_ep2(usage_ep2);
        this.setUsage_ep3(usage_ep3);
        this.setUsage_flat(usage_flat);

    }
}
