public class ServiceStation {

    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            serviceVehicle(car.getWheelsCount(), car);
            car.checkEngine();
        }
    }

    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            serviceVehicle(truck.getWheelsCount(), truck);
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            serviceVehicle(bicycle.getWheelsCount(), bicycle);
        }
    }


    private void serviceVehicle(int wheelsCount, Object vehicle) {
        for (int i = 0; i < wheelsCount; i++) {
            if (vehicle instanceof Car) {
                ((Car) vehicle).updateTyre();
            } else if (vehicle instanceof Truck) {
                ((Truck) vehicle).updateTyre();
            } else if (vehicle instanceof Bicycle) {
                ((Bicycle) vehicle).updateTyre();
            }
        }
    }
}

