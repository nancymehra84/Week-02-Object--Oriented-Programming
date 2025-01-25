package multilevel_inheritance.educational_course_hierarchy;

//super class
class Course{
    //Attribute
    String courseName;
    int duration;

    //Constructor
    Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }
    @Override
    public String toString() {
        return "Course Name: " + courseName + ", Duration: " + duration + " hours";
    }
}
