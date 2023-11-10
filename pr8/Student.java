package pr8;

import java.util.Arrays;

public class Student {
   private String name, workplace;
   private int age;
   public Student(String name, int age, String workplace){
       this.name = name;
       this.age = age;
       this.workplace = workplace;

   }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Андрей", 18, "Yandex");
        students[1] = new Student("Максим", 21, "не работает");
        students[2] = new Student("Cаша", 45, "Серверная");

        System.out.println(Arrays.toString(students));

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", workplace='" + workplace + '\'' +
                '}';
    }

}
