package com.ug8.miniTurnBasedDota;

public class Lina extends MagicCharacter {

    public Lina(String name,int health,int damage,int mana){
        super("lina" , 800, 70, 120);
    }
    public boolean skill(Character c){
        super.attacked(600);
        super.mana += -60;
        return true;
    }
    public void attack(Character c){

    }
}


