package Before;

public class Athlete_InterfaceSegregationPrinciple {

    interface Athlete{

        public void jump();
        public void swim();
    }

    //Some classes wont use all the methods
    public class JumpRound implements Athlete{

        public void jump()
        {
        System.out.println("Athlete is through to long jump quarters");
        }

        public void swim()
        {
        }
    }

    public class SwimRound implements Athlete{
        public void jump()
        {
        }


        public void swim()
        {
         System.out.println("Athlete is through to the swimming quarters");
        }
    }
}
