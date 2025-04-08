/**
 * Import required libraries
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Main class that handles and maintains all collections
 * @author Mueez Ahmad
 * @version
 */
public class College {

    protected ArrayList<Student> studentList;
    protected ArrayList<Course> courseList;
    protected ArrayList<Enrolment>enrolList;

    /**
     * Constructor method for arraylists
     */
    public College() {

        courseList = new ArrayList<>();
        studentList = new ArrayList<>();
        enrolList = new ArrayList<>();

    }

    //#######################################################################
    // STUDENT METHODS
    //#######################################################################

    /**
     * Enroll a student to the list
     * @param student Create new student instance
     */
    public void add(Student student) {
        studentList.add(student);
    }

    /**
     * Remove a student with a given name
     * @param searchQuery Name to remove
     */
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

    /**
     * Remove a student with a given ID
     * @param IDQuery ID of the student to remove
     */
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

    /**
     * Check number of joined students
     */
    public void studentCount() {
        if (studentList.isEmpty()) {
            System.out.println("No students found");
        }
        System.out.println("There are: " + studentList.size() + " student(s) enrolled in the college currently");
    }

    /**
     * Search all students that match by name; and output if they do
     * @param searchQuery Name to search students of
     */
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

    /**
     * Search for a student with an ID; and output if it is found
     * @param IDQuery ID of the student to search for
     */
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

    /**
     * Output all students
     */
    public void outputStudents() {
        for (Student student : studentList){
            System.out.println(student.displayRecord());
        }
    }

    //#######################################################################
    // COURSE METHODS
    //#######################################################################

    /**
     * Add a course to the list
     * @param course The course that will be added
     */
    public void add(Course course){
        courseList.add(course);
        println("Course:  " + course.getTitle() + " has been added");
    }



    /**
     * Check number of Courses
     */
    public void courseCount() {
        if (courseList.isEmpty()){
            System.out.println("Course list is empty.");
        }
        System.out.println("There are: " + courseList.size() + " course(s) being taught");
    }

    /**
     * Search all courses that match a query; and output if foundA
     * @param searchQuery Name to search by
     */
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

    /**
     * Search for a course with a specified ID number; and output if found
     * @param IDQuery ID of the student you want to remove
     */
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

    /**
     * Remove a specified course by name
     * @param courseQuery The name of the course
     */
    public void nameRemove(String courseQuery){
        for (Enrolment encourse : enrolList){
            encourse.setCourseID(0000);
        }
        for (int i = 0; i < courseList.size(); i++){
            if (courseList.contains(courseQuery)){
                println("Course:  " + courseList.get(i).getTitle() + "with ID: " + courseList.get(i).getCourseID() + " has been removed");
                courseList.remove(i);
            }
        }
    }

    /**
     * Remove a specified course by ID
     * @param IDQuery ID of the course to remove
     */
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

    /**
     * Output all courses taught
     */
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
            for (Student student : studentList) {
                if (student.getStudentID() == studentID) {
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
                    found = true;
                    break;
                }
            }
            if (!found) {
                println("Course with that ID is not in the list");
            }
            else {
                enrolList.add(new Enrolment(studentID, courseID, enrolDate));
                SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
                String dateString = formatDate.format(enrolDate.getTime());
                println("Student with the ID: " + studentID + " has been enrolled in the course: " + courseID + " on: " + dateString);
            }
        }
    }

    /**
     * Withdraw a given student from a specified course
     * @param studentID Student ID to withdraw
     * @param courseID Course ID to withdraw from
     */
    public void withdraw(int studentID, int courseID) {
        if (studentID < 1000 || courseID < 1000) {
            println("Invalid IDs input, try again");
        }
        else {
            boolean found = false;
            for (Enrolment student : enrolList) {
                if (student.getStudentID() == studentID && student.getCourseID() == courseID) {
                    println("Student with ID: " + student.getStudentID() + " has been withdrawn from course: " + student.getCourseID());
                    enrolList.remove(student);
                    found = true;
                    break;
                }
            }
            if (!found) {
                println("The student with the ID is not enrolled in this course; or the course does not exist");
            }
        }
    }

    /**
     * Output all enrolments
     */
    public void outputEnrolments() {
        for (Student student : studentList) {
            for (Course course : courseList) {
                for (Enrolment enrol : enrolList) {
                    if (enrol.getStudentID() == student.getStudentID() && enrol.getCourseID() == course.getCourseID() ) {
                        println(enrol.displayRecord(student, course));
                    }
                }
            }
        }
    }

    /**
     * Convenience method for string output
     * @param s The string you want to output
     */
    public void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        College Class1 = new College();
        Class1.add(new Student(1234,"Michael Townsley","098329823"));
        Class1.add(new Student(1894,"Beany Beanio","098329973"));
        Class1.add(new Student(2045, "Jennifer Brown", "075891234"));
        Class1.add(new Student(3156, "David Rodriguez", "073425678"));
        Class1.add(new Student(4267, "Samantha Lee", "079345678"));
        Class1.add(new Student(5378, "Ahmed Khan", "071456789"));
        Class1.add(new Student(6489, "Priya Patel", "077567890"));
        Class1.add(new Student(7591, "Ryan Chen", "074678901"));
        Class1.add(new Student(8602, "Olivia Wilson", "072789012"));
        Class1.add(new Student(9713, "Jamal Washington", "078890123"));
        Class1.add(new Student(1824, "Sophia Garcia", "076901234"));
        Class1.add(new Student(2935, "Maddie Kim", "073012345"));
        Class1.outputStudents();
        System.out.println("-----------------------------------------------------------------");
        Class1.add(new Course(1893, "OOP Programming", 10.56));
        Class1.add(new Course(2156, "Data Structures and Algorithms", 11.25));
        Class1.add(new Course(3278, "Database Management Systems", 10.75));
        Class1.add(new Course(3412, "Computer Networks", 11.00));
        Class1.add(new Course(4125, "Artificial Intelligence", 12.50));
        Class1.add(new Course(4367, "Web Development", 10.25));
        Class1.outputCourses();

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


        Class1.enrol(2935,4367,(new GregorianCalendar(2009,05,20)));
        Class1.enrol(7591,3412,(new GregorianCalendar(2012,07,19)));
        Class1.enrol(6489, 3278, new GregorianCalendar(2018, 04,20));
        Class1.enrol(6489, 4125, (new GregorianCalendar(2018, 05, 19)));
        Class1.enrol(7591, 3278, (new GregorianCalendar(2018, 04, 20)));
        System.out.println("-------------------------------------------------------------------------------------------");
        Class1.outputEnrolments();

    }

}
