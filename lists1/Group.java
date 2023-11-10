package lists1;

public class Group {
    private Student student;

    public Group() {
        this.student = new Student("", "", 0, null);
    }
    Student getFirst(){
        return student;
    }
    Student getLast(){
        Student stud = this.student;
        while (stud.getNext()!=null)
            stud = stud.getNext();
        return stud;
    }
    public void insert(String name, String group, int age){
        if (this.getLast().getNext()==null) {
            this.getLast().setNext(new Student(name, group, age, null));
        }
        else{
            this.getLast().setNext(new Student(name, group, age, this.getLast().getNext()));
        }
    }

    public void deleteLast(){
        Student stud = student;
        while (stud.getNext().getNext()!=null){
            stud = stud.getNext();
        }
        stud.setNext(null);
    }
    public boolean isEmpty(){
        return student.getNext() == null;
    }
    public void clear(){
        student.setNext(null);
    }

    @Override
    public String toString() {
        if (student.getNext() == null) return "В списке нет студентов";
        else {
            Student stud = student.getNext();
            String str = "";
            do {
                str = str + stud.toString() + "\n";
                stud = stud.getNext();
            } while (stud != null);
            return str;
        }
    }

}
