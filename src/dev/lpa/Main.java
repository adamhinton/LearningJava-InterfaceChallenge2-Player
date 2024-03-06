package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

interface ISaveable{
  List<String> write();
  void read(List<String> myList);
}




class Player implements ISaveable{
    private String name;
    private String weapon = "sword";
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> solution = new ArrayList<String>();

        solution.add(name);
        solution.add("" + hitPoints);
        solution.add("" + strength);
        solution.add(weapon);

        return solution;
    }

    @Override
    public void read(List<String> myList) {
        if (myList == null){
            return;
        }

        if(myList.size() <=0){
            return;
        }

        name = myList.get(0);
        hitPoints = Integer.parseInt(myList.get(1));
        strength = Integer.parseInt(myList.get(2));
        weapon = myList.get(3);
    }

    @Override
    public String toString() {
        return String.format("Monster{name='%s', hitPoints=%d, strength=%d}", name, hitPoints, strength);

    }
}



class Monster{

}