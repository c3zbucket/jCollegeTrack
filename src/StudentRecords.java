import java.util.ArrayList;

public class StudentRecords {

    private ArrayList<Student> studentList;


    public StudentRecords() {
        studentList = new ArrayList<>();

    }

    // Enroll a student to the list
    public void enroll(Student student ){
        studentList.add(student);

    }

    // Check number of joined members
    public void studentCount() {
        if (studentList.isEmpty()){
            System.out.println("No students found");
        }
        System.out.println("There are: " + studentList.size() + "student(s) enrolled in the college currently");
    }
}

