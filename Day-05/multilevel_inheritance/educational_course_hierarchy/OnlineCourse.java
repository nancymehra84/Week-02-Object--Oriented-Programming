package multilevel_inheritance.educational_course_hierarchy;


//subclass
class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    @Override
    public String toString() {
        return super.toString() + ", Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No");
    }
}
