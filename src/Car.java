public class Car extends Transport {


    @Override
    public void check() {
        super.check();
        checkEngine();
    }

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

