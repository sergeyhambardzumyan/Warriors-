package com.HomeworkWar;

public class Swordsman extends Warrior{


    public Swordsman(String name, int life, int damage) {
        super(name, life, damage);
    }

    private int armorPercent = 20;



    @Override
    public int takeDamage(Warrior activePlayer) {
        return (int) (activePlayer.getDamage() * (100 - armorPercent) / 100);
    }
}
