// interface with clone method 
interface GameCharacter {
    GameCharacter clone();
    void display();
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
        this.changeWeapon = changeWeapon;
    }

    public void setSkill(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    // display method
    public void display() {
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Defense: " + defense);
        System.out.println("Weapon: " + changeWeapon);
        System.out.println("Skill: " + skillLevel);
    }
}

// Archer class
class Archer implements GameCharacter {
    // private attribute
    private int health, attackPower, defense;
    private String changeWeapon;
    private String skillLevel;

    // public constructor
    public Archer(int health, int attackPower, int defense, String changeWeapon, String skillLevel) {
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.changeWeapon = changeWeapon;
        this.skillLevel = skillLevel;
    }

    // clone method (Object create)
    public GameCharacter clone() {
        return new Archer(this.health, this.attackPower, this.defense, this.changeWeapon, this.skillLevel);
    }

    // Setters for customization
    public void setWeapon(String changeWeapon) {
        this.changeWeapon = changeWeapon;
    }

    public void setSkill(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    // display method
    public void display() {
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Defense: " + defense);
        System.out.println("Weapon: " + changeWeapon);
        System.out.println("Skill: " + skillLevel);
    }
}

// Mage class
class Mage implements GameCharacter {
    // private attribute
    private int health, attackPower, defense;
    private String changeWeapon;
    private String skillLevel;

    // public constructor
    public Mage(int health, int attackPower, int defense, String changeWeapon, String skillLevel) {
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.changeWeapon = changeWeapon;
        this.skillLevel = skillLevel;
    }

    // clone method (Object create)
    public GameCharacter clone() {
        return new Mage(this.health, this.attackPower, this.defense, this.changeWeapon, this.skillLevel);
    }

    // Setters for customization
    public void setWeapon(String changeWeapon) {
        this.changeWeapon = changeWeapon;
    }

    public void setSkill(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    // display method
    public void display() {
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Defense: " + defense);
        System.out.println("Weapon: " + changeWeapon);
        System.out.println("Skill: " + skillLevel);
    }
}

// main class
public class GameClient {
    public static void main(String[] args) {
        // base object (Warrior)
        GameCharacter pWarrior = new Warrior(90, 70, 85, "M143", "High");
        System.out.println("Original Warrior:");
        pWarrior.display();
        // clone object
        Warrior warriorClone = (Warrior) pWarrior.clone();
        warriorClone.setWeapon("AK47");
        warriorClone.setSkill("Very high");
        System.out.println("---Modified Warrior:---");
        warriorClone.display();

        // base object (Archer)
        GameCharacter pArcher = new Archer(75, 97, 84, "Shortgut", "Medium");
        System.out.println("\nOriginal Archer:");
        pArcher.display();
        // clone object
        Archer archer = (Archer) pArcher.clone();
        archer.setSkill("beginner");
        archer.setWeapon("pistol");
        System.out.println("---Modified Archer:---");
        archer.display();

        // base object (Mage)
        GameCharacter pMage = new Mage(78, 86, 99, "Machine gun", "intermidiate");
        System.out.println("\nOriginal Mage:");
        pMage.display();
        // clone object
        Mage mage = (Mage) pMage.clone();
        mage.setSkill("pro");
        mage.setWeapon("Carbines");
        System.out.println("---Modified Mage:---");
        mage.display();
    }

}
