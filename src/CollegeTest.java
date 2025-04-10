import java.util.GregorianCalendar;

public class CollegeTest {

    /**
     * Constructor method
     */
    public CollegeTest() {
    }

    // To minimise code length, some user requirement test cases have been combined
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
    public void test_003b(int IDQuery) {
        println("Test 3a | Return student object with given student ID number ----------------");
        println("--------------------------------- Test 3b  ----------------------------------");
        College st = new College();
        studentIDSearch(st, IDQuery);
        println("--------------------------------- Test 3b  ----------------------------------");
    }

    /**
     * Test method 3b |
     * Output students that match a given surname
     */
    public void test_003b() {
        println("Test 3b | Outputting Students That Match a Given Surname -------------------");
        println("--------------------------------- Test 3b  ----------------------------------");
        College st = new College();
        studentNameSearch(st, "Fritz");
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
        studentIDRemove(st, IDQuery);
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
        courseNameSearch(st,searchQuery);
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
        courseIDRemove(st, IDQuery);
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
        printEnrolments(st);
        println("--------------------------------- Test 5a/5c  ------------------------------");
    }

    /**
     * Test method 5b |
     * Removing an enrolment for a given student and course ID numbers
     */
    public void test_005b(int studentIDQuery, int courseIDQuery) {
        println("Test 5b | Removing an Enrolment For Given IDs ------------------------------");
        println("--------------------------------- Test 5b  ---------------------------------");
        College st = new College();
        populateStudents(st);
        populateCourses(st);
        enrolStudents(st);
        printEnrolments(st);
        withdraw(st, studentIDQuery,courseIDQuery);
        printEnrolments(st);
        println("--------------------------------- Test 5b  ---------------------------------");
    }

    /**
     * Test method 6a |
     * Outputting enrolments made between given dates
     */
    public void test_006a(int studentIDQuery, int courseIDQuery) {
        println("Test 6a | Outputting Enrolments Between Given Dates ------------------------");
        println("--------------------------------- Test 6a  ---------------------------------");
        College st = new College();
        populateStudents(st);
        populateCourses(st);
        enrolStudents(st);
        printEnrolments(st);
        withdraw(st, studentIDQuery,courseIDQuery);
        printEnrolments(st);
        println("--------------------------------- Test 6a  ---------------------------------");
    }

    /**
     * Populate the college with students
     * @param st an object instance of the college class
     */
    public void populateStudents(College st) {
        println("************ Populating Students ************");
        st.add(new Student(1876, "Leon Kennedy", "07562508987"));
        st.add(new Student(1234, "Michael Townsley", "098329823"));
        st.add(new Student(1894, "Beany Beanio", "098329973"));
        st.add(new Student(2045, "Jennifer Brown", "075891234"));
        st.add(new Student(3156, "David Rodriguez", "073425678"));
        st.add(new Student(4267, "Samantha Lee", "079345678"));
        st.add(new Student(8973, "Makoto Yuki", "073018975"));
        st.add(new Student(5378, "Ahmed Khan", "071456789"));
        st.add(new Student(6489, "Priya Patel", "077567890"));
        st.add(new Student(8973, "Cal Enders", "089018989"));
        st.add(new Student(7591, "Ryan Chen", "074678901"));
        st.add(new Student(8602, "Olivia Wilson", "072789012"));
        st.add(new Student(9713, "Jamal Washington", "078890123"));
        st.add(new Student(1824, "Sophia Garcia", "076901234"));
        st.add(new Student(2935, "Maddie Kim", "073012345"));
        println("************ Populating Students ************");
    }

