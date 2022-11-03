package com.ug8.miniTurnBasedDota;

public abstract class PhysicalCharacter extends Character{
    private int armor;


    public PhysicalCharacter(String name, int health, int damage, int i) {
        super(name, health, damage);
    }

    @Override
    public void showCharacter() {
        super.showCharacter();
    }

    @Override
    public int attacked(int a) {
        return 0;
    }
}
