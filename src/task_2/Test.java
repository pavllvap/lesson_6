package task_2;

public class Test {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1000, "AMD");
        System.out.println(computer1);
        Computer computer2 = new Computer(1500, "Intel", new RAM("Samsung", 512),
                new HDD("Samsung", 1024, HDD.Type.OUTER));
        System.out.println(computer2);
    }
}
