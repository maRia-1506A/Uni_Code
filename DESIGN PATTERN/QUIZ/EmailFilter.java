class EmailRequest {
    String mail;
    Boolean isSpam;
    Boolean hasVirus;

    public EmailRequest(String mail, Boolean isSpam, Boolean hasVirus) {
        this.mail = mail;
        this.isSpam = isSpam;
        this.hasVirus = hasVirus;
    }
}

interface emailHandler {
    void setNext(emailHandler nextHandler);

    void handle(EmailRequest request);
}

abstract class BaseHandler implements emailHandler {
    public emailHandler next;

    public void setNext(emailHandler nextHandler) {
        this.next = nextHandler;
    }

    public void forward(EmailRequest request) {
        if (next != null) {
            next.handle(request);
        } else {
            System.out.println("Aunthorization passed");
        }
    }
}

class SpamFilter extends BaseHandler {
    public void handle(EmailRequest request) {
        if (request.isSpam) {
            System.out.println("Email blocked");
        } else {
            System.out.println("Passed");
            forward(request);
        }
    }
}

class VirusScanner extends BaseHandler {
    public void handle(EmailRequest request) {
        if (request.hasVirus) {
            System.out.println("Email blocked");
        } else {
            System.out.println("Passed");
            forward(request);
        }
    }
}

public class EmailFilter {
    public static void main(String[] args) {
        emailHandler spam = new SpamFilter();
        emailHandler virus= new VirusScanner();

        spam.setNext(virus);
        spam.setNext(spam);

        EmailRequest em= new EmailRequest("Hello", false, true);
        spam.handle(em);
    }
}