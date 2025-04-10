/** Import required libraries*/
import java.util.Random;

/**
 * Main class handling individual student data
 * @author Mueez Ahmad
 * @version 09/04/2025
 */
public class Student {

    // Attributes declaration
    /** Name of the student*/
    private String name;
    /** Phone number of the student*/
    private String PhoneNo; // Needs input validation to ensure length is strictly 11 characters, assume in report that all students have UK numbers
    /** ID of the student*/
    protected int studentID; // input val as it needs to be pos int
    /**Random ID of the student*/
    private Random randID;

    /**
     * Individual Student constructor method
     */
    public Student(int studentID, String name, String PhoneNo) {
        //this.randID = new Random();
        //this.studentID = randID.nextInt(1000,9999);
        this.studentID = studentID;
        this.name = name;
        this.PhoneNo = PhoneNo;
    }

    /**
     * Accessor to return a student's ID
     * @return ID of the student
     */
    public int getStudentID() {
        return studentID;
    }
    /**
     * Mutator to set a student's ID
     * @return ID of the student
     */
    public void setStudentID() {
        this.studentID = studentID;
    }

    /**
     * Accessor to return a student's name
     * @return name of the student
     */
    public String getName() {
        return name;
    }
    /**
     * Mutator to set a student's name
     * @param name name of the student
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Accessor to return a student's phone number
     * @return phone number of the student
     */
    public String getPhoneNo() {
        return PhoneNo;
    }

    /**
     * Mutator to return a student's phone number
     * @param PhoneNo phone number of the student
     */
    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }
    /**
     * Output a record of a student
     * @return a record of the student including their corresponding details
     */
    public String displayRecord() {
        return "Student ID: " + studentID + " | Name: " + name + " | Phone No: " + PhoneNo;
    }

    public static void main(String[] args) {
        Student student =  new Student(1897, "John Cavern", "07562507987");
        System.out.println("Student created successfully");
        System.out.println(student.getName());
        System.out.println(student.displayRecord());
        System.out.println(student.getStudentID());
        //System.out.println(student.displayRecord());
    }
}