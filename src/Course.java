import java.text.DecimalFormat;

/**
 * Main class handling individual course data
 * @author Mueez Ahmad
 * @version 10/04/2025
 */
public class Course {
    // Attributes declaration

    /**
     * ID of the course
     */
    protected int courseID; // input val as it needs to be pos int;

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
     * Method to generate course ID depending on it's department
     * @param dept department of the course to generate the ID for, if valid
     */
    public int courseIDGen(String dept) {
        switch (dept) {
            case "COMP":
                compID++;
                if (compID > 199) {
                    throw new IllegalArgumentException("Cannot register course: maximum limit of courses under this department (100) has been reached");
                } else {
                    this.courseID = compID;
                    return courseID;
                }
            case "MATH":
                mathID = mathID++;
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
            default:
                    throw new IllegalArgumentException("Cannot register course: maximum limit of courses under this department (100) has been reached");
        }
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
     * Mutator to set the title of the course
     * @param title title of the course
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Accessor to return a course's dept
     * @return dept of the course
     */
    public String getDept() {
        switch(dept){
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
    public void setDept(String dept) {
        this.dept = dept;
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
        return "Course ID: " + "CRS-" + getCourseID() + " | Name: " + title + " | Department: " + getDept() + " | Fee: " + "£" + getCourseFee();
    }

}
