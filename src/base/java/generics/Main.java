package base.java.generics;

/*
Depuis Java version 5
Generics sont de classes qui sont typés au moment de la compilation.
Autrement dit, ce sont des classes qui utilisent des typages en paramètres.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle<Car> vehicle = new Vehicle<>(new Car("Audi"));
        System.out.println("Car name = " + vehicle.getType().name);

        VehicleMap<Integer, Car> vehicleMap = new VehicleMap<>(1, new Car("Tesla"));
        System.out.println(vehicleMap.getKey() + " > " +vehicleMap.getValue().name);
    }
}


