/**
 * Import required libraries
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Child class that handles enrolments
 * @author Mueez Ahmad
 * @version
 */
public class Enrolment {

    /**The ID of the enrolled student*/
    private int studentID;
    /**The ID of the enrolled student's course*/
    private int courseID;
     /** Date of enrolment*/
     /** Assign GregorianCalender library as a datatype for the enrolment date*/
    private LocalDate enrolDate;

    /**
     * Enrolment constructor method for Enrollment ArrayList and Date attribute
     * @param studentID ID of enrolled Students
     * @param courseID ID of enrolled Courses
     * @param enrolDate Date of enrolment
     */
    public Enrolment(int studentID, int courseID, LocalDate enrolDate) {
        this.studentID = studentID;
        this.courseID = courseID;
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
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return enrolDate.format(formatDate);
    }

    /**
     * Compare an enrolment with a given range of dates
     * @param startD
     * @param endD
     * @return
     */
  protected boolean compareDate(LocalDate startD, LocalDate endD) {
      return (!enrolDate.isBefore(startD) && !enrolDate.isAfter(endD));
   }

    /**
     * Mutator to set the date of enrolment
     * @param enrolDate the date of the enrolment
     */
    protected void setDate(LocalDate enrolDate) {
        this.enrolDate = enrolDate;
    }

    /**
     * Output a record of the student alongside what courses they are enrolled in
     * @param student The enrolled student referenced with the student class
     * @param course The enrolled student's course referenced with the course class
     * @return Enrolment records for the student
     */
    public String displayRecord(Student student, Course course) {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        return student.displayRecord() + "\n" +
                course.displayRecord() + "\n" +
                "Enrolled in: " + getDate() + "\n" +
                "-------------------------------------------------------------------------------------------------------";
    }

}
