

public class ParkingLot {

    private int capacity=0;
    private int avaliableSlots=0;

    ParkingLot(int numberofSlots)
    {
        capacity  = numberofSlots;
        System.out.println("avaliable slots"+capacity);
    }

    boolean isFull()
    {
        if(avaliableSlots== 0)
        {
            return false;
        }
        else

            return true;

    }

    void addVehical()
    {
        System.out.println("avaliable slots"+capacity +avaliableSlots);
        if(checkAvaliablity() < capacity) {
            avaliableSlots++;
        }
        else
            {
            System.out.println("Vehicle cannot be parked parking full");
        }
    }

    void removeVehical()
    {

        avaliableSlots--;

    }

    int checkAvaliablity()
    {

        return avaliableSlots;

    }


}



