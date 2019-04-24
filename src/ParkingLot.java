

public class ParkingLot{

    //private int capacity;
    private int avaliableSlots;

    ParkingLot(int numberofSlots)
    {
        avaliableSlots = numberofSlots;
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

    void parkCar()
    {
        avaliableSlots++;

    }

    void unparkCar()
    {
        avaliableSlots--;
    }

    int checkAvaliablity()
    {
        return avaliableSlots;

    }


}



