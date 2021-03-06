package original;
/**
 * A class which can add 2 numbers together
 *
 * @author Richard
 * @version 060903
 */
public class AddModular {
    // Class variables, available to every method of the Class
    double number1, number2, total;
    
    public static void main(String[] args) {
        new AddModular();
    }
    /**
     * Constructor for objects of class Add
     */
    public AddModular() {
        obtain();
        calculate();
        display();
    }
    /**
     * Method to obtain two numbers
     */
    public void obtain() {
        number1 = inputDouble("Please input your first number: ");
        number2 = inputDouble("Please input your second number: ");
    }
    /**
     * Method to add two numbers
     */
    public void calculate() {
        total = number1 + number2;
    }
    /**
     * Method to display the total
     */
    public void display() {
        output("The total is: " + total);
    }
    
    /**
     * IBIO methods, (c) International Baccalaureate 2003
     * Computer Science Subject Guide, Appendix 2.
     */
    
    static void output(String info) {  System.out.println(info); }
    static void output(double info) {  System.out.println(info); }
    static void output(int info)    {  System.out.println(info); }
    
    static int inputInt(String Prompt) {
        int result=0;
        try{result=Integer.parseInt(input(Prompt).trim());} catch (Exception e){result = 0;}
        return result;
    }
    static double inputDouble(String Prompt) {
        double result=0;
        try{result=Double.valueOf(input(Prompt).trim()).doubleValue();} catch (Exception e){result = 0;}
        return result;
    }
    static String input(String prompt) {
        String inputLine = "";
        System.out.print(prompt);
        try {
            java.io.InputStreamReader sys = new java.io.InputStreamReader(System.in);
            java.io.BufferedReader inBuffer = new java.io.BufferedReader(sys);
            inputLine = inBuffer.readLine();
        } catch (Exception e) {
            String err = e.toString();
            System.out.println(err);
        }
        return inputLine;
    }
    static String input() { return input("");  }
}
