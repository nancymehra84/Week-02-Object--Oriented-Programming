package multilevel_inheritance.educational_course_hierarchy;

// Subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // Discount in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFee() {
        return fee;
    }

    public double getDiscount() {
        return discount;
    }

    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Fee: " + fee + ", Discount: " + discount + ", Final Fee: " + calculateFinalFee();
    }
}

