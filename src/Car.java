
public class Car extends Vehical{


    public void park(ParkingLot parkingLot)
    {
        parkingLot.addVehical();
      //  System.out.println("adding vehical ");

    }

    public void unpark(ParkingLot parklot)
    {
        parklot.removeVehical();
       // System.out.println(" removing vehical");
    }

}