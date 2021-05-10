package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBhealth(790);
        boss.setBdamage(65);
        boss.setBossdefenceType("magic");
        System.out.println("Boss health: " + boss.getBhealth() + "," + "damage: " + boss.getBdamage() + "," + "deffenceType: " + boss.getBossdefenceType());
        createHeroes();
        for (Hero hero:createHeroes()) {
            System.out.println("heroHealth: " + hero.getHeroHelath() + ", " + "heroDamage: " + hero.getHeroDamage() + ", " + "HeroTypeA: "+ hero.getHeroSuperTYpe());
        }

    }

    public static  Hero[] createHeroes() {
        Hero H1 = new Hero(234, 56);
        Hero H2 = new Hero(340, 45, "Magic");
        Hero H3 = new Hero(240, 27, "Speed");
        Hero[] allHero = {H1, H2, H3};
        return allHero;
    }
}
