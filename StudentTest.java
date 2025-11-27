class Student {
    String name;
    int age;
    char grade;

    // Default Constructor
    Student() {
        name = "Not Assigned";
        age = 0;
        grade = 'N';
    }

    // Parameterized Constructor
    Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display details
    void showDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Grade : " + grade);
        System.out.println("----------------------");
    }
}

// Main class
public class StudentTest {
    public static void main(String args[]) {

        // Using default constructor
        Student s1 = new Student();
        s1.showDetails();

        // Using parameterized constructor
        Student s2 = new Student("Vaibhavi", 20, 'A');
        s2.showDetails();
    }
}
