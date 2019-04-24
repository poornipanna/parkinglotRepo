

public class Main {

    public static void main(String[] args)
    {

        Car car1 = new Car();
        ParkingLot parkingLot = new ParkingLot(4);
        car1.add(parkingLot);

        Car car2 = new Car();
        car2.add(parkingLot);

        Car car3 = new Car();
        car3.add(parkingLot);

        Car car4 = new Car();
        car4.add(parkingLot);

        car2.remove(parkingLot);


        boolean status = parkingLot.isFull();

        int avaliablity = parkingLot.checkAvaliablity();

        System.out.println("no of slots avaliable ="+avaliablity);

       if(status == true)
            System.out.println(" Parking avaliable");
       else
           System.out.println("Parking is full");

    }

}
