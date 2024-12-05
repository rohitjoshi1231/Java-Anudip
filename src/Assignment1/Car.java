package Assignment1;

class Car {

    // Attributes
    String company_name;
    String model_name;
    String fuelType;
    String color;
    int sittingCap;
    int maxSpeed;
    static int count;
    final double PI = 3.14;

    // Constructor
    Car(
            String company_name,
            String model_name,
            String fuelType,
            String color,
            int sittingCap,
            int maxSpeed) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.fuelType = fuelType;
        this.color = color;
        this.sittingCap = sittingCap;
        this.maxSpeed = maxSpeed;
        count++;
    }

// Functionalities

    public void start() {
        // System.out.println(car1.company_name + "Car Started...");
        System.out.println("Car Started...");
    }

    public void drive() {
        System.out.println("Car is in Driving mode...");
    }

    public void applyBreak() {
        System.out.println("Break Applied...");
    }

    public void stop() {
        System.out.println("Car Stoped...");
    }


    public static void main(String arg[]) {
        Car car1 = new Car("Tata", "Nano", "CNG", "Red", 4, 140);

        System.out.println(count + car1.company_name);

        Car car2 = new Car("Mahindra", "Nano", "CNG", "Red", 4, 140);

        //System.out.println(car1.company_name);
	/*	car1.company_name = "Tata";
		car1.model_name = "Nano";
		car1.	fuelType = "CNG";
		car1.color = "Red";
		car1.sittingCap = 4;
		car1.maxSpeed = 140;
	*/

        car1.start();
        car1.drive();
        car1.applyBreak();
        car1.stop();

        System.out.println(count + car2.company_name);

    }

}