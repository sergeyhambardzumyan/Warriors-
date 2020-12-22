package com.HomeworkWar;

public class Warrior {
    private String name;
    private int life;
    private int damage;

    //region Constructors
    public Warrior() {

    }

    public Warrior(String name, int life, int damage) {
        this.name = name;
        this.life = life;
        this.damage = damage;
    }
    //endregion

    //region settersAndGetters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    //endregion


    public void attack(Warrior opponent, Warrior activePlayer) {
        opponent.setLife(opponent.getLife() - opponent.takeDamage(activePlayer));

    }

    public int takeDamage(Warrior activePlayer) {

        return activePlayer.getDamage();
    }



}
