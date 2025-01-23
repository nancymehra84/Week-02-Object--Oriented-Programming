import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    private String courseName;
    private List<Student> students; // List of students enrolled in the course

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this);
        }
    }

    public List<String> listStudents() {
        List<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            studentNames.add(student.getName());
        }
        return studentNames;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Student class
class Student {
    private String name;
    private List<Course> courses; // List of courses the student is enrolled in

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public List<String> listCourses() {
        List<String> courseNames = new ArrayList<>();
        for (Course course : courses) {
            courseNames.add(course.getCourseName());
        }
        return courseNames;
    }

    public String getName() {
        return name;
    }
}

// School class
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public List<String> listStudents() {
        List<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            studentNames.add(student.getName());
        }
        return studentNames;
    }

    public String getSchoolName() {
        return schoolName;
    }
}

// Main class to demonstrate functionality
public class SchoolandStudents {
    public static void main(String[] args) {
        // Create a school
        School mySchool = new School("KNHS");

        // Create students
        Student nancy = new Student("Nancy");
        Student muskan = new Student("Muskan");

        // Add students to the school
        mySchool.addStudent(nancy);
        mySchool.addStudent(muskan);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in courses
        math.enrollStudent(nancy);
        math.enrollStudent(muskan);
        science.enrollStudent(muskan);

        // Students can view the courses they are enrolled in
        System.out.println(nancy.getName() + " is enrolled in: " + nancy.listCourses());
        System.out.println(muskan.getName() + " is enrolled in: " + muskan.listCourses());

        // Courses can view their enrolled students
        System.out.println("Students in " + math.getCourseName() + ": " + math.listStudents());
        System.out.println("Students in " + science.getCourseName() + ": " + science.listStudents());

        // School can list all its students
        System.out.println("Students in " + mySchool.getSchoolName() + ": " + mySchool.listStudents());
    }
}

