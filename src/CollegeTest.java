/**Import required libraries*/

import java.text.ParseException;
import java.time.LocalDate;

/**
 * Class to handle tests to showcase functionality meeting user requirements
 * @author Mueez Ahmad
 * @version 10/04/2025
 */
public class CollegeTest {

    /**
     * Constructor method
     */
    public CollegeTest() {
    }

    // To minimise code length, some user requirement tests have been combined

    /**
     * Test method 1a,1c |
     * Adding and outputting students
     */
    public void test_001ac() {
        println("Test 1a,1c | Adding and Outputting Students --------------------------------");
        println("--------------------------------- Test 1a/1c  ------------------------------");
        College st = new College();
        populateStudents(st);
        printStudents(st);
        println("--------------------------------- Test 1a/1c  ------------------------------");
    }

    /**
     * Test method 1b |
     * Searching for a student with a given ID number
     */
    public void test_001b(int IDQuery) {
        println("Test 1b | Searching For A Student With A Given ID Number -------------------");
        println("--------------------------------- Test 1b  ----------------------------------");
        College st = new College();
        populateStudents(st);
        studentIDSearch(st, IDQuery);
        println("--------------------------------- Test 1b  ----------------------------------");
    }

    /**
     * Test method 2a,2c |
     * Adding and outputting courses
     */
    public void test_002ac() {
        println("Test 2a,2c | Adding and Outputting Courses ---------------------------------");
        println("--------------------------------- Test 2a/2c  ------------------------------");
        College st = new College();
        populateCourses(st);
        printCourses(st);
        println("--------------------------------- Test 2a/2c  ------------------------------");
    }

    /**
     * Test method 2b |
     * Searching for a course with a given ID number
     */
    public void test_002b(int IDQuery) {
        println("--------------------------------- Test 2b  ----------------------------------");
        println("Test 2b | Searching For A Course With A Given ID Number ---------------------");
        College st = new College();
        populateCourses(st);
        courseIDSearch(st, IDQuery);
        println("--------------------------------- Test 1  -----------------------------------");
    }

    /**
     * Test method 3a |
     * Return student object with given student ID number
     */
    public void test_003a(int IDQuery) {
        println("Test 3a | Return student object with given student ID number ----------------");
        println("--------------------------------- Test 3a  ----------------------------------");
        College st = new College();
        populateStudents(st);
        studentIDSearch(st, IDQuery);
        println("--------------------------------- Test 3a  ----------------------------------");
    }

    /**
     * Test method 3b |
     * Output students that match a given surname
     */
    public void test_003b(String searchQuery) {
        println("Test 3b | Outputting Students That Match a Given Surname -------------------");
        println("--------------------------------- Test 3b  ----------------------------------");
        College st = new College();
        populateStudents(st);
        studentNameSearch(st, searchQuery);
        println("--------------------------------- Test 3b  ----------------------------------");
    }

    /**
     * Test method 3c |
     * Removing a student with a given ID number
     */
    public void test_003c(int IDQuery) {
        println("Test 3c | Removing a Student With a Given ID Number -------------------------");
        println("--------------------------------- Test 3b  ----------------------------------");
        College st = new College();
        populateStudents(st);
        printStudents(st);
        studentIDRemove(st, IDQuery);
        println("-----------------------");
        printStudents(st);
        println("--------------------------------- Test 3b  ----------------------------------");
    }

    /**
     * Test method 4a |
     * Returning a course object with a particular ID number
     */
    public void test_004a(int IDQuery) {
        println("Test 3c | Returning a Course Object with a Given ID Number ------------------");
        println("--------------------------------- Test 4a  ----------------------------------");
        College st = new College();
        populateCourses(st);
        courseIDSearch(st, IDQuery);
        println("--------------------------------- Test 4a  ----------------------------------");
    }

    /**
     * Test method 4b |
     * Outputting all courses whose title contains a given search string
     */
    public void test_004b(String searchQuery) {
        println("Test 4b | Outputting Courses That Match a Given Search String ---------------");
        println("--------------------------------- Test 4b  ----------------------------------");
        College st = new College();
        populateCourses(st);
        courseNameSearch(st, searchQuery);
        println("--------------------------------- Test 4b  ----------------------------------");
    }

