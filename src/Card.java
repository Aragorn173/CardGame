public class Card {

    String name;
    int health;
    int attack;
    int determination;



    public Card(String name, int health, int attack, int determination) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.determination = determination;
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

    public int getDetermination() {
        return determination;
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
                ", determination=" + determination +
                '}';
    }
}


