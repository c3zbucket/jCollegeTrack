public class Student {

    // Attributes declaration
    private String Fname;
    private String Lname;
    private String PhoneNo; // Needs input validation to ensure length is strictly 11 characters, assume in report that all students have UK numbers
    protected static int studentID; // input val as it needs to be pos int

    // Individual Student contstrutor class
    public Student(int studentID, String Fname, String Lname, String PhoneNo) {
        this.studentID = studentID;
        this.Fname = Fname;
        this.Lname = Lname;
        this.PhoneNo = PhoneNo;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID){
        if (studentID < 1000) {
            System.out.println("Invalid Student ID entered, try again");
        }
        this.studentID = studentID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname() {
        this.Fname = Fname;
    }
    public String getLname() {
        return Lname;
    }

    public void setLname() {
        this.Lname = Lname;
    }
    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo() {
        this.PhoneNo = PhoneNo;
    }

    public String displayRecord() {
        return "ID: " + studentID + " | Name: " + Fname + " " + Lname + " | Phone No: " + PhoneNo;
    }


    public static void main(String[] args) {
        Student student =  new Student(189734, "John", "Cavern", "07562507987");
        System.out.println("Student created successfully");
        System.out.println(student.getLname());
        System.out.println(student.displayRecord());
    }
}