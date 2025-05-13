/**
 * Import required libraries
 */
import java.time.format.DateTimeFormatter; //Format dates easily; used in conjunction with java.Date
import java.util.ArrayList;
import java.time.LocalDate; //Manipulate dates easily; used in conjunction with java.DateTimeFormatter
import java.util.Iterator;

/**
 * Main class that handles and maintains all collections
 * @author Mueez Ahmad
 * @version 10/04/2025
 */
public class College {
    //Attributes declaration

    /**
     * Create a list of student objects from the Student clas
     */
    private ArrayList<Student>studentList;
    /**
     * Create a list of course objects from the Course class
     */
    private ArrayList<Course>courseList;
    /**
     * Create a list of enrolment objects from the Enrolment class
     */
    private ArrayList<Enrolment>enrolList;

    /**
     * Constructor method for arraylists
     */
    public College() {

        courseList = new ArrayList<>();
        studentList = new ArrayList<>();
        enrolList = new ArrayList<>();

    }

    /**
     * Added functionality
     * Method to check if Student ID inputs are valid
     * @param IDQuery the student ID to check validity for
     * @return if validity of th input student ID
     */
    private boolean validStudentID(int IDQuery) {
        boolean isValid = true; //Boolean status set to 'true' at the beginning
        if (IDQuery < 1000 || IDQuery > 9999) {
            System.out.println("Invalid ID entered, try again");
            isValid = false; //False if invalid ID
        }
        return isValid; // Return status ID
    }

    /**
     * Added functionality
     * Method to check if Course ID inputs are valid
     * @param IDQuery the course ID to check validity for
     * @return if validity of th input course ID
     */
    protected boolean validCourseID(int IDQuery) {
        boolean isValid = true; // Boolean status initialised (similar to validStudentID method above)
        if (IDQuery < 100 || IDQuery > 999) {
            System.out.println("Invalid ID entered, try again");
            isValid = false;
        }
        return isValid;
    }

    //#######################################################################
    // STUDENT METHODS
    //#######################################################################

    /**
     * Enroll a student to the list
     * @param student Create new student instance
     */
    public void add(Student student) {
        studentList.add(student); // Add a new student object to the student list arraylist
    }

    /**
     * Remove a student with a given surname
     * @param searchQuery surname to remove
     */
    public void studentNameRemove(String searchQuery) {
        Iterator<Student> stIterator = studentList.iterator(); // Iterator intialised for iterating through student list
        boolean found = false;
        //Loop throughout the student arraylist with iterator
        while (stIterator.hasNext()) {
            Student student = stIterator.next();
            /*Compare the input name with the last item of the index in names, ergo the surname.
             * This allows for you to input a full name regularly, for convenience,  without the need of a separate attribute for surnames
             * Reference: Le Callonnec, S. (2013). Java: Getting a substring from a string starting after a particular character. [online] Stack Overflow. Available at: https://stackoverflow.com/a/14316548.
             * */
            if (student.getName().substring(student.getName().lastIndexOf(" ") + 1).equalsIgnoreCase(searchQuery)) {
                println("Student with query: " + "'" + searchQuery + "'" + " was found:");
                student.displayRecord();
                stIterator.remove(); // Removed through iterator for safe removal
                // Declare as true if the student matching the query was found
                found = true;
                }
        }
        if (!found){
            println("Student with query: " + "'" + searchQuery + "'" + " was not found");
        }
    }

    /**
     * Remove a student with a given ID
     * @param IDQuery ID of the student to remove
     */
    public void studentIDRemove(int IDQuery) {
        Iterator<Student> stIterator = studentList.iterator(); // Iterator initialised; Similar to studentNameRemove method above
        if (validStudentID(IDQuery)){
            boolean found = false;
            while (stIterator.hasNext()) { // While the iterator is going on..
                Student student = stIterator.next();
                if (IDQuery == student.getStudentID()) {
                    println("Removing student: " + student.getName() + " (ID: " + student.getStudentID() + ")");
                    stIterator.remove();
                    found = true;
                }
            }
            if (!found) {
                println("Student with the entered ID was not found");
            }
        }
    }

