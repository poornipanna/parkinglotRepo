

public class Main {

    public static void main(String[] args)
    {


        ParkingLot parkingLot = new ParkingLot(4);

        Vehical vehical1 = new Car();
        vehical1.park(parkingLot);

        Vehical vehical2 = new Car();
        vehical2.park(parkingLot);

        Vehical vehical3 = new Car();
        vehical3.park(parkingLot);

        Vehical vehical4 = new Suv();
        vehical4.park(parkingLot);

        Vehical vehical5 = new Suv();
        vehical5.park(parkingLot);


     //   vehical3.unpark(parkingLot);
      //  vehical4.unpark(parkingLot);
       // vehical1.unpark(parkingLot);


        boolean status = parkingLot.isFull();

        int avaliablity = parkingLot.checkAvaliablity();

        System.out.println("no of slots avaliable ="+avaliablity);

       if(status == true)
            System.out.println(" Parking avaliable");
       else
           System.out.println("Parking is full");

    }

}
