package com.HomeworkWar;

import java.util.Random;

public class Magician extends Warrior{

    private int armorPercent = 20;

    public Magician(String name, int life, int damage) {
        super(name, life, damage);
    }

    @Override
    public void attack(Warrior opponent, Warrior activePlayer) {

        opponent.setLife(opponent.getLife() - opponent.takeDamage(activePlayer) - activePlayer.getDamage());

    }

    @Override
    public int takeDamage(Warrior activePlayer) {
        return (int) (activePlayer.getDamage() * (100 - armorPercent) / 100);
    }
}
