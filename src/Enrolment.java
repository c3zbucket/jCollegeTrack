import java.util.ArrayList;

public class Enrolment {

    private ArrayList<Object> EnrolList;

    public Enrolment() {
        EnrolList = new ArrayList<>();
    }

    /*
    Make it that student ID and course ID are parameters instead and have a parent College class which handles it all, read the assignment brief carefully again
     */
    public void enrollAdd(Student student, Course course){
        EnrolList.add(student, course.displayRecord());
    }
}
