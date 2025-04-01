public class Course {
    // Attributes declaration

    protected int CourseID; // input val as it needs to be pos int;
    private String Title;
    private double CourseFee; // Needs input validation to ensure length is strictly 11 characters, assume in report that all students have UK numbers

    // Individual Student constructor class
    public Course(int CourseID, String Title, double CourseFee) {
        this.CourseID = CourseID;
        this.Title = Title;
        this.CourseFee = CourseFee;
    }

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int CourseID) {
        if (CourseID < 1000) {
            System.out.println("Invalid Course ID entered; try again");
        }
        this.CourseID = CourseID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public double getCourseFee() {
        return CourseFee;
    }

    public void setCourseFee(double CourseFee) {
        this.CourseFee = CourseFee ;
    }

    public String displayRecord() {
        return "ID: " + CourseID + " | Name: " + Title + " | Fee: " + CourseFee;
    }



}
