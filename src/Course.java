public class Course {
    // Attributes declaration

    protected int courseID; // input val as it needs to be pos int;
    private String title;
    private double courseFee; // Needs input validation to ensure length is strictly 11 characters, assume in report that all students have UK numbers

    // Individual Student constructor class
    public Course(int courseID, String title, double courseFee) {
        this.courseID = courseID;
        this.title = title;
        this.courseFee = courseFee;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        if (courseID < 1000) {
            System.out.println("Invalid Course ID entered; try again");
        }
        this.courseID = courseID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String Title) {
        this.title = title;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public String displayRecord() {
        return "ID: " + "CRS-" + courseID + " | Name: " + title + " | Fee: " + courseFee;
    }



}
