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

  @Test // --------------------------------
  public void testHasName()
  {
    assertEquals( "Cooper", mini.getName() );
  }

  @Test // --------------------------------
  public void testSeatsCount()
  {
    assertEquals( 0, mini.seatsCount() );
  }

  @Test // --------------------------------
  public void testIfDriver()
  {
    mini.driver(passenger);
    assertEquals( 1, mini.seatsCount() );
  }

}

