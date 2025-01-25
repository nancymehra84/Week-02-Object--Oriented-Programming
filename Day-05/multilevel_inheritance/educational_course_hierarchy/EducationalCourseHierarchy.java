package multilevel_inheritance.educational_course_hierarchy;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Create a Course instance
        Course course = new Course("Introduction to Programming", 40);

        // Create an OnlineCourse instance
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming Basics", 30, "Udemy", true);

        // Create a PaidOnlineCourse instance
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 50, "Coursera", true, 200.0, 15.0);

        // Print details
        System.out.println(course);
        System.out.println(onlineCourse);
        System.out.println(paidCourse);
    }
}

