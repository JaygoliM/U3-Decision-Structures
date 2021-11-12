import javax.swing.*;

public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, multiply and display the result
    If not, add them and display the results.
     */
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("What's number 1?"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("What's number 2?"));

        Add(num1,num2);
        Multiply(num1,num2);
        double result =0;

        if (num1 > num2){
            result = Multiply(num1, num2);
        }
        if (num1 <= num2){
            result = Add(num1,num2);
        }
        JOptionPane.showMessageDialog(null,"The result is : " + result);
    }

    public static double Add(double num1, double num2){
        return num1 + num2;

    }

    public static double Multiply(double num1, double num2){
        return num1 * num2;

    }
}
