

// -------------------- CONTACT --------------------
class Contact {
    private String phone;
    private String email;

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Phone: " + phone + ", Email: " + email;
    }
}

// -------------------- STUDENT --------------------
class Student {
    private String name;
    private Contact contact; // Student HAS a Contact

    public Student(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public void showStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Contact: " + contact);
    }
}

// -------------------- SCHOOL --------------------
class School {
    private String schoolName;
    private Student[] students;
    private int count = 0;

    public School(String schoolName, int numberOfStudents) {
        this.schoolName = schoolName;
        this.students = new Student[numberOfStudents]; // fixed-size array
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Cannot add more students to " + schoolName);
        }
    }

    public void showStudents() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (int i = 0; i < count; i++) {
            students[i].showStudentInfo();
            System.out.println();
        }
    }
}

// -------------------- MAIN --------------------
public class TaskFinal1 {
    public static void main(String[] args) {

        // ----------- Relationship 1: School has many Students ----------
        School school = new School("Green Hill School", 2); // we expect 2 students

        Contact c1 = new Contact("01711111111", "arif@gmail.com");
        Contact c2 = new Contact("01822222222", "borna@gmail.com");

        Student s1 = new Student("Arif", c1);
        Student s2 = new Student("Borna", c2);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showStudents();
    }
}
