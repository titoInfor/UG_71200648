package com.ug8.miniTurnBasedDota;

public class LegionCommander extends PhysicalCharacter {

    private int kill;

    public LegionCommander(String name, int health, int damage, int armor) {
        super("Legion Commander", 1200, 120, 30);
    }

    public void skill(Character c) {
        super.attacked(damage);
    }

    public void attack(Character c) {
        if (c.health <= 0) {
            kill += 1;
            super.damage += 10;
        }
    }
}

