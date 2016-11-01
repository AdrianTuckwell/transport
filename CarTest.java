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
  // test car is empty
  public void testSeatsCount()
  {
    assertEquals( 0, mini.seatsCount() );
  }

  @Test // 3 --------------------------------
  // test if car has driver
  public void testIfDriver()
  {
    mini.driver(passenger);
    assertEquals( 1, mini.seatsCount() );
  }

  @Test // 4 --------------------------------
  // test when car is full (4 seats)
  public void testCarIsFull()
  {
    for (int i = 0; i < 4; i++)
      mini.load(passenger);
      assertEquals( true, mini.carFull() ); 
  }
  
  @Test // 5 ------------------------------
  // test cant add passenger when full
  public void testCantLoadWhenFull()
  {
    for (int i = 0; i < 10; i++ ) 
    {
      mini.load(passenger);
    }
    // check that mini has 4 passengers
    assertEquals( 4, mini.seatsCount() ); 
  }

  @Test // 6 ------------------------------------
  // test when parked car is unloaded
  public void testEmptyWhenParked()
  {
    mini.load(passenger);
    assertEquals( 1, mini.seatsCount() ); 
    mini.park();
    assertEquals( 0, mini.seatsCount() ); 
  }

}

