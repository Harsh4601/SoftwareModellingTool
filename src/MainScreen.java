import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen  implements ActionListener {

    JFrame jf;
    JLabel jl1, jl2, jl3;
    JButton jb1, jb2;

    MainScreen() {
        jf = new JFrame();

        jl1 = new JLabel("WELCOME!");
        jl1.setBounds(220, 10, 100, 30);
        jf.add(jl1);

        jl2 = new JLabel("Existing User: ");
        jl2.setBounds(100, 60, 150, 40);
        jf.add(jl2);

        jb1 = new JButton("Sign In");
        jb1.setBounds(300, 60, 100, 30);
        jb1.addActionListener(this);
        jf.add(jb1);

        jl3 = new JLabel("Create new account: ");
        jl3.setBounds(100, 120, 150, 40);
        jf.add(jl3);

        jb2 = new JButton("Sign Up");
        jb2.setBounds(300, 120, 100, 30);
        jb2.addActionListener(this);
        jf.add(jb2);

        jf.setTitle("Welcome Page");
        jf.setSize(500, 300);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new MainScreen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();

        if (buttonText.equals("Sign Up")) {
            new SignUp();
            jf.setVisible(false);
        } else if (buttonText.equals(("Sign In"))) {
            new SignIn();
            jf.setVisible(false);
        }
    }
}
