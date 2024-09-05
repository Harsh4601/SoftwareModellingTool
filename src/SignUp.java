import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SignUp implements ActionListener {
    JFrame jf;
    JLabel jl,jl1,jl2,jl3,jl4,jl5;
    JTextField jtf1,jtf2,jtf3;
    JPasswordField jpf;
    JComboBox jcb;
    JButton jb;

    SignUp(){
        jf = new JFrame();

        jl = new JLabel("Sign Up");
        jl.setBounds(320,10,50,50);
        jf.add(jl);

        jl1 = new JLabel("Name");
        jl1.setBounds(150,100,100,20);
        jf.add(jl1);

        jtf1 = new JTextField();
        jtf1.setBounds(350,100,200,20);
        jf.add(jtf1);

        jl2 = new JLabel("Email-Id");
        jl2.setBounds(150,150,100,20);
        jf.add(jl2);

        jtf2 = new JTextField();
        jtf2.setBounds(350,150,200,20);
        jf.add(jtf2);

        jl3 = new JLabel("Phone No.");
        jl3.setBounds(150,200,100,20);
        jf.add(jl3);

        jtf3 = new JTextField();
        jtf3.setBounds(350,200,200,20);
        jf.add(jtf3);

        jl4 = new JLabel("Profession");
        jl4.setBounds(150,250,100,20);
        jf.add(jl4);

        jcb = new JComboBox();
        jcb.addItem("Student");
        jcb.addItem("Teacher");
        jcb.addItem("Administrator");
        jcb.setBounds(350,250,200,20);
        jf.add(jcb);

        jl5 = new JLabel("Password");
        jl5.setBounds(150,300,100,20);
        jf.add(jl5);

        jpf = new JPasswordField();
        jpf.setBounds(350,300,200,20);
        jf.add(jpf);

        jb = new JButton("Submit");
        jb.setBounds(300,370,100,30);
        jb.addActionListener(this);
        jf.add(jb);

        jf.setTitle("Sign Up");
        jf.setSize(700,500);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new SignUp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(jtf1.getText().isBlank()==false && jtf2.getText().isBlank()==false && jtf3.getText().isBlank()==false && jpf.getText().isBlank()==false){
            DatabaseConnection connectNow = new DatabaseConnection();
            Connection connectDB = connectNow.getConnection();

            try{

                String name = jtf1.getText();
                String emailId = jtf2.getText();
                String phoneNo = jtf3.getText();
                String profession = jcb.getSelectedItem().toString();
                String password = jpf.getText();

                Statement statement = connectDB.createStatement();
                String query = "Insert into user values ('"+ name+ "','"+emailId+"','"+phoneNo+"','"+profession+"','"+password+"')";
                statement.executeUpdate(query);

                JOptionPane.showMessageDialog(jf,"Information Saved");
                jf.setVisible(false);
                new SignIn();

            }catch (Exception ex){
                ex.printStackTrace();
                ex.getCause();
            }
        }else {
            JOptionPane.showMessageDialog(jf, "Please enter the information");
        }

    }
}
