import Encapulation.Encapulation;
import Inheritance.Student;
import Polymorphism.Vehicle;
import Polymorphism.Scooters;

public class RunModules {

    public static void main(String[] args) {
        Encapulation cap = new Encapulation();
        cap.run();

        Student stud = new Student();
        stud.welcome();
        System.out.println(stud);

        Vehicle isA = new Scooters();
        isA.run();

    }
}
