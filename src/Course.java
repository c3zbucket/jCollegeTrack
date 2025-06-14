/**
 * Import required libraries
 */
import java.text.DecimalFormat; //For formatting decimals such as involving currency

/**
 * Class handling individual course data
 * @author Mueez Ahmad
 * @version 10/04/2025
 */
public class Course {
    // Attributes declaration

    /**
     * ID of the course
     */
    private int courseID; // input val as it needs to be pos int;

    /**
     * Title of the course
     */
    private String title;

    /**
     * Type of the course
     */
    private String dept;

    /**
     * Fees of the course
     */
    private double courseFee;

    /**
     * Added functionality
     * IDs for each department to iterate from
     */
    private static int compID = 100;
    private static int mathID = 200;
    private static int engiID = 300;
    private static int scieID = 400;
    private static int mediID = 500;
    private static int physID = 600;
    private static int desiID = 700;

    /**
     * Individual Student constructor method
     *
     * @param title     title of the course
     * @param dept      dept of the course
     * @param courseFee fee of the course
     */
    public Course(String title, String dept, double courseFee) {
        this.courseID = courseIDGen(dept);
        this.title = title;
        this.dept = dept;
        this.courseFee = courseFee;
    }

    /**
     * Added functionality
     * Method to generate course ID depending on it's department
     * @param dept department of the course to generate the ID for, if valid
     */
    protected int courseIDGen(String dept) {
        switch (dept) { // Switch case to assign a unique course an ID depending on the 'code' entered
                        // Source: Oracle (2017). The JavaTM Tutorials | Switch statements. [online] Oracle.com. Available at: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html.
            case "COMP":
                compID++;
                if (compID > 199) {
                    // Output an error and stop the program if a course under COMP has a course ID greater than 199
                    throw new IllegalArgumentException("Cannot register course: maximum limit of courses under this department (100) has been reached");
                } else {
                    this.courseID = compID;
                    return courseID;
                }
            case "MATH":
                mathID++;
                if (mathID > 299) {
                    throw new IllegalArgumentException("Cannot register course: maximum limit of courses under this department (100) has been reached");
                } else {
                    this.courseID = mathID;
                    return courseID;
                }
            case "ENGI":
                engiID++;
                if (engiID > 399) {
                    throw new IllegalArgumentException("Cannot register course: maximum limit of courses under this department (100) has been reached");
                } else {
                    this.courseID = engiID;
                    return courseID;
                }
            case "SCIE":
                scieID++;
                if (scieID > 499) {
                    throw new IllegalArgumentException("Cannot register course: maximum limit of courses under this department (100) has been reached");
                } else {
                    this.courseID = scieID;
                    return courseID;
                }
            case "MEDI":
                mediID++;
                if (mediID > 599) {
                    throw new IllegalArgumentException("Cannot register course: maximum limit of courses under this department (100) has been reached");
                } else {
                    this.courseID = mediID;
                    return courseID;
                }
            case "PHYS":
                physID++;
                if (physID > 699) {
                    throw new IllegalArgumentException("Cannot register course: maximum limit of courses under this department (100) has been reached");
                } else {
                    this.courseID = physID;
                    return courseID;
                }
            case "DESI":
                desiID++;
                if (desiID > 799) {
                    throw new IllegalArgumentException("Cannot register course: maximum limit of courses under this department (100) has been reached");
                } else {
                    this.courseID = desiID;
                    return courseID;
                }
                // The default case
            default:
                    throw new IllegalArgumentException("Cannot register course: maximum limit of courses under this department (100) has been reached");
        }
    }

    /**
     * Accessor to return a course's ID
     * @return ID of the course
     */
    public int getCourseID() {return courseID;}

    /**
     * Added functionality
     * Mutator to set a course's ID, if needed
     * @param courseID ID of the course
     */
    public void setCourseID(int courseID) {
        // If the course ID is invalid (under 1000 or over 9000), prevent it from being set
        if (courseID < 100 || courseID > 900) {
            System.out.println("Invalid Course ID entered; try again");
        }
        this.courseID = courseID;
    }

    /**
     * Accessor to return a course's title
     * @return title of the course
     */
    public String getTitle() {return title;}

    /**
     * Mutator to set the title of the course
     * @param title title of the course
     */
    public void setTitle(String title) {this.title = title;}

    /**
     * Added functionality
     * Accessor to return a course's dept
     * @return dept of the course
     */
    public String getDept() {
        switch(dept){ //Switch case to assign a department to a 4 letter 'code' entered
            case "COMP":
                return "Computing";
            case "MATH":
                return "Mathematics";
            case "SCIE":
                return "Science";
            case "ENGI":
                return "Engineering";
            case "DESI":
                return "Art & Design";
            default:
                return "Other";
        }
    }

    /**
     * Mutator to set the dept of the course
     * @param dept type of the course
     */
    public void setDept(String dept) {this.dept = dept;}

    /**
     * Accessor to return a course's fees and format it in a readable format
     * @return fees of the course
     */
    public String getCourseFee() {
        DecimalFormat feeFormat = new DecimalFormat(("###,###,###.##")); // Format course fee as a proper decimal in hundreds and tenths
        //Source: Oracle (2025b). Java Docs | DecimalFormat . [online] docs.oracle.com. Available at: https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html.:
        return feeFormat.format(courseFee);
    }
    /**
     * Mutator to set a course's fees
     * @param courseFee fees of the course
     */
    public void setCourseFee(double courseFee) {this.courseFee = courseFee;}
    /**
     * Output a full record of a course
     * @return a record of the course including corresponding details.
     */
    public String displayRecord() {
        return "Course ID: " + "CRS-" + getCourseID() + " | Name: " + title + " | Department: " + getDept() + " | Fee: " + "£" + getCourseFee();
    }

}
