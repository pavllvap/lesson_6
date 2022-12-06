package task_2;

public class HDD {
    String title;
    int size;
    Type type;

    enum Type {INNER, OUTER}

    public HDD() {
        this.size = 512;
        this.type = Type.INNER;
        this.title = "Seagate";
    }

    public HDD(String title, int size, Type type) {
        this.title = title;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "title='" + title + '\'' +
                ", size=" + size +
                ", type=" + type +
                '}';
    }
}
