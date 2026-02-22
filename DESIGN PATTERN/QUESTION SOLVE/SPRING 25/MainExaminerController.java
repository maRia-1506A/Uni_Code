class ExaminerController {
    private static ExaminerController instance;
    private boolean isSubmit= false;

    private ExaminerController() {
        System.out.println("Examinee....");
    }

    public static ExaminerController isInstance () {
        if (instance == null) {
            instance= new ExaminerController();
        }
        return instance;
    }

    public void submitQues(String msg) {
        if(isSubmit) {
            System.out.println("!!!Question is already submitted!!!");
            return;
        }
        isSubmit=true;
        System.out.println("Question is submitted successfully");
    }
}

public class MainExaminerController{
    public static void main(String[] args) {
        ExaminerController examinner1= ExaminerController.isInstance();
        examinner1.submitQues("SWE");
        ExaminerController examinner2= ExaminerController.isInstance();
        examinner2.submitQues("EEE");
    }
}