    /**
     * Check number of joined students
     */
    private void studentCount() {
        if (studentList.isEmpty()) { // If the student list is empty
            println("No students found");
        }
        println("There are: " + studentList.size() + " student(s) enrolled in the college currently");
    }

    /**
     * Search all students that match by surname; and output if they do
     * @param searchQuery Name to search students of
     */
    public void studentNameSearch(String searchQuery) {
        Iterator<Student> stIterator = studentList.iterator();
        boolean found = false;
        ArrayList<String> results = new ArrayList<>(); //Add found students to an arraylist to display at the end, especially useful if there are multiple to avoid "student" found for each individual student matching the search query
        while (stIterator.hasNext()) {
            Student student = stIterator.next();
            /*Compare the input name with the last item of the index in names, ergo the surname.
            * This allows for you to input a full name regularly, for convenience,  without the need of a separate attribute for surnames
            * Reference: Le Callonnec, S. (2013). Java: Getting a substring from a string starting after a particular character. [online] Stack Overflow. Available at: https://stackoverflow.com/a/14316548.
            * */
            if (student.getName().substring(student.getName().lastIndexOf(" ") + 1).equalsIgnoreCase(searchQuery)) {

                results.add(student.displayRecord());
                found = true;
            }
        }
        if (found) {
            println("Student(s) with query: " + "'" + searchQuery + "'" + " was found:");
            println("");
            for (String result : results) { //Print each result from the list, if true
                println(result);
            }
        }
        else {
            println("Student with that name was not found, recheck your search and try again.");
        }
    }

    /**
     * Search for a student with an ID; and output if it is found
     * @param IDQuery ID of the student to search for
     */
    public void studentIDSearch(int IDQuery) {
        boolean invalidID = false;
        if (validStudentID(IDQuery)) {
            if (!invalidID) {
                boolean found = false;
                for (Student student : studentList) { // For each student object in the student list..
                    if (student.getStudentID() == IDQuery) {
                        println("Student with ID: " + "'" + IDQuery + "'" + " was found:");
                        println(student.displayRecord());
                        found = true;
                    }
                }
                if (!found) {
                    println("Student with the entered ID was not found, recheck your search and try again.");
                }
            }
        }
    }

    /**
     * Output all students
     */
    public void outputStudents() {
        for (Student student : studentList){ //Similar to studentID method above
            println(student.displayRecord());
        }
    }

    //#######################################################################
    // COURSE METHODS
    //#######################################################################

    /**
     * Add a course to the list
     * @param course The course that will be added
     */
    public void add(Course course) {
                courseList.add(course); //Add a new course object to the course list
                println("Course:  " + course.getTitle() + ", under department: " + course.getDept() +  " has been added");
    }

    /**
     * Check number of Courses
     */
    private void courseCount () {
        if (courseList.isEmpty()) { //If the course list is empty
            println("Course list is empty.");
        }
        println("There are: " + courseList.size() + " course(s) being taught");
    }

    /**
     * Search all courses that match a query; and output if found
     * @param searchQuery Name to search by
     */
    public void courseNameSearch (String searchQuery){
        boolean found = false;
        ArrayList<String> results = new ArrayList<>(); //Add found courses to an arraylist to display at the end; see studentNameSearch for more details
        for (Course course : courseList) {
            if (course.getTitle().toLowerCase().contains(searchQuery.toLowerCase())) {
                println("Course with query: " + "'" + searchQuery + "'" + " was found:");
                results.add(course.displayRecord());
                found = true;
            }
        }
            if (found){
                println("Course(s) with query: "+"'"+searchQuery +"'"+" was found:");
                println("");
                for(String result :results){ //Print each result from the list, if true
                    println(result);
                }
            }
        else {
            println("Course with that name was not found.");
        }
    }

    /**
     * Search for a course with a specified ID number; and output if found
     * @param IDQuery ID of the course you want to search
     */
    public void courseIDSearch(int IDQuery) {
        if (validCourseID(IDQuery)) {
            boolean found = false;
            for (Course course : courseList) {
                if (course.getCourseID() == IDQuery) {
                    println("Course with ID: " + "'" + IDQuery + "'" + " was found:");
                    println(course.displayRecord());
                    found = true;
                }
            }
            if (!found) {
                println("Course with the entered ID was not found");
            }
        }
    }

