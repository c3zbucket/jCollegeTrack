import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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

    /*
    // Object referencing via passing Student and Course classes as parameters
    public void enrolAdd(String studentQuery, String courseQuery){
        Iterator<Student> studentIt = studentList.iterator();
        Iterator<Course> courseIt = courseList.iterator();
        boolean validentry = false;
        while (studentIt.hasNext() && courseIt.hasNext()){
            studentIt.next(); courseIt.next();
            if (studentList.contains(studentQuery) && courseList.contains(courseQuery)
            ){
                int foundindex = studentList.get(Integer.parseInt(studentIt.toString())).getStudentID();
                enrolList.add(Integer.parseInt(studentQuery), Integer.parseInt(courseQuery));
                validentry = true;
                System.out.println(studentList.get(foundindex).getName());
            }
        }
    }

    public void withdraw(int studentQuery, int courseQuery){
        int i = 0;
        boolean found = false;
        while (i < enrolList.size() && !found){
            if (enrolList.contains(studentQuery) && enrolList.contains(courseQuery) ){
                enrolList.remove(i);
                found = true;
                System.out.println("Student with the ID: " + studentQuery + "and Course ID: " + courseQuery + "was found and removed.");
            }
            if (!found){
                System.out.println("Student with the ID: " + studentQuery + "and Course ID: " + courseQuery + "was not found.");
            }
        }
    }

     */

    public String displayRecord() {
        return "Student with the ID: " + getStudentID() + " has been enrolled in course: " + "CRS-" + getCourseID() + " since " + getDate();
    }





}
