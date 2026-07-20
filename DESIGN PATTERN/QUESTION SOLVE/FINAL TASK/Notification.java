import java.util.ArrayList;
import java.util.List;

interface observer {
    public void update(String msg);
}

interface subject {
    public void addObserver(observer user);

    public void removeObserver(observer user);

    public void notifyUser(String msg);
}

// subject class
class classRoom implements subject {
    public List<observer> observers = new ArrayList<>();

    public void addObserver(observer user) {
        observers.add(user);
    }

    public void removeObserver(observer user) {
        observers.remove(user);
    }

    public void notifyUser(String msg) {
        for (observer user : observers) {
            user.update(msg);
        }
    }
}

// observer class
class teacher implements observer {
    public void update(String msg) {
        System.out.println("Teacher got noftification " + msg);
    }
}

class student implements observer {
    public void update(String msg) {
        System.out.println("Student got notification " + msg);
    }
}

public class Notification {
    public static void main(String[] args) {
        classRoom cr = new classRoom();

        observer user1 = new teacher();
        observer user2 = new student();

        // subscribe
        cr.addObserver(user1);
        cr.addObserver(user2);

        cr.notifyUser("Class routine is published");

        // unsubscribe
        cr.removeObserver(user2);
        cr.notifyUser("Exam routine is published");
    }
}
