public class The_indomitable_human_spirit extends Card{

    int determination = 9;



    public The_indomitable_human_spirit(String name, int health, int attack) {
        super(name, health, attack);
    }

    public void determinationCheck() {
        if (this.health <= 0) {
            int y = this.determination * 10;
            double x = Math.random()* 100;
            if (x <= y) {
                setHealth(100);
                System.out.println(this.name + " Refused death");
            } else {
                setHealth(0);
            }
        }
    }
}
