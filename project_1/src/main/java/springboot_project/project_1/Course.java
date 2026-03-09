package springboot_project.project_1;

public class Course {

    private int id;
    private String name;
    private String surname;

    public Course(int id, String name, String surname) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Course[id=" + id + ", name=" + name + ", surname=" + surname + "]";
    }
}