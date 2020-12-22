package com.HomeworkWar;

public class Archer extends Warrior {
    public Archer() {
    }

    public Archer(String name, int life, int damage) {
        super(name, life, damage);
    }

    private static int criticalHitCoefficient = 0;

    @Override
    public void attack(Warrior opponent, Warrior activePlayer) {
        criticalHitCoefficient++;
        if (criticalHitCoefficient % 4 == 0) {
                int actualDamage = activePlayer.getDamage();
                activePlayer.setDamage(activePlayer.getDamage() * 2);
                opponent.setLife(opponent.getLife() - opponent.takeDamage(activePlayer));
                activePlayer.setDamage(actualDamage);

            } else {
                 opponent.setLife(opponent.getLife() - opponent.takeDamage(activePlayer));
        }

    }

    @Override
    public int takeDamage(Warrior activePlayer) {
        return super.takeDamage(activePlayer);
    }
}
