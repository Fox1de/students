public class Main {
    public static void main(String[] args) {
        Group groupOne = new Group(1);
        Group groupTwo = new Group(2);
        Group groupThree = new Group(3);

        Student student1 = new Student("Даниил","Александров",17 );
        Student student2 = new Student("Михаил","Аринович",19 );
        Student student3 = new Student("Назар","Бекназаров",18 );
        Student student4 = new Student("Денис","Белоусов",19 );
        Student student5 = new Student("Максим","Дуванов",19 );
        Student student6 = new Student("Андрей","Голиченко",19 );
        Student student7 = new Student("Сергей","Мартынов",20 );
        Student student8 = new Student("Егор","Левицкий",19 );
        Student student9 = new Student("Анастасия","Мамонтьева",20 );
        Student student10 = new Student("Виктория","Степанова",19 );

        groupOne.addstudent(student1);
        groupOne.addstudent(student2);
        groupOne.addstudent(student3);
        groupOne.addstudent(student4);

        groupTwo.addstudent(student5);
        groupTwo.addstudent(student6);
        groupTwo.addstudent(student7);

        groupThree.addstudent(student8);
        groupThree.addstudent(student9);
        groupThree.addstudent(student10);

        groupOne.printStudents();
        groupTwo.printStudents();
        groupThree.printStudents();
    }
}