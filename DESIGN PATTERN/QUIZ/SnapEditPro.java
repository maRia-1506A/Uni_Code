// decorator 

interface photoEdit {
    public void display();
}

class basicPhoto implements photoEdit {
    public void display() {
        System.out.println("Basic photo");
    }
}

class decoratedPhoto implements photoEdit {
    public photoEdit photo;

    public decoratedPhoto(photoEdit photo) {
        this.photo = photo;
    }

    public void display() {
        photo.display();
    }
}

class BrightnessEnhancement extends decoratedPhoto {
    public BrightnessEnhancement(photoEdit photo) {
        super(photo);
    }

    public void display() {
        super.display();
        System.out.println("Brightness is enhanched");
    }
}

class ContrastEnhancement extends decoratedPhoto {
    public ContrastEnhancement(photoEdit photo) {
        super(photo);
    }

    public void display() {
        super.display();
        System.out.println("Contrast is enhanched");
    }
}

public class SnapEditPro {
    public static void main(String[] args) {
        photoEdit img= new basicPhoto();

        img= new BrightnessEnhancement(img);
        img= new ContrastEnhancement(img);

        img.display();

    }
}