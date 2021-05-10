package com.company;

public class Boss {
    private int Bhealth;
    private int bdamage;
    private String BossdefenceType;

    public int getBhealth() {
        return Bhealth;
    }

    public int getBdamage() {
        return bdamage;
    }

    public String getBossdefenceType() {
        return BossdefenceType;
    }

    public void setBhealth(int Bhealth) {
        this.Bhealth = Bhealth;
    }

    public void setBdamage(int bdamage) {
        this.bdamage = bdamage;
    }

    public void setBossdefenceType(String BossdefenceType) {
        this.BossdefenceType = BossdefenceType;
    }
}

