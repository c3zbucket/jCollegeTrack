/**
 * Class handling individual student data
 * @author Mueez Ahmad
 * @version 09/04/2025
 */
public class Student {

    // Attributes declaration

    /**Name of the student*/
    private String name;
    /**Phone number of the student*/
    private String phoneNo; // Needs input validation to ensure length is strictly 11 characters, assume in report that all students have UK numbers
    /**ID of the student*/
    private int studentID; // input val as it needs to be pos int
    /**ID to iterate from*/
    private static int nextID = 1000;

    /**
     * Individual Student constructor method
     * @param name The name of the student
     * @param phoneNo The phone number of the student
     */
    public Student(String name, String phoneNo) {
        this.studentID = genID();
        this.name = name;
        this.phoneNo = validPhoneNo(phoneNo); //Validate phone numbers entered and ensure they're valid
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
     * @param studentID The ID of the student to override, if needed
     */
    public void setStudentID(int studentID) {
        this.studentID = validID(studentID);
    }

    /**
     * Method to generate a new ID
     * @return a new generated student ID
     */
    private int genID() {
        int genID = nextID++;
        if (nextID > 9999){
            throw new IllegalArgumentException("Cannot add student, maximum number of students reached (9999)");
        }
        return genID;
    }

    /**
     * Method to validate student ID input
     * @param studentID student ID to vaidate
     * @return the student ID , if valid
     */
    private int validID(int studentID){
        if (studentID < 1000 || studentID > 9999){
            throw new IllegalArgumentException("ID is not valid, must be 4 digits");
        }
        return studentID;
    }

    /**
     * Accessor to return a student's name
     * @return name of the student
     */
    public String getName() {return name;}

    /**
     * Mutator to set a student's name
     * @param name name of the student
     */
    public void setName(String name) {this.name = name;}

    /**
     * Method to validate phone number input
     * @param phoneNo phone number input to validate
     * @return phone number input, if valid
     */
    private String validPhoneNo(String phoneNo){
        if (phoneNo.length() != 11){
            //If the length of the phone number is over 11 characters, halt the addition of the student as the number would be invalid (assumed context that this is in the UK)
            throw new IllegalArgumentException("Invalid phone number, must be 11 characters");
        }
        return phoneNo;
    }

    /**
     * Accessor to return a student's phone number
     * @return phone number of the student
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Mutator to return a student's phone number
     * @param phoneNo phone number of the student
     */
    protected void setPhoneNo(String phoneNo) {
        this.phoneNo = validPhoneNo(phoneNo);
    }
    /**
     * Output a record of a student
     * @return a record of the student including their corresponding details
     */
    public String displayRecord() {
        return "Student ID: " + getStudentID() + " | Name: " + name + " | Phone No: " + phoneNo;
    }

}