    /**
     * Test method 4c |
     * Removing a course with a given ID number
     */
    public void test_004c(int IDQuery) {
        println("Test 4c | Removing a Course With a Given ID Number --------------------------");
        println("--------------------------------- Test 4c  ----------------------------------");
        College st = new College();
        populateCourses(st);
        printCourses(st);
        courseIDRemove(st, IDQuery);
        println("-----------------------");
        printCourses(st);
        println("--------------------------------- Test 4c  ----------------------------------");
    }

    /**
     * Test method 5a,5c |
     * Enroling students and outputting their enrolments
     */
    public void test_005ac() {
        println("Test 5a,5c | Enroling Students and Outputting Enrolments -------------------");
        println("--------------------------------- Test 5a/5c  ------------------------------");
        College st = new College();
        populateStudents(st);
        populateCourses(st);
        enrolStudents(st);
        printAllEnrols(st);
        println("--------------------------------- Test 5a/5c  ------------------------------");
    }

    /**
     * Test method 5b |
     * Removing an enrolment for given student and course ID numbers
     */
    public void test_005b(int studentIDQuery, int courseIDQuery) {
        println("Test 5b | Removing an Enrolment For Given IDs ------------------------------");
        println("--------------------------------- Test 5b  ---------------------------------");
        College st = new College();
        populateStudents(st);
        populateCourses(st);
        enrolStudents(st);
        printAllEnrols(st);
        withdraw(st, studentIDQuery, courseIDQuery);
        println("-----------------------");
        printAllEnrols(st);
        println("--------------------------------- Test 5b  ---------------------------------");
    }

    /**
     * Test method 6a |
     * Outputting enrolments made between given dates
     */
    public void test_006a(String startDate, String endDate) throws ParseException {
        println("Test 6a | Outputting Enrolments Between Given Dates ------------------------");
        println("--------------------------------- Test 6a  ---------------------------------");
        College st = new College();
        populateStudents(st);
        populateCourses(st);
        printStudents(st);
        enrolStudents(st);
        printEnrolments(st, startDate, endDate);
        println("--------------------------------- Test 6a  ---------------------------------");
    }

    /**
     * Additional Functionality Test method 6oa |
     * Outputting enrolments under a student with a given surname
     */
    public void test_006oa(String searchQuery) {
        println("Test 6oa | Outputting Enrolments Under a Given Surname ----------------------");
        println("--------------------------------- Test 6oa  ---------------------------------");
        College st = new College();
        populateStudents(st);
        populateCourses(st);
        enrolStudents(st);
        enrolmentNameSearch(st, searchQuery);
        println("--------------------------------- Test 6oa  ---------------------------------");
    }

    /**
     * Additional Functionality Test method 6ob |
     * Outputting enrolments under a student with a given ID
     */
    public void test_006ob(int IDQuery) {
        println("Test 6ob | Outputting Enrolments Under a Given ID ---------------------------");
        println("--------------------------------- Test 6ob  ---------------------------------");
        College st = new College();
        populateStudents(st);
        populateCourses(st);
        enrolStudents(st);
        enrolmentIDSearch(st, IDQuery);
        println("--------------------------------- Test 6ob  ---------------------------------");
    }

    /**
     * Populate the college with students
     * @param st an object instance of the college class
     */
    public void populateStudents(College st) {
        println("************ Populating Students ************");
        st.add(new Student("Leon Kennedy", "07562508987"));
        st.add(new Student("Michael Townsley", "09832982893"));
        st.add(new Student("Beany Beanio", "09859329973"));
        st.add(new Student("Jennifer Brown", "07589127834"));
        st.add(new Student("David Rodriguez", "07342567458"));
        st.add(new Student("Samantha Lee", "07934566778"));
        st.add(new Student("Makoto Yuki", "07301849975"));
        st.add(new Student("Ahmed Mohammed Khan", "07145678469"));
        st.add(new Student("Priya Patel", "07756789700"));
        st.add(new Student("Cal Enders", "08901898009"));
        st.add(new Student("Ryan Chen", "07467890123"));
        st.add(new Student("Olivia Wilson", "07278934012"));
        st.add(new Student("Jamal Washington", "07880690123"));
        st.add(new Student("Sophia Garcia", "07690123934"));
        st.add(new Student("Maddie Lucidus Kim", "07301234589"));
        println("*********************************************");
    }

