public class game {
    public static void main(String[] args) {
        God God = new God("God", 1000, 50);
        The_indomitable_human_spirit human = new The_indomitable_human_spirit("Human",100, 90);


        while (human.getHealth() > 0 && God.getHealth() > 0) {
            if (human.getHealth() > 0) {
                human.attack(God);
                God.deathCheck(human);
            }
            if (God.getHealth() > 0) {
                God.attack(human);
                God.Smite(human);
                human.determinationCheck();
                human.deathCheck(God);
            }
        }
            System.out.println(God);
            System.out.println(human);
    }
}
