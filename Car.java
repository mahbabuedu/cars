public class Car extends Vehicle{
    
    
    
    protected int numDoors;


    public Car(){

        super(5);
        this.numDoors = 4;
    }
    public Car(int numSeats,int numDoors){
        super(numSeats);
        this.numDoors = numDoors;
    }


    public int getNumDoors(){
        return this.numDoors;
    }


}
