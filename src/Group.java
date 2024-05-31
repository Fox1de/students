import java.util.ArrayList;

public class Group {
    int num;
    ArrayList<Student> students;

    public Group(int number){
        this.num = number;
        students = new ArrayList<>();
    }

    public void addstudent(Student student){
        if(students.size() == 20) return;

        students.add(student);
        System.out.println("Студент " + student.getName() + " " + student.getSurname() + " присоединился к группе " + num );
    }

    public void printStudents(){
        System.out.println("Студенты в группе" + num + ":");
        for(Student student : students){
            System.out.println(student.getName() + " " + student.getSurname() + " Возраст: " + student.getAge());
        }
    }





}