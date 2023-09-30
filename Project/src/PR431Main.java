import java.lang.reflect.Constructor;

public class PR431Main {

    public static void main(String[] args) {

        System.out.println("\nIniciant 0");
        PR431Objecte instance_0 = PR431Objecte.getInstance("Manel", "Polar", 18);

        System.out.println("Iniciant 1");
        PR431Objecte instance_1 = getNewDestroyedInstance("Laura", "Gelada", 19);

        System.out.println("Iniciant 2");
        PR431Objecte instance_2 = getNewDestroyedInstance("Pingu", "Ice", 22);

        System.out.println("Nom: " + instance_0.getNom() + ", Cognom: " + instance_0.getCognom() + ", Edat: " + instance_0.getEdat());
        System.out.println("Nom: " + instance_1.getNom() + ", Cognom: " + instance_1.getCognom() + ", Edat: " + instance_1.getEdat());
        System.out.println("Nom: " + instance_2.getNom() + ", Cognom: " + instance_2.getCognom() + ", Edat: " + instance_2.getEdat());
    }

    static PR431Objecte getNewDestroyedInstance (String nom, String cognom, int edat) {
        
        PR431Objecte result = null;
        try {
            Constructor<?>[] constructors = PR431Objecte.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                result = (PR431Objecte) constructor.newInstance(nom, cognom, edat);
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}