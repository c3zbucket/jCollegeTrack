import java.util.ArrayList;

public class CourseRecords {

    private ArrayList<Course> CourseList;

    // Array constructor class
    public CourseRecords() {
        CourseList = new ArrayList<>();

    }

    // Add a course to the list
    public void add(Course course ){
        CourseList.add(course);

    }

    // Remove a course from the list
    public void remove(Course course){
        CourseList.remove(course);
    }

    // Check number of Courses
    public void CourseCount() {
        if (CourseList.isEmpty()){
            System.out.println("No students found");
        }
        System.out.println("There are: " + CourseList.size() + "course(s) being taught");
    }

    // Search all courses that match a query
    public void nameSearch(String searchQuery) {
        boolean found = false;
        for (Course course : CourseList) {
            if (course.getTitle().toLowerCase().contains(searchQuery.toLowerCase())) {
                System.out.println(course.displayRecord());
            } else if (!found) {
                System.out.println("Course with that surname was not found, maybe try forename?");
            } else {
                System.out.println("Invalid query, try again");
            }
        }
    }

    // Search for a course with a specified ID number
    public void idOutput(int IDQuery) {
        boolean found = false;
        int i = 0;
        while (i < CourseList.size()) {
            if (CourseList.get(i).getCourseID() == IDQuery) {
                System.out.println(CourseList.get(i).displayRecord());
                found = true;
            }
            else if (!found){
                System.out.println("Course with the entered ID was not found");
            }
            else {
                System.out.println("Invalid input, try again");
            }
        }
    }

    // Remove a specified course by ID
    public void remove(int IDQuery) {
        boolean found = false;
        for (Course course : CourseList){
            if (IDQuery == course.getCourseID()) {
                System.out.println("Removing course: " + course);
                System.out.println(CourseList.remove(course));
                found = true;
            }
            else if (!found){
                System.out.println("Course with the entered ID was not found");
            }
            else {
                System.out.println("Invalid input, try again");
            }
        }
    }

    // Output a list of all courses
    public void outputCourses() {
        for (Course course : CourseList){
            System.out.println(course.displayRecord());
        }
    }
}

