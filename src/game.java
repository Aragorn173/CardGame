public class game {
    public static void main(String[] args) {
        God God = new God("god", 100, 50, 2);
        God human = new God("human",75, 10,8);

        human.attack(God);

        System.out.println(God);
        System.out.println(human);
    }
}
