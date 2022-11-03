package com.ug8.miniTurnBasedDota;

public class DragonKnight extends PhysicalCharacter {
    private int dragonFormAttack;

    public DragonKnight(String name,int health,int damage,int armor){
        super("Dragon Knight", 1800, 95, 50);
    }

    public void skill(){
        this.dragonFormAttack = 2;
    }
    public void attack(Character c){
        if (dragonFormAttack > 0){
            damage += 90;
            dragonFormAttack += -1;
        }
    }
}
