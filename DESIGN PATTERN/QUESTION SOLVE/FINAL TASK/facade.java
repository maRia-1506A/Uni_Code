interface onlineExam {
    public void execute();
}

class AuthenticationService implements onlineExam {
    public void execute() {
        System.out.println("Student is verified");
    }
}

class QuestionService implements onlineExam {
    public void execute() {
        System.out.println("Exam question is loaded");
    }
}

class TimerService implements onlineExam {
    public void execute() {
        System.out.println("The exam timer starts");
    }
}

class examFacade {
    private onlineExam authentication;
    private onlineExam question;
    private onlineExam timer;

    public examFacade() {
        this.authentication = new AuthenticationService();
        this.question = new QuestionService();
        this.timer = new TimerService();
    }

    public void onlineExamSystem() {
        authentication.execute();
        question.execute();
        timer.execute();
    }
}

public class facade {
    public static void main(String[] args) {
        examFacade exam= new examFacade();
        exam.onlineExamSystem();
    }

}
