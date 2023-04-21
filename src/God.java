public class God extends Card{

    int faith = 2;

    public God(String name, int health, int attack) {
        super(name, health, attack);
    }


    public void Smite(Card enemy) {
        int y = faith * 10;
        double x = Math.random() * 100;
        if (x <= y) {
            enemy.setHealth(0);
            System.out.println(enemy.getName() + " HAS BEEN SMITED DOWN BY GOD");
        }
    }
}
