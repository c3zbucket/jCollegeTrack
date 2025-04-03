import java.util.ArrayList;

public class Enrolment {

    private ArrayList<Object> EnrolList;
    private String enroldate;
    protected int studentID;
    private int courseID;

    public Enrolment(int studentID, int courseID, String enroldate) {
        EnrolList = new ArrayList<>();
        this.enroldate = enroldate;
        this.studentID = studentID;
        this.courseID = courseID;
    }
    /*
    Make it that student ID and course ID are parameters instead and have a parent College class which handles it all, read the assignment brief carefully again
     */
    public void enrollAdd(){
        /*  EnrolList.add(studentID, courseID, enroldate);

         */
    }

    public String getDate() {
        return enroldate;
    }


}
