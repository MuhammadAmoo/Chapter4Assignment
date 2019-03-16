package After;

public class Athlete_InterfaceSegregationPrinciple {

    interface JumpingAthlete
    {
        public void jump();
    }

    interface SwimmingAthlete
    {
        public void swim();
    }

    public class JumpRound implements JumpingAthlete{

        public void jump()
        {
            System.out.println("Athlete is through to long jump quarters");
        }

    }

    public class SwimRound implements SwimmingAthlete{

        public void swim() {

            System.out.println("Athlete is through to the swimming quarters");
        }
    }
}
