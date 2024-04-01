public class Vehicle{

    protected int numSeats;
    protected int numPassengers;
    

    public Vehicle(int numSeats){
        this.numSeats = numSeats;
        this.numPassengers =0;
    }

    public int getNumSeats(){
        return this.numSeats;
    }

    public int getNumPassengers(){
        return this.numPassengers;
    }


    public boolean addPassenger(){
        if(this.numSeats <= this.numPassengers){
            return false;
        }

        this.numPassengers += 1;
        return true;
    }





};