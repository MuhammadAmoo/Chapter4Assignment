package Polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class ScootersTest {

    private Scooters scooter;

    public static void main(String[] args){

        Vehicle vhc = new Scooters();
        // prints Scooters can move and accelerate too!!
        vhc.move();

        vhc=new Vehicle();
        // prints Vehicles can move!!
        vhc.move();

    }

    @Before
    public void setUp() throws Exception{
        scooter = new Scooters();
    }


    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void move()
    {
        scooter.move();
        Assert.assertNotNull(scooter.toString());
    }

}
