package school.model;
public class Course {
    private int id; private String name; private int unit;
    public Course(int id, String name, int unit) { this.id = id; this.name = name; this.unit = unit; }
    public int getId() { return id; } public String getName() { return name; } public int getUnit() { return unit; }
    @Override public String toString() { return id + ". " + name + " [" + unit + " Units]"; }
}