public class Student {

    private String Fname;
    private String Lname;
    private String PhoneNo; // Needs input validation to ensure length is strictly 11 characters, assume in report that all students have UK numbers
    protected int studentID; // input val as it needs to be pos int

    public Student(String Fname, String Lname, String PhoneNo, int studentID) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.PhoneNo = PhoneNo;
        this.studentID = studentID;
    }

    public static void main(String[] args) {
        Student student =  new Student("John", "Cavern", "07562507987", 189734);
        System.out.println("Student created successfully");
    }
}