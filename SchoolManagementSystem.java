// Base Class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showRole() {
        System.out.println("I am a Person.");
    }
}
class Teacher extends Person {
    String subject;
    double salary;

    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void showRole() {
        System.out.println("I am a Teacher. Name: " + name
                + ", Age: " + age
                + ", Subject: " + subject
                + ", Salary: " + salary);
    }
}
class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }
    @Override
    void showRole() {
        System.out.println("I am a Student. Name: " + name
                + ", Age: " + age
                + ", Course: " + course);
    }
}
public class SchoolManagementSystem {
    public static void main(String[] args) {

        Person[] people = new Person[2];
        people[0] = new Teacher(
                "Shailesh Kumar Pandit",
                18,
                "Java",
                50000.0
        );
        people[1] = new Student(
                "Shailesh Kumar Pandit",
                18,
                "B.Tech AI & ML"
        );
        for (Person p : people) {
            p.showRole();
        }
    }
}