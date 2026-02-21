// interface with clone method 
interface GameCharacter {
    GameCharacter clone();
}

// Warrior class
class Warrior implements GameCharacter {
    // private attribute
    private int health, attackPower, defense;
    private String changeWeapon;
    private String skillLevel;

    // public constructor
    public Warrior(int health, int attackPower, int defense, String changeWeapon, String skillLevel) {
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.changeWeapon = changeWeapon;
        this.skillLevel = skillLevel;
    }

    // clone method (Object create)
    public GameCharacter clone() {
        return new Warrior(this.health, this.attackPower, this.defense, this.changeWeapon, this.skillLevel);
    }

    // Setters for customization 
    public void setWeapon(String changeWeapon) {
        this.changeWeapon= changeWeapon;
    }

    public void setSkill(String skillLevel) {
        this.skillLevel= skillLevel;
    }

    // display method 
    public void display(){
        System.out.println("Health: "+health);
        System.out.println("Attack Power: "+attackPower);
        System.out.println("Defense: "+defense);
        System.out.println("Weapon: "+changeWeapon);
        System.out.println("Skill: "+skillLevel);
    }
}

public class GameClient {

}
