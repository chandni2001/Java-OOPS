import java.awt.*;
import java.awt.event.*;

public class Assignment3{
    public static void main(String[] args) {
        new LoginInterface();
    }
}
public class loginInterface extends Frame implements MouseListener, ActionListener {
    private Label titleLabel, usernameLabel, passwordLabel;
    private TextField usernameField, passwordField;
    private Button okButton, exitButton;

    public loginInterface() {
        // Create the UI components
        titleLabel = new Label(“Login Interface”);
        titleLabel.setFont(new Font(“Arial”, Font.BOLD, 18));
        usernameLabel = new Label(“Username:”);
        usernameField = new TextField();
        usernameField.addMouseListener(this);
        passwordLabel = new Label(“Password:”);
        passwordField = new TextField();
        passwordField.setEchoChar(‘*’);
        passwordField.addMouseListener(this);
        okButton = new Button(“OK”);
        okButton.addActionListener(this);
        exitButton = new Button(“Exit”);
        exitButton.addActionListener(this);

        // Add the components to the frame
        setLayout(new GridLayout(3, 2));
        add(titleLabel);
        add(new Label(“”));
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(okButton);
        add(exitButton);

        // Set the properties of the frame
        setTitle(“Login Interface”);
        setSize(300, 150);
        setVisible(true);
    }

    // Implement the MouseListener interface
    Public void mouseEntered(MouseEvent event) {
        If (event.getSource() == usernameField) {
            System.out.println(“Username in format username@abc.com”);
        } else if (event.getSource() == passwordField) {
            System.out.println(“Enter password”);
        }
    }
    Public void mouseExited(MouseEvent event) {}
    Public void mousePressed(MouseEvent event) {}
    Public void mouseReleased(MouseEvent event) {}
    Public void mouseClicked(MouseEvent event) {}

    // Implement the ActionListener interface
    Public void actionPerformed(ActionEvent event) {
        If (event.getSource() == okButton) {
            Dialog successDialog = new Dialog(this, “LogIn Successful”, true);
            successDialog.setSize(200, 100);
            successDialog.setVisible(true);
        } else if (event.getSource() == exitButton) {
            Dialog confirmDialog = new Dialog(this, “Confirm Exit”, true);
            confirmDialog.setSize(200, 100);
            Label confirmLabel = new Label(“Are you sure to exit?”);
            confirmDialog.add(confirmLabel);
            Panel buttonPanel = new Panel();
            Button yesButton = new Button(“Yes”);
            yesButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    System.exit(0);
                }
            });
            Button noButton = new Button(“No”);
            noButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    confirmDialog.dispose();
                }
            });
            buttonPanel.add(yesButton);
            buttonPanel.add(noButton);
            confirmDialog.add(buttonPanel, BorderLayout.SOUTH);
            confirmDialog.setVisible(true);
        }
    }

    
}
