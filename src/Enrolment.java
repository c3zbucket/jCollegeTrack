import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class Enrolment extends College {

    // Initialise arrays as attributes for objects from Student and Course class; Initialise Course ArrayList to store them
    // Assign GregorianCalender library as a datatype for the enrolment date
    private GregorianCalendar enrolDate;

    // Enrolment constructor class for Enrollment ArrayList and Date attribute
    public Enrolment(GregorianCalendar enrolDate) {
        enrolList = new ArrayList<>();
        this.enrolDate = this.enrolDate;
    }

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

    public GregorianCalendar getDate() {
        return enrolDate;
    }

    public void setDate(GregorianCalendar enrolDate) {
        this.enrolDate = enrolDate;
    }

    public void outputEnrolment(GregorianCalendar enrolDate) {
        Iterator<Student> studentIt = studentList.iterator();
        Iterator<Course> courseIt = courseList.iterator();
        Iterator<Integer> enrolIt = enrolList.iterator();
        while (studentIt.hasNext() && courseIt.hasNext() && enrolIt.hasNext()) {
            Course course = courseIt.next();
            if (enrolList.get(course.getCourseID()).toString().contains(enrolDate.toString()) && studentList.contains(enrolDate)) {
                // System.out.println(enrolList.get(course.next()));
            }
        }
    }


}
