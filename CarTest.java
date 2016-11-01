import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CarTest{
  Car mini;
  Passenger passenger;

  @Before
  public void before()
  {
    mini = new Car("Cooper");
    passenger = new Passenger();
  }

  @Test // 1 --------------------------------
  public void testHasName()
  {
    assertEquals( "Cooper", mini.getName() );
  }

  @Test // 2 --------------------------------
  public void testSeatsCount()
  {
    assertEquals( 0, mini.seatsCount() );
  }

  @Test // 3 --------------------------------
  public void testIfDriver()
  {
    mini.driver(passenger);
    assertEquals( 1, mini.seatsCount() );
  }

  @Test // 4 --------------------------------------------
  public void testCarIsFull()
  {
    for (int i = 0; i < 4; i++)
      mini.load(passenger);
      assertEquals( true, mini.carFull() ); 
  }
  
  @Test // 5 --------------------------------------------
  public void testCantLoadWhenFull()
  {
    for (int i = 0; i < 10; i++ ) 
    {
      mini.load(passenger);
    }
    // check that mini has 4 passengers
    assertEquals( 4, mini.seatsCount() ); 
  }

  @Test // 6 --------------------------------------------
  public void testEmptyWhenParked()
  {
    mini.load(passenger);
    assertEquals( 1, mini.seatsCount() ); 
    mini.park();
    assertEquals( 0, mini.seatsCount() ); 
  }

}

