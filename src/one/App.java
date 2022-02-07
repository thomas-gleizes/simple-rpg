package one;

public class App {

    public static void main(String[] args) {
        Character character1 = new Character();
        Character character2 = new Character();

        System.out.println(character2);
        System.out.println(character2);

        try {
            character1.attack(character2, 20);
            character2.attack(character1, 10);
            character1.attack(character2, 40);
            character1.heal(character2, 10);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(character2);
        System.out.println(character2);
    }
}
