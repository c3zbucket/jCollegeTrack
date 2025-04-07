import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class College {

    protected ArrayList<Student> studentList;
    protected ArrayList<Course> courseList;
    protected ArrayList<Enrolment>enrolList;

    public College() {

        courseList = new ArrayList<>();
        studentList = new ArrayList<>();
        enrolList = new ArrayList<>();

    }

    //#######################################################################
    // STUDENT METHODS
    //#######################################################################

    // Enroll a student to the list
    public void add(Student student) {
        studentList.add(student);

    }

    // Remove a student from the list
    public void studentNameRemove(String searchQuery) {
        boolean found = false;
        for (Student student : studentList){
            if (student.getName().toLowerCase().contains(searchQuery.toLowerCase())) {
                System.out.println("Student with query: " + "'" + searchQuery + "'" +" has been removed");
                studentList.remove(student);
                found = true;
            }
        }
        if (!found){
            System.out.println("Student with query: " + "'" + searchQuery + "'" + " was not found");
        }
    }

    // Remove a student with a given ID
    public void studentIDRemove(int IDQuery) {
        boolean found = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (IDQuery == studentList.get(i).getStudentID()) {
                System.out.println("Removing student: " + studentList.get(i).getName());
                studentList.remove(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student with the entered ID was not found");
        }
    }

    // Check number of joined students
    public void studentCount() {
        if (studentList.isEmpty()) {
            System.out.println("No students found");
        }
        System.out.println("There are: " + studentList.size() + " student(s) enrolled in the college currently");
    }

    // Search all students that match by name; and output if they do
    public void studentNameSearch(String searchQuery) {
        boolean found = false;
        for (Student student : studentList) {
            if (student.getName().toLowerCase().contains(searchQuery.toLowerCase())) {
                System.out.println("Student with query: " + "'" + searchQuery + "'" + " was found:");
                System.out.println(student.displayRecord());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student with that name was not found, recheck your search and try again.");
        }
    }

    // Search for a student with a name; and output if it is found
    public void studentIDSearch(int IDQuery) {
        boolean found = false;
        for (Student student : studentList) {
            if (student.getStudentID() == IDQuery) {
                System.out.println("Student with ID: " + "'" + IDQuery + "'" + " was found:");
                System.out.println(student.displayRecord());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student with the entered ID was not found");
        }
    }

    // Output all students
    public void outputStudents() {
        for (Student student : studentList){
            System.out.println(student.displayRecord());
        }
    }

    //#######################################################################
    // COURSE METHODS
    //#######################################################################

    // Add a course to the list
    public void add(Course course ){
        courseList.add(course);

    }

    // Check number of Courses
    public void courseCount() {
        if (courseList.isEmpty()){
            System.out.println("Course list is empty.");
        }
        System.out.println("There are: " + courseList.size() + " course(s) being taught");
    }

    // Search all courses that match a query; and output if found
    public void courseNameSearch(String searchQuery) {
        boolean found = false;
        for (Course course : courseList) {
            if (course.getTitle().toLowerCase().contains(searchQuery.toLowerCase())) {
                System.out.println("Course with query: " + "'" + searchQuery + "'" + " was found:");
                System.out.println(course.displayRecord());
                found = true;
            }
        }
            if (!found) {
                System.out.println("Course with that name was not found.");
            }
        }

    // Search for a course with a specified ID number; and output if found
    public void courseIDSearch(int IDQuery) {
        boolean found = false;
            for (Course course : courseList) {
                if (course.getCourseID() == IDQuery) {
                    System.out.println("Course with ID: " + "'" + IDQuery + "'" + " was found:");
                    System.out.println(course.displayRecord());
                    found = true;
                }
            }
        if (!found) {
            System.out.println("Course with the entered ID was not found");
        }
    }

    // Remove a specified course by ID
    public void courseIDRemove(int IDQuery) {
        boolean found = false;
        for (int i = 0; i < courseList.size(); i++){
            if (IDQuery == courseList.get(i).getCourseID()) {
                System.out.println("Removing course: " + courseList.get(i).getTitle());
                courseList.remove(i);
                found = true;
            }
            if (!found){
                System.out.println("Course with the entered ID was not found");
            }
        }
    }

    // Output a list of all courses
    public void outputCourses() {
        for (Course course : courseList){
            System.out.println(course.displayRecord());
        }
    }

    //#######################################################################
    // ENROLMENT METHODS
    //#######################################################################

    public void enrol(int studentID, int courseID, GregorianCalendar enrolDate){
        if (studentID < 1000 || courseID < 1000 ){
            println("Invalid IDs input, try again");
        }
        else {
            boolean found = false;
            Student targetStudent = null;
            Course targetCourse = null;
            for (Student student : studentList) {
                if (student.getStudentID() == studentID) {
                    targetStudent = student;
                    found = true;
                    break;
                }
            }
            if (!found) {
                println("Student with that ID is not in the list");
            }
            found = false;
            for (Course course : courseList) {
                if (course.getCourseID() == courseID) {
                    targetCourse = course;
                    found = true;
                    break;
                }
            }
            if (!found) {
                println("Course with that ID is not in the list");
            }
            if (targetStudent != null && targetCourse != null) {
                enrolList.add(new Enrolment(studentID, courseID, enrolDate));
                println("Student has been enrolled");
            }
        }
    }

    public void outputEnrolments() {
         for (Enrolment enrol : enrolList){
             println(enrol.displayRecord());
         }
    }



    public void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        College Class1 = new College();
        Class1.add(new Student(1234,"Michael Townsley","098329823"));
        Class1.add(new Student(1894,"Beany Beanio","098329973"));
        Class1.add(new Student(2045, "Jennifer Brown", "555-123-4567"));
        Class1.add(new Student(3156, "David Rodriguez", "555-234-5678"));
        Class1.add(new Student(4267, "Samantha Lee", "555-345-6789"));
        Class1.add(new Student(5378, "Ahmed Khan", "555-456-7890"));
        Class1.add(new Student(6489, "Priya Patel", "555-567-8901"));
        Class1.add(new Student(7591, "Ryan Chen", "555-678-9012"));
        Class1.add(new Student(8602, "Olivia Wilson", "555-789-0123"));
        Class1.add(new Student(9713, "Jamal Washington", "555-890-1234"));
        Class1.add(new Student(1824, "Sophia Garcia", "555-901-2345"));
        Class1.add(new Student(2935, "Noah Kim", "555-012-3456"));
        Class1.outputStudents();
        System.out.println("-----------------------------------------------------------------");
        Class1.add(new Course(1893, "OOP Programming", 10.56));
        Class1.add(new Course(2156, "Data Structures and Algorithms", 11.25));
        Class1.add(new Course(3278, "Database Management Systems", 10.75));
        Class1.add(new Course(3412, "Computer Networks", 11.00));
        Class1.add(new Course(4125, "Artificial Intelligence", 12.50));
        Class1.add(new Course(4367, "Web Development", 10.25));
        Class1.outputCourses();
        /*
        System.out.println("-----------------------------------------------------------------");
        Class1.studentIDSearch(4267);
        System.out.println();
        Class1.studentNameSearch("Lee");
        System.out.println();
        Class1.courseIDSearch(1893);
        System.out.println();
        Class1.courseNameSearch("OOP");
        System.out.println("-----------------------------------------------------------------");
        Class1.studentCount();
        Class1.courseCount();
        System.out.println("-----------------------------------------------------------------");
        Class1.courseIDRemove(1893);
        Class1.outputCourses();
        System.out.println("-----------------------------------------------------------------");
        Class1.studentIDRemove(1234);
        Class1.outputStudents();
         */

        Class1.enrol(2935,4367,(new GregorianCalendar(2009,05,20)));
        Class1.enrol(7591,3412,(new GregorianCalendar(2012,07,19)));
        Class1.outputEnrolments();

    }

}
