import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(
                null,
                "Your name",
                "Hello user!",
                JOptionPane.QUESTION_MESSAGE
        );

        String message = "Hello, " + name;

        JOptionPane.showMessageDialog(
                null,
                message,
                "Welcome",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}