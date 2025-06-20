class Addition {
    int num1, num2;

    // Parameterized constructor
    Addition(int a, int b) {
        num1 = a;
        num2 = b;
    }

    // Method to perform addition
    void add() {
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        // Creating object and passing values to the constructor
        Addition obj = new Addition(10, 20);
        obj.add();
    }
}
