package lists1;

public class Student {
    private String name;
    private String group;
    private int age;
    private Student next;

    public Student(String name, String group, int age, Student next) {
        this.name = name;
        this.group = group;
        this.age = age;
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Студент " + name + ", группа " + group + ", возраст " + age;
    }
}
