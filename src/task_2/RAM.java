package task_2;

public class RAM {
    String title;
    int size;

    public RAM() {
        this.size = 256;
        this.title = "Corsair";
    }

    public RAM (String title, int size) {
        this.title = title;
        this.size = size;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "title='" + title + '\'' +
                ", size=" + size +
                '}';
    }
}
