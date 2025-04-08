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
    private int studentID;
    private int courseID;
    /**
     * Assign GregorianCalender library as a datatype for the enrolment date
     */
    private GregorianCalendar enrolDate;
    private SimpleDateFormat formatDate;

    /**
     * Enrolment constructor method for Enrollment ArrayList and Date attribute
     * @param studentID ID of enrolled Students
     * @param courseID ID of enrolled Courses
     * @param enrolDate Date of enrolment
     */
    public Enrolment(int studentID, int courseID, GregorianCalendar enrolDate) {
        this.studentID = studentID;
        this.courseID = courseID;
        enrolList = new ArrayList<>();
        this.enrolDate = enrolDate;
    }

    /**
     * Accessor to return enrolled student ID
     * @return ID of the enrolled student
     */
    protected int getStudentID() {
        return studentID;
    }

    protected int getCourseID() {
        return courseID;
    }

    protected void setCourseID(int courseID){
        if (courseID < 1000) {
            System.out.println("Invalid Course ID entered; try again");
        }
        this.courseID = courseID;
    }

    /**
     * Accessor to get enrolment date and format it properly
     * @return formatted enrolment date
     */
    protected String getDate() {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = formatDate.format(enrolDate.getTime());
        return dateString;
    }

    protected void setDate(GregorianCalendar enrolDate) {
        this.enrolDate = enrolDate;
    }

    public String displayRecord(Student student, Course course) {
        println("-------------------------------------------------------------------------------------------------------");
        return student.displayRecord() + "\n" +
                course.displayRecord() + "\n" +
                "Enrolled in: " + getDate() + "\n" +
                "-------------------------------------------------------------------------------------------------------";
    }

}






