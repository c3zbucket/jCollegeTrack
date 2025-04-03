import java.util.ArrayList;

public class StudentRecords {

    private ArrayList<Student> studentList;

    // Array constructor class
    public StudentRecords() {
        studentList = new ArrayList<>();

    }

    // Enroll a student to the list
    public void add(Student student) {
        studentList.add(student);

    }

    // Remove a student from the list
    public void remove(Student student) {
        studentList.remove(student);
    }

    // Check number of joined members
    public void studentCount() {
        if (studentList.isEmpty()) {
            System.out.println("No students found");
        }
        System.out.println("There are: " + studentList.size() + "student(s) enrolled in the college currently");
    }

    // Search all students that match a query; either forename or surname
    public void nameSearch(int searchOption, String searchQuery) {
        boolean found = false;
        // Switch case for determining if the option to search is by forename or surname, for simplicity
        switch (searchOption) {
            case 1:
                for (Student student : studentList) {
                    if (student.getFname().toLowerCase().contains(searchQuery.toLowerCase())) {
                        System.out.println(student.displayRecord());
                        found = true;
                    }
                    else if (!found) {
                        System.out.println("Student with that forename was not found, maybe try surname?");
                    }
                }
            case 2:
                for (Student student : studentList) {
                    if (student.getLname().toLowerCase().contains(searchQuery.toLowerCase())) {
                        System.out.println(student.displayRecord());
                    }
                    /* else if (student == studentList.size()){

                    }
                    */
                    else if (!found) {
                        System.out.println("Student with that surname was not found, maybe try forename?");
                    }
                }
            default:
                System.out.println("Enter either 1 to search by Forename; or 2 by Surname");
        }

    }

    public void idOutput(int IDQuery) {
        boolean found = false;
        int i = 0;
        while (i < studentList.size()) {
            if (studentList.get(i).getStudentID() == IDQuery) {
                System.out.println(studentList.get(i).displayRecord());
                found = true;
            }
            else if (!found){
                System.out.println("Student with the entered ID was not found");
            }
            else {
                System.out.println("Invalid input, try again");
            }
        }
    }

    public void remove(int IDQuery) {
        boolean found = false;
        for (Student student : studentList){
            if (IDQuery == student.getStudentID()) {
                System.out.println("Removing student: " + student);
                System.out.println(studentList.remove(student));
                found = true;
            }
            else if (!found){
                System.out.println("Student with the entered ID was not found");
            }
            else {
                System.out.println("Invalid input, try again");
            }
        }
    }

    public void outputStudents() {
        for (Student student : studentList){
            System.out.println(student.displayRecord());
        }
    }

}
