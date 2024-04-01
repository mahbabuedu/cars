public class Truck extends Vehicle{
    protected int maxCargoWeight;
    protected int cargoWeight;


    public Truck(int maxCargoWeight){
        super(2);
        this.maxCargoWeight = maxCargoWeight;
    }
    
    public Truck(int numSeats,int maxCargoWeight){
        super(numSeats);
        this.maxCargoWeight = maxCargoWeight;
    }

    public int getCargoWeight(){
        return this.cargoWeight;
    }

    public int getMaxCargoWeight(){
        return this.maxCargoWeight;
    }

    public boolean addCargo(int weight){
        if(weight+this.cargoWeight > this.maxCargoWeight){
            return false;
        }
        this.cargoWeight += weight;
        return true;
    }




}