    /**
     * Added functionality
     * Remove a specified course by name
     * @param courseQuery The name of the course
     */
    public void courseNameRemove(String courseQuery){
        boolean found = false;
        // Setup Iterator for Course List
        Iterator<Course> coIterator = courseList.iterator();
        // Loop over courses with course iterator
        while (coIterator.hasNext()) {
            Course course = coIterator.next();
                if (course.getTitle().toLowerCase().contains(courseQuery.toLowerCase())) {
                    println("Course:  " + course.getTitle() + "with ID: " + course.getCourseID() + " has been removed");
                    coIterator.remove();
                    found = true;
                }
            }
        if (!found) {
            println("Course Title containing the query:  " + courseQuery + " could not be found");
        }
    }

    /**
     * Remove a specified course by ID
     * @param IDQuery ID of the course to remove
     */
    public void courseIDRemove(int IDQuery) {
        Iterator<Course> coIterator = courseList.iterator();
        boolean found = false;
        // Loop over courses with course iterator
        while (coIterator.hasNext()) {
            if (validCourseID(IDQuery)) {
                Course course = coIterator.next();
                if (IDQuery == course.getCourseID()) {
                    println("Removing course: " + course.getTitle() + " (ID: " + course.getCourseID() + ")");
                    coIterator.remove();
                    found = true;
                }
            }
        }
        if (!found) {
            println("Course with the entered ID was not found");
        }
    }

    /**
     * Output all courses taught
     */
    public void outputCourses() {
        for (Course course : courseList){
            println(course.displayRecord());
        }
    }

    //#######################################################################
    // ENROLMENT METHODS
    //#######################################################################

    /**
     * Method to enrol a student under a course with a given enrol date
     * @param studentID ID of the student to enrol
     * @param courseID ID of the course to enrol the student into
     * @param enrolDate Date of the enrolment
     */
    public void enrol(int studentID, int courseID, LocalDate enrolDate){
        if (studentID < 1000 || courseID < 100 ){
            println("Invalid IDs input, try again");
        }
        else {
            boolean found = false;
            for (Student student : studentList) {
                if (student.getStudentID() == studentID) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                println("Student with that ID is not in the list");
            }
            found = false;
            for (Course course : courseList) {
                if (course.getCourseID() == courseID) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                println("Course with that ID is not in the list");
            }

            else {
                enrolList.add(new Enrolment(studentID, courseID, enrolDate));
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                println("Student with the ID: " + studentID + " has been enrolled in the course: " + courseID + " on: " + enrolDate.format(format));
            }
        }
    }

    /**
     * Withdraw a given student from a specified course
     * @param studentID Student ID to withdraw
     * @param courseID Course ID to withdraw from
     */
    public void withdraw(int studentID, int courseID) {
        if (validStudentID(studentID) && validCourseID(courseID)){
            boolean found = false;
            for (Enrolment student : enrolList) {
                if (student.getStudentID() == studentID && student.getCourseID() == courseID) {
                    println("Student with ID: " + student.getStudentID() + " has been withdrawn from course: " + student.getCourseID());
                    enrolList.remove(student);
                    found = true;
                    break;
                }
            }
            if (!found) {
                println("The student with the ID is not enrolled in this course; or the course does not exist");
            }
        }
    }

    /**
     * Output all enrolments
     */
    public void allEnrols() {
        boolean found = false;
        for (Student student : studentList) {
            for (Course course : courseList) {
                for (Enrolment enrol : enrolList) {
                    if (enrol.getStudentID() == student.getStudentID() && enrol.getCourseID() == course.getCourseID() ) {
                            println(enrol.displayRecord(student, course));
                            found = true;
                    }
                }
            }
        }
        if (!found) {
            println("Enrolment list is empty");
        }
    }

