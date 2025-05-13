/**
 * Import required libraries
 */
import java.time.LocalDate; //Manipulate dates easily; used in conjunction with java.DateTimeFormatter
import java.time.format.DateTimeFormatter; //Format dates easily; used in conjunction with java.Date

/**
 * Class that handles enrolments
 * @author Mueez Ahmad
 * @version 20/4/2025
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
     * Accessor to get enrolment date and format it in a readable format
     * @return formatted enrolment date
     */
    protected String getDate() {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //Format date in dd-mm-yyyy format
        return enrolDate.format(formatDate); //Return formatted date in that format
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
     * Output a record of the student alongside what courses they are enrolled in
     * @param student The enrolled student referenced with the student class
     * @param course The enrolled student's course referenced with the course class
     * @return Enrolment records for the student
     */
    public String displayRecord(Student student, Course course) {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        return student.displayRecord() + "\n" + //Output subsequent string on next line
                course.displayRecord() + "\n" +
                "Enrolled in: " + getDate() + "\n" +
                "-------------------------------------------------------------------------------------------------------";
    }

}
