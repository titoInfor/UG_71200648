package com.ug8.miniTurnBasedDota;

public abstract class MagicCharacter extends Character{
    protected int mana;

    public MagicCharacter(String name,int health,int damage,int mana){
        super(name, health, damage + mana);
    }

    @Override
    public int attacked(int a) {
        return health += damage;
    }

    @Override
    public void showCharacter() {
        super.showCharacter();
    }
}

