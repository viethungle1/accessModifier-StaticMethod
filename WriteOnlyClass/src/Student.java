public class Student {
    private String name;
    private String classes;

    public Student() {
        name="John";
        classes = "C02";
    }

    void setClasses(String classes) {
        this.classes = classes;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
