/* PARKING LOT PROJECT */

public class Main {

    public static void main(String[] args)
    {

        ParkingLot parkingLot = new ParkingLot(4);

        Vehical vehical1 = new Car();
        Vehical vehical2 = new Suv();
        Vehical vehical3 = new Jeep();
        Vehical vehical4 = new Truck();

        vehical1.park(parkingLot);
        vehical2.park(parkingLot);
        vehical3.park(parkingLot);
        vehical4.park(parkingLot);

        vehical1.unpark(parkingLot);
        vehical2.unpark(parkingLot);
        vehical3.unpark(parkingLot);
        vehical4.unpark(parkingLot);

        vehical1.park(parkingLot);
        vehical2.park(parkingLot);

        boolean status = parkingLot.isFull();

        int avaliablity = parkingLot.checkNoOfSlotsAvaliable();
        int noOfVehicalsParked = parkingLot.checkNoOfVehicalsParked();

        System.out.println("no of slots avaliable = " +avaliablity);
        System.out.println("no of Vehicals parked in parking lot = " +noOfVehicalsParked);

        if(status == true)
            System.out.println("Parking avaliable");
        else
            System.out.println("Parking is full");

    }

}
