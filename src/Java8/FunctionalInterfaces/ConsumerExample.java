package Java8.FunctionalInterfaces;

import Java8.Data.Student;
import Java8.Data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c1 = (students) -> System.out.println(students);
    static Consumer<Student> c2 = (students) -> System.out.print(students.getName());
    static Consumer<Student> c3 = (Student)-> System.out.println(Student.getActivities());

    public static void printName(){

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1);
    }

    public static void getNamesAndActivities(){

        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c2.andThen(c3));       // consumer chaining
    }

    public static void getNamesAndActivitiesWithCondition(){

        System.out.println("++++++++++ getNamesAndActivitiesWithCondition ++++++++++");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if (student.getGradeLevel()>=3){        // can add multiple conditions here
                c2.andThen(c3).accept(student);
            }
        });
    }

    public static void main(String[] args) {

        Consumer<String> c = (s) -> System.out.println(s.toUpperCase());

        // passing input : use accept()

        c.accept("hello world");

        // Real world Example
        printName();
        getNamesAndActivities();
        getNamesAndActivitiesWithCondition();



    }
}
