public class SimpleNullPointerDemo {
    
    // Method that will cause the exception
    public static void causeException() {
        System.out.println("Trying to cause an error...");
        String text = null;  // text is empty (null)
        int length = text.length();  // This will cause the error!
    }
    
    // Method that handles the exception
    public static void handleException() {
        System.out.println("Trying to handle the error...");
        String text = null;  // text is empty (null)
        
        try {
            int length = text.length();  // This might cause error
            System.out.println("Text length: " + length);
        } catch (Exception e) {
            System.out.println("Oops! We got an error: " + e.getMessage());
            System.out.println("The text was empty, so we can't find its length.");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Program Start ===");
        
        // First, let's cause the exception
        causeException();
        
        System.out.println("=== Now let's try handling it ===");
        
        // Now let's handle the exception
        handleException();
        
        System.out.println("=== Program End ===");
    }
}