package Assignment1;

class Mobile {

//Attributes

    String companyName;
    String processor;
    int ram;
    int rom;
    int price;

    Mobile(String companyName, String processor, int ram, int rom, int price) {
        this.companyName = companyName;
        this.processor = processor;
        this.ram = ram;
        this.rom = rom;
        this.price = price;
    }

    public void powerOn() {
        System.out.println("POWER IS ON....");
    }

    public void running() {
        System.out.println("MOBILE IS RUNNING....");
    }

    public void powerOff() {
        System.out.println("POWER IS OFF....");
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile("ANDROID", "SNAPDRAGON", 2, 4, 12345);

        System.out.print(mobile.companyName);

    }

}