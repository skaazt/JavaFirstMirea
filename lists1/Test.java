package lists1;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        Group list = new Group();
        Student last = list.getLast();
        boolean exit = false;
        do {
            System.out.println("Выберите, что хотите сделать с группой:\n+ - Добавить студента в список" +
                    "\n- - Удалить последнего студента из списка\nisempty - Проверить, есть ли в группе студенты\n" +
                    "show - Показать список студентов в групппе\nclear - удалить список\nexit - завершить программу");
            switch (sc.next()){
                case "+":{
                    System.out.println("Введите имя студента");
                    name = sc.next();
                    System.out.println("Введите группу студента");
                    String group = sc.next();
                    System.out.println("Введите возраст студента");
                    int age = sc.nextInt();
                    list.insert(name, group, age);
                    break;
                }
                case "-":list.deleteLast(); break;
                case "isempty": System.out.println(list.isEmpty()); break;
                case "show": System.out.println(list); break;
                case "clear": list.clear(); break;
                case "exit": exit = true;
            }
        }while (!exit);
        System.out.println(list);
    }

}
