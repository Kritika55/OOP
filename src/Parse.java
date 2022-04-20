import javax.swing.*;

public class Parse {
    public static void main(String[] args) {
        int num1, num2, answer;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
        answer = num1+num2;
        JOptionPane.showMessageDialog( null,"The sum is"+answer);

    }
}
