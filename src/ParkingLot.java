

public class ParkingLot {

    private int parkingCapacity;
    private int avaliableSlots=0;
    private int noOfVehicalsParked=0;

    ParkingLot(int numberofSlots)
    {
        parkingCapacity  = numberofSlots;
        avaliableSlots = parkingCapacity;
        noOfVehicalsParked =0 ;
    }

    boolean isFull()
    {
        if (avaliableSlots == 0)
            return false;
         else
            return true;
    }

    void addVehical()
    {

            if( !isFull()) {
                System.out.println("Vehicle cannot be parked already parking full");
            }
            else
            {
                noOfVehicalsParked++;
                avaliableSlots = parkingCapacity - noOfVehicalsParked;
            }
    }

    void removeVehical()
    {

            if( noOfVehicalsParked == 0) {
                System.out.println(" No Vehicals are parked yet");
            }
            else
            {
               noOfVehicalsParked--;
               avaliableSlots =  parkingCapacity - noOfVehicalsParked;
            }

    }

    int checkNoOfSlotsAvaliable()
    {

        return avaliableSlots;

    }

    int checkNoOfVehicalsParked()
    {

        return noOfVehicalsParked;

    }


}



