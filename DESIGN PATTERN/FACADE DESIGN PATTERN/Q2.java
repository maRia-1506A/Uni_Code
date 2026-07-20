interface registration {
    public void execute();
}

class CourseCatalog implements registration {
    public void execute() {
        System.out.println("Course available");
    }
}

class FeeSystem implements registration {
    public void execute() {
        System.out.println("Fee is successfully paid");
    }
}

class SeatAllocation implements registration {
    public void execute() {
        System.out.println("Seat aloocated");
    }
}

class StudentRegistration {
    private registration course;
    private registration fee;
    private registration seat;

    public StudentRegistration(){
        this.course= new CourseCatalog();
        this.seat= new SeatAllocation();
        this.fee= new FeeSystem();
    }

    public void registrationMethod(){
        course.execute();
        fee.execute();
        seat.execute();
    }
}
public class Q2 {
    public static void main(String[] args) {
        StudentRegistration reg= new StudentRegistration();
        reg.registrationMethod();
    }

}
