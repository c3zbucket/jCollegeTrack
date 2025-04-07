import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Enrolment extends College {

    // Initialise arrays as attributes for objects from Student and Course class; Initialise Course ArrayList to store them
    private int studentID;
    private int courseID;
    // Assign GregorianCalender library as a datatype for the enrolment date
    private GregorianCalendar enrolDate;
    private SimpleDateFormat formatDate;

    // Enrolment constructor class for Enrollment ArrayList and Date attribute
    public Enrolment(int studentID, int courseID, GregorianCalendar enrolDate) {
        this.studentID = studentID;
        this.courseID = courseID;
        enrolList = new ArrayList<>();
        this.enrolDate = enrolDate;
    }

    protected int getStudentID() {
        return studentID;
    }

    protected int getCourseID() {
        return courseID;
    }

    protected String getDate(){
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = formatDate.format(enrolDate.getTime());
        return dateString;
    }

    public void setDate(GregorianCalendar enrolDate) {
        this.enrolDate = enrolDate;
    }

    public String displayRecord() {
        return "Student with the ID: " + getStudentID() + " has been enrolled in course: " + "CRS-" + getCourseID() + " since " + getDate();
    }





}
