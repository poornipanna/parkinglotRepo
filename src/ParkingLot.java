

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
        if(capacity == 0)
        {
            return false;
        }
        else

            return true;

    }

    void addVehical()
    {

        if( checkAvaliablity() == 0) {
            System.out.println("Vehicle cannot be parked parking full");
        }
        else
            {
            capacity--;
            System.out.println("avaliable slots::: "+capacity );
        }
    }

    void removeVehical()
    {

        capacity++;

    }

    int checkAvaliablity()
    {

        return capacity;

    }


}



