package task_2;

public class Computer {
    int price;
    String model;
    RAM ram;
    HDD hdd;




    public Computer(int price, String model) {
        this.ram = new RAM();
        this.hdd = new HDD();
        this.price = price;
        this.model = model;
    }

    public Computer(int price, String model, RAM ram, HDD hdd) {
        this(price, model);
        this.ram = ram;
        this.hdd = hdd;

    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