    public void populateCourses(College st) {
        println("************ Populating Courses *************");
        st.add(new Course(1893, "OOP Programming", "Computer Science", 10000.56));
        st.add(new Course(2156, "Data Structures and Algorithms", "Computer Science", 11000.25));
        st.add(new Course(3278, "Database Management Systems", "Computer Science", 10000.75));
        st.add(new Course(3412, "Computer Networks", "Computer Science", 11000.00));
        st.add(new Course(4125, "Artificial Intelligence", "Computer Science", 12000.50));
        st.add(new Course(4367, "Web Development", "Computer Science", 10000.25));

        st.add(new Course(2201, "Calculus and Analysis", "Mathematics", 9500.00));
        st.add(new Course(2305, "Linear Algebra", "Mathematics", 9000.75));
        st.add(new Course(2410, "Discrete Mathematics", "Mathematics", 9200.50));
        st.add(new Course(2515, "Probability and Statistics", "Mathematics", 9800.25));
        st.add(new Course(2620, "Number Theory", "Mathematics", 9300.00));

        st.add(new Course(3501, "Quantum Physics", "Science", 10500.00));
        st.add(new Course(3605, "Organic Chemistry", "Science", 10800.75));
        st.add(new Course(3710, "Molecular Biology", "Science", 11200.50));
        st.add(new Course(3815, "Astronomy and Astrophysics", "Science", 10600.25));
        st.add(new Course(3920, "Environmental Science", "Science", 9900.00));

        st.add(new Course(5101, "Human Anatomy", "Medicine", 13500.00));
        st.add(new Course(5205, "Pharmacology", "Medicine", 14000.75));
        st.add(new Course(5310, "Clinical Medicine", "Medicine", 15200.50));
        st.add(new Course(5415, "Medical Ethics", "Medicine", 12600.25));
        st.add(new Course(5520, "Public Health", "Medicine", 13900.00));

        st.add(new Course(4701, "Structural Engineering", "Engineering", 12500.00));
        st.add(new Course(4805, "Electrical Circuits", "Engineering", 12800.75));
        st.add(new Course(4910, "Mechanical Systems", "Engineering", 13200.50));
        st.add(new Course(5015, "Chemical Engineering", "Engineering", 12600.25));
        st.add(new Course(5120, "Civil Engineering Design", "Engineering", 12900.00));
        println("*********************************************");
    }

    public void enrolStudents(College st){
        st.enrol(2935,4367,(new GregorianCalendar(2009,05,20)));
        st.enrol(7591,3412,(new GregorianCalendar(2012,07,19)));
        st.enrol(6489, 3278, new GregorianCalendar(2018, 04,20));
        st.enrol(6489, 4125, (new GregorianCalendar(2018, 05, 19)));
        st.enrol(7591, 3278, (new GregorianCalendar(2018, 04, 20)));
    }

    public void printStudents(College st){
        println("********************** Students ***********************");
        st.outputStudents();
        println("*******************************************************");
    }

    public void printCourses(College st){
        println("********************** Students ***********************");
        st.outputCourses();
        println("*******************************************************");
    }

    public void studentNameSearch(College st, String nameQuery){
       st.studentNameSearch(nameQuery);
    }

    public void courseNameSearch(College st, String nameQuery){
        st.courseNameSearch(nameQuery);
    }

    public void printEnrolments(College st){
        st.outputEnrolments();
    }

    public void studentIDSearch(College st, int IDQuery){
        st.studentIDSearch(IDQuery);
    }

    public void courseIDSearch(College st, int IDQuery){
        st.courseIDSearch(IDQuery);
    }

    public void studentIDRemove(College st, int IDQuery){
        st.studentIDRemove(IDQuery);
    }

    public void courseIDRemove(College st, int IDQuery){
        st.courseIDRemove(IDQuery);
    }

    public void withdraw(College st, int studentIDQuery, int courseIDQuery){
        st.withdraw(studentIDQuery, courseIDQuery);
    }

    public static void main(String[] args) {
        /**
         * Creating an object of type CollegeTest to run test methods
         */
        CollegeTest st = new CollegeTest();

        /**Run test method 1*/
        // st.test_001();

        /**Run test method 2*/
        // st.test_002();

        /**Run test method 3*/
        // st.test_003();

        /**Run test method 3*/
        // st.test_004c();



        /**Run test method 4b*/
        // st.test_004b(searchQuery);

    }

    /**
     * Convenience method for string output
     * @param s The string you want to output
     */
    public static void println(String s) {
        System.out.println(s);
    }
}

    //public static void main(String[] args){
      // StudentRecords test1 = new StudentRecords();