    /**
     * Populate the college with courses
     * @param st an object instance of the college class
     */
    public void populateCourses(College st) {
        println("************ Populating Courses *************");
        st.add(new Course("OOP Programming", "COMP", 10000.56));
        st.add(new Course("Data Structures and Algorithms", "COMP", 11000.25));
        st.add(new Course("Database Management Systems", "COMP", 10000.75));
        st.add(new Course("Computer Networks", "COMP", 11000.00));
        st.add(new Course("Artificial Intelligence", "COMP", 12000.50));
        st.add(new Course("Web Development", "COMP", 10000.25));

        st.add(new Course("Calculus and Analysis", "MATH", 9500.00));
        st.add(new Course("Linear Algebra", "MATH", 9000.75));
        st.add(new Course("Discrete Mathematics", "MATH", 9200.50));
        st.add(new Course("Probability and Statistics", "MATH", 9800.25));
        st.add(new Course("Number Theory", "MATH", 9300.00));

        st.add(new Course("Quantum Physics", "SCIE", 10500.00));
        st.add(new Course("Organic Chemistry", "SCIE", 10800.75));
        st.add(new Course("Molecular Biology", "SCIE", 11200.50));
        st.add(new Course("Astronomy and Astrophysics", "SCIE", 10600.25));
        st.add(new Course("Environmental Science", "SCIE", 9900.00));

        st.add(new Course("Human Anatomy", "MEDI", 13500.00));
        st.add(new Course("Pharmacology", "MEDI", 14000.75));
        st.add(new Course("Clinical Medicine", "MEDI", 15200.50));
        st.add(new Course("Medical Ethics", "MEDI", 12600.25));
        st.add(new Course("Public Health", "MEDI", 13900.00));

        st.add(new Course("Structural Engineering", "ENGI", 12500.00));
        st.add(new Course("Electrical Circuits", "ENGI", 12800.75));
        st.add(new Course("Mechanical Systems", "ENGI", 13200.50));
        st.add(new Course("Chemical Engineering", "ENGI", 12600.25));
        st.add(new Course("Civil Engineering Design", "ENGI", 12900.00));
        println("*********************************************");
    }

    /**
     * Populate the college with enrolments
     *
     * @param st an object instance of the college class
     */
    public void enrolStudents(College st) {
        println("************ Enroling Students *************");
        st.enrol(1001, 302, (LocalDate.of(2024, 5, 20)));
        st.enrol(1006, 302, (LocalDate.of(2024, 7, 19)));
        st.enrol(1006, 402, (LocalDate.of(2025, 4, 20)));
        st.enrol(1007, 101, (LocalDate.of(2024, 5, 19)));
        st.enrol(1010, 102, (LocalDate.of(2025, 4, 20)));
        st.enrol(1014, 102, (LocalDate.of(2024, 6, 23)));
        println("********************************************");
    }

    /**
     * Output students in the college
     *
     * @param st an object instance of the college class
     */
    public void printStudents(College st) {
        println("********************** Students ***********************");
        st.outputStudents();
        println("*******************************************************");
    }

    /**
     * Output courses in the college
     *
     * @param st an object instance of the college class
     */
    public void printCourses(College st) {
        println("********************** Courses ************************");
        st.outputCourses();
        println("*******************************************************");
    }

    /**
     * Output students matching a search query
     *
     * @param st        an object instance of the college class
     * @param nameQuery the surname of the student to be searched
     */
    public void studentNameSearch(College st, String nameQuery) {
        st.studentNameSearch(nameQuery);
    }

    /**
     * Output courses matching a search query
     *
     * @param st        an object instance of the college class
     * @param nameQuery the name of the course to be searched
     */
    public void courseNameSearch(College st, String nameQuery) {st.courseNameSearch(nameQuery);
    }

    /**
     * Output enrolments that match a given surname
     *
     * @param st          an object instance of the college class
     * @param searchQuery surname of the student you want to find enrolments for
     */
    public void enrolmentNameSearch(College st, String searchQuery) {
        st.nameEnrolments(searchQuery);
    }

