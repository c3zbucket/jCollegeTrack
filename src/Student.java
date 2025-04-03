import java.util.Random;

public class Student {

    // Attributes declaration
    private String name;
    private String PhoneNo; // Needs input validation to ensure length is strictly 11 characters, assume in report that all students have UK numbers
    protected int studentID; // input val as it needs to be pos int
    private Random randID;

    // Individual Student constructor class
    public Student(int studentID, String name, String PhoneNo) {
        //this.randID = new Random();
        //this.studentID = randID.nextInt(1000,9999);
        this.studentID = studentID;
        this.name = name;
        this.PhoneNo = PhoneNo;
    }

    public void setStudentID() {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo() {
        this.PhoneNo = PhoneNo;
    }

    public String displayRecord() {
        return "ID: " + studentID + " | Name: " + name + " | Phone No: " + PhoneNo;
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