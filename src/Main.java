import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        meaningofgrade();
    }

    public static void meaningofgrade() {
        String grade = JOptionPane.showInputDialog(null, "Enter your grade (A-F)", "Input", JOptionPane.INFORMATION_MESSAGE);

        String meaning = "";

        if (grade.equals("A")) {
            meaning = "Excellent";
        } else if (grade.equals("B")) {
            meaning = "Good";
        } else if (grade.equals("C")) {
            meaning = "Average";
        } else if (grade.equals("D")) {
            meaning = "Deficient";
        } else if (grade.equals("F")) {
            meaning = "Failing";
        }

        JOptionPane.showMessageDialog(null, "Your grade means" + " " + meaning, "Output", JOptionPane.INFORMATION_MESSAGE);
    }
}