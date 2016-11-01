public class Car{
  private String name;
  private Passenger[] seats;

  // ------------------------------------
  public Car(String name)
  {
    this.name = name;
    this.seats = new Passenger[4];
  }

  //-------------------------------------
  public String getName()
  {
    return this.name;
  } 

  // ------------------------------------
  public int seatsCount()
  {
    int counter = 0;
    for (Passenger seat : seats)
    {
      if (seat != null) 
      {
        counter++;
      }
    }
    return counter;
  }

  // ------------------------------------
  public void driver(Passenger passenger) 
  {
    if ( carFull() ) {
        return;
    }
    int nextEmptyIndex = seatsCount();
    seats[nextEmptyIndex] = passenger;

  }
  
  // ------------------------------------
  public boolean carFull() {
    return seatsCount() == seats.length;
  }

}