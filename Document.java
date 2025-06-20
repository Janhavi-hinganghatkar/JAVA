// Parent interface 1
interface Printable {
    void print();
}

// Parent interface 2
interface Showable {
    void show();
}

// Base class
class Document {
    void documentInfo() {
        System.out.println("This is a document.");
    }
}

// Child class inheriting from class and interfaces (hybrid)
class Report extends Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing report...");
    }

    public void show() {
        System.out.println("Showing report...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Report r = new Report();
        r.documentInfo();  // from base class
        r.print();         // from Printable interface
        r.show();          // from Showable interface
    }
}
