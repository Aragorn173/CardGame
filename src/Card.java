public class Card {

    String name;
    int health;
    int attack;


    public Card(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }


    public void attack(Card enemy) {
        System.out.println(this.name + "attacks" + enemy.getName());
        enemy.setHealth(enemy.getHealth() - this.attack);
    }


    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                '}';
    }
}


