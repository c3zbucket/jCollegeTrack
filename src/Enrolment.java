/**
 * Import required libraries
 */
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.ArrayList;

/**
 * Child class that handles enrolments
 * @author Mueez Ahmad
 * @version
 */
public class Enrolment extends College {

    /**
     * Initialise arrays as attributes for objects from Student and Course class; Initialise Course ArrayList to store them
     */
    /**The ID of the enrolled student*/
    private int studentID;
    /**The ID of the enrolled student's course*/
    private int courseID;
     /** Date of enrolment*/
     /** Assign GregorianCalender library as a datatype for the enrolment date*/
    private GregorianCalendar enrolDate;

    /**
     * Enrolment constructor method for Enrollment ArrayList and Date attribute
     * @param studentID ID of enrolled Students
     * @param courseID ID of enrolled Courses
     * @param enrolDate Date of enrolment
     */
    public Enrolment(int studentID, int courseID, GregorianCalendar enrolDate) {
        this.studentID = studentID;
        this.courseID = courseID;
       // enrolList = new ArrayList<>();
        this.enrolDate = enrolDate;
    }

    /**
     * Accessor to return enrolled student ID
     * @return ID of the enrolled student
     */
    protected int getStudentID() {
        return studentID;
    }

    /**
     * Accessor to return enrolled course ID
     * @return ID of the enrolled student's course
     */
    protected int getCourseID() {
        return courseID;
    }

    /**
     * Mutator to set the enrolled course ID
     * @param courseID the enrolled course ID to modify
     */
    protected void setCourseID(int courseID){
        if (courseID < 1000) {
            System.out.println("Invalid Course ID entered; try again");
        }
        this.courseID = courseID;
    }

    /**
     * Accessor to get enrolment date and format it in a readable format
     * @return formatted enrolment date
     */
    protected String getDate() {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = formatDate.format(enrolDate.getTime());
        return dateString;
    }

    /**
     * Mutator to set the date of enrolment
     * @param enrolDate the date of the enrolment
     */
    protected void setDate(GregorianCalendar enrolDate) {
        this.enrolDate = enrolDate;
    }

    /**
     * Output a record of the student alongside what courses they are enrolled in
     * @param student The enrolled student referenced with the student class
     * @param course The enrolled student's course referenced with the course class
     * @return Enrolment records for the student
     */
    public String displayRecord(Student student, Course course) {
        println("-------------------------------------------------------------------------------------------------------");
        return student.displayRecord() + "\n" +
                course.displayRecord() + "\n" +
                "Enrolled in: " + getDate() + "\n" +
                "-------------------------------------------------------------------------------------------------------";
    }

}