    /**
     * Output enrolments that match a given surname
     *
     * @param st      an object instance of the college class
     * @param IDQuery ID of the student you want to find enrolments for
     */
    public void enrolmentIDSearch(College st, int IDQuery) {
        st.studentIDEnrols(IDQuery);
    }

    /**
     * Output enrolments made between two given dates
     *
     * @param st        an object instance of the college class
     * @param startDate start date to compare to enrolment date
     * @param endDate   end date to compare to enrolment date
     */
    public void printEnrolments(College st, String startDate, String endDate) throws ParseException {
        st.outputEnrolments(startDate, endDate);
    }

    /**
     * Output all enrolments
     *
     * @param st an object instance of the college class
     */
    public void printAllEnrols(College st) {
        st.allEnrols();
    }

    /**
     * Output a student with the matching ID
     *
     * @param st      an object instance of the college class
     * @param IDQuery ID of the student to be searched
     */
    public void studentIDSearch(College st, int IDQuery) {
        st.studentIDSearch(IDQuery);
    }

    /**
     * Output a course with the matching ID
     *
     * @param st      an object instance of the college class
     * @param IDQuery ID of the course to be searched
     */
    public void courseIDSearch(College st, int IDQuery) {
        st.courseIDSearch(IDQuery);
    }

    /**
     * Remove a student with a given ID
     *
     * @param st      an object instance of the college class
     * @param IDQuery ID of the student to be removed
     */
    public void studentIDRemove(College st, int IDQuery) {
        st.studentIDRemove(IDQuery);
    }

    /**
     * Remove a course with a given ID
     *
     * @param st      an object instance of the college class
     * @param IDQuery ID of the course to be removed
     */
    public void courseIDRemove(College st, int IDQuery) {
        st.courseIDRemove(IDQuery);
    }

    /**
     * Withdraw a student from a course with a given student ID and course ID
     *
     * @param st             an object instance of the college class
     * @param studentIDQuery ID of the student to remove course from
     * @param courseIDQuery  ID of the course to remove them from
     */
    public void withdraw(College st, int studentIDQuery, int courseIDQuery) {
        st.withdraw(studentIDQuery, courseIDQuery);
    }

    /**
     * Convenience method for string output
     *
     * @param s The string you want to output
     */
    public void println(String s) {
        System.out.println(s);
    }


    /**
     * Main method to execute tests
     * @param args standard placeholder arguments for a java class to function
     */
    public static void main(String[] args) throws ParseException {

        /**Creating an object of type CollegeTest to run test methods*/
        CollegeTest st = new CollegeTest();

        /**Run test method 1a,1c - Add and output students*/
        //st.test_001ac();

        /**Run test method 1b - Searching for a student with ID*/
        //st.test_001b(1010);

            //Entering an ID not in the records
            //st.test_001b(1089);

            //Entering an invalid ID (Lower than 1000 or higher than 9999)
            //st.test_001b(89789);

        /**Run test method 2a, 2c - Add and output courses */
        //st.test_002ac();


        /**Run test method 2b - Search for a courses with an ID*/
        //st.test_002b(104);

        /**Run test method 3a - Return a student with a given ID*/
        //st.test_003a(1012);

        /**Run test method 3b - Output students that match a given surname*/
        //st.test_003b("Brown");

        /**Run test method 3c - Remove a student with a given ID*/
        //st.test_003c(1011);

        /**Run test method 4a - Return a course with a given ID*/
        //st.test_004a(202);

        /**Run test method 4b - Output courses that match a given name*/
        //st.test_004b("Data");

        /**Run test method 4c - Remove a course with a given ID*/
        //st.test_004c(503);

        /**Run test method 5a,5c - Enrol students and outputting their enrolments*/
        //st.test_005ac();

        /**Run test method 5b - Removing an enrolment for given student and course ID numbers*/
        //st.test_005b(1014, 102);

        /**Run test method 6a - Output enrolments made between given dates */
        //st.test_006a("23-01-2024", "24-07-2024");

        /**Run additional functionality test method 6a - Output enrolments made under a given student surname */
        //st.test_006oa("Kim");

        /**Run additional functionality test method 6a - Output enrolments made under a given student ID */
        //st.test_006ob(9238);

    }

}