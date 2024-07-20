public class HelperMethods {

    // ------ Helper Methods ------
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int result1 = add(5, 3);
        int result2 = subtract(10, 4);

        System.out.println("Addition: " + result1);  // Output: Addition: 8
        System.out.println("Subtraction: " + result2);  // Output: Subtraction: 6
    }
}
