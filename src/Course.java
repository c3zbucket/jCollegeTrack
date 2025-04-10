import java.text.DecimalFormat;

/**
 * Main class handling individual course data
 * @author Mueez Ahmad
 * @version 10/04/2025
 */
public class Course {
    // Attributes declaration
    /** ID of the course*/
    protected int courseID; // input val as it needs to be pos int;
    /** Title of the course*/
    private String title;
    /** Type of the course*/
    private String type;
    /** Fees of the course*/
    private double courseFee; // Needs input validation to ensure length is strictly 11 characters, assume in report that all students have UK numbers


    /**
     * Individual Student constructor method
     *
     * @param courseID  ID of the course
     * @param title     title of the course
     * @param type      type of the course
     * @param courseFee fee of the course
     */
    public Course(int courseID, String title, String type, double courseFee) {
        this.courseID = courseID;
        this.title = title;
        this.type = type;
        this.courseFee = courseFee;
    }
    /**
     * Accessor to return a course's ID
     * @return ID of the course
     */
    public int getCourseID() {
        return courseID;
    }
    /**
     * Mutator to set a course's ID
     * @param courseID ID of the course
     */
    public void setCourseID(int courseID) {
        // If the course ID is invalid (under 1000 or over 9000), prevent it from being set
        if (courseID < 1000 || courseID > 9000) {
            System.out.println("Invalid Course ID entered; try again");
        }
        this.courseID = courseID;
    }
    /**
     * Accessor to return a course's title
     * @return title of the course
     */
    public String getTitle() {
        return title;
    }

    /**
     * Mutator to set the type of the course
     * @param title title of the course
     */
    public void setTitle(String title) {
        this.type = this.title;
    }

    /**
     * Accessor to return a course's type
     * @return type of the course
     */
    public String getType() {
        return type;
    }

    /**
     * Mutator to set the type of the course
     * @param type type of the course
     */
    public void setType(String type) {
        this.type = title;
    }

    /**
     * Accessor to return a course's fees and format it in a readable format
     * @return fees of the course
     */
    public String getCourseFee() {
        DecimalFormat feeFormat = new DecimalFormat(("###,###,###.##"));
        return feeFormat.format(courseFee);
    }
    /**
     * Mutator to set a course's fees
     * @param courseFee fees of the course
     */
    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }
    /**
     * Output a full record of a course
     * @return a record of the course including corresponding details.
     */
    public String displayRecord() {
        return "Course ID: " + "CRS-" + courseID + " | Name: " + title + " | Type: " + type + " | Fee: " + "£" + getCourseFee();
    }

}