    /**
     * Output all enrolments between given dates
     * @param startDate Start of date range to compare to (in DD-MM-YYYY)
     * @param endDate end of date range to compare to (in DD-MM-YYYY)
     */
    public void outputEnrolments(String startDate, String endDate) {
        boolean found = false;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //Format dates in the format: dd-mm-yyyy
        ArrayList<String> results = new ArrayList<>(); //Add found enrolments to an arraylist to display at the end; see studentNameSearch for more details
        //Source: Oracle (2025). Java Docs | java.Date. [online] Oracle.com. Available at: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Date.html.
        /*Parse the following dates under that format*/
        LocalDate startD = LocalDate.parse(startDate, format);
        LocalDate endD = LocalDate.parse(endDate, format);
        //Source:  Oracle (2025a). Java Docs | DateTimeFormatter. [online] docs.oracle.com. Available at: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html.
        /*For each student, in each course, under each enrolment*/
        for (Student student : studentList) {
            for (Course course : courseList) {
                for (Enrolment enrol : enrolList) {
                    /*If the student and course IDs match with the query*/
                    if (enrol.getStudentID() == student.getStudentID() && enrol.getCourseID() == course.getCourseID() ) {
                        if (enrol.compareDate(startD, endD)){
                            results.add(enrol.displayRecord(student, course));
                            found = true;
                        }
                    }
                }
            }
        }
        if (found) {
            println("Enrolment(s) made between the dates: " + "'" + startD + " - " + endD + "'" + " was found:");
            println("");
            for (String result : results) { //Print each result from the list, if true
                println(result);
            }
        }
       if (!found) {
           println("Enrolment(s) between those dates were not found");
       }
    }

    /**
     * Added functionality
     * Output enrolments for a given surname
     * @param searchQuery the surname of the student you want to search for
     */
    public void nameEnrolments(String searchQuery)  {
        boolean found = false;
        ArrayList<String> results = new ArrayList<>(); //Add found enrolments to an arraylist to display at the end; see studentNameSearch for more details
        /*Loops through respective lists; see outputEnrolments for more detail*/
        for (Student student : studentList) {
            for (Course course : courseList) {
                for (Enrolment enrol : enrolList) {
                    if (enrol.getStudentID() == student.getStudentID() && enrol.getCourseID() == course.getCourseID()) {
                        /*Searches for an enrolment made under a specified student surname, refer to studentNameSearch() or studentNameRemove() for more information
                         * */
                        if (student.getName().substring(student.getName().lastIndexOf(" ") + 1).equalsIgnoreCase(searchQuery)) {
                            results.add(enrol.displayRecord(student, course));
                            found = true;
                        }
                    }
                }
            }
        }
        if (found) {
            println("Enrolment(s) made under the name query: " + "'" + searchQuery + "'" + " was found:");
            println("");
            for (String result : results) { //Print each result from the list, if true
                println(result);
            }
        }
        if (!found) {
            println("Enrolments under this student were not found");
        }
    }
    /**
     * Added functionality
     * Output enrolments for a given student ID
     * @param IDQuery student ID to find enrolments for
     */
    public void studentIDEnrols(int IDQuery)  {
        ArrayList<String> results = new ArrayList<>(); //Add found enrolments to an arraylist to display at the end; see studentNameSearch for more details
        if (validStudentID(IDQuery)) {
            boolean found = false;
            for (Student student : studentList) {
                for (Course course : courseList) {
                    for (Enrolment enrol : enrolList) {
                        if (enrol.getStudentID() == student.getStudentID() && enrol.getCourseID() == course.getCourseID()) {
                            if (student.getStudentID() == IDQuery) {
                                results.add(enrol.displayRecord(student, course));
                                found = true;
                            }
                        }
                    }
                }
            }
        if (found) {
            println("Enrolment(s) made under the ID query: " + "'" + IDQuery + "'" + " was found:");
            println("");
            for (String result : results) { //Print each result from the list, if true
                println(result);
            }
        }
            if (!found) {
                println("Enrolments made under that student ID not found");
            }
        }
    }
    /**
     * Convenience method for string output
     * @param s The string you want to output
     */
    public void println(String s){
        System.out.println(s);
    }

}
