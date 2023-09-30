import java.lang.reflect.Constructor;

public class PR430Main {

    public static void main(String[] args) {

        System.out.println("\nIniciant 0");
        PR430Objecte instance_0 = PR430Objecte.getInstance("Manel", "Polar", 18);

        System.out.println("Iniciant 1");
        PR430Objecte instance_1 = PR430Objecte.getInstance("Manel", "Polar", 18);

        System.out.println("Iniciant 2");
        PR430Objecte instance_2 = PR430Objecte.getInstance("Manel", "Polar", 18);

        System.out.println("Nom: " + instance_0.getNom() + ", Cognom: " + instance_0.getCognom() + ", Edat: " + instance_0.getEdat());
        System.out.println("Nom: " + instance_1.getNom() + ", Cognom: " + instance_1.getCognom() + ", Edat: " + instance_1.getEdat());
        System.out.println("Nom: " + instance_2.getNom() + ", Cognom: " + instance_2.getCognom() + ", Edat: " + instance_2.getEdat());
    }
}