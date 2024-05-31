public class Student {
    String name;
    String surname;
    int age;

    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    String getName(){
        return name;
    }

    String getSurname(){
        return surname;
    }

    int getAge(){
        return age;
    }
}