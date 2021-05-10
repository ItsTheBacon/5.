package com.company;

public class Hero {
    private int heroHealht;
    private int heroDamage ;
    private String heroSuperTYpe ;


    public Hero(int heroHelath , int heroDamage , String heroSuperTYpe){
        this.heroHealht =heroHelath;
        this.heroDamage=heroDamage;
        this.heroSuperTYpe=heroSuperTYpe;
    }
    public Hero(int heroHelath,int heroDamage){
        this.heroHealht =heroHelath;
        this.heroDamage = heroDamage;

    }

    public int getHeroHelath() {
        return heroHealht;
    }

    public int getHeroDamage() {
        return heroDamage;
    }


    public String getHeroSuperTYpe() {
        return heroSuperTYpe;
    }
}
