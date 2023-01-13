package students.model;

public class Student {
    private int id;
    private String name;
    private boolean gender;
    private int point;
    private Clazz clazz;

    public Student() {
    }

    public Student(int id, String name, boolean gender, int point, Clazz clazz) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.point = point;
        this.clazz = clazz;
    }

    public Student(String name, boolean gender, int point, Clazz clazz) {
        this.name = name;
        this.gender = gender;
        this.point = point;
        this.clazz = clazz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
}
