public class The_indifferent_cruelty_of_the_universe extends Card{

    int Hate = 3;

    public The_indifferent_cruelty_of_the_universe(String name, int health, int attack) {
        super(name, health, attack);
    }

    public void Despair(Card enemy) {
        int y = Hate * 10;
        double x = Math.random() * 100;
        if (x <= y) {
            enemy.setHealth(0);
            System.out.println(enemy.getName() + " HAS FALLEN INTO DESPAIR");
        }
    }
}
