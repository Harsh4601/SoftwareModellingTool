import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class VerifyPhone implements ActionListener {
    JFrame jf;
    JTextField jtf1;
    JLabel jlb1,jlb2,jlb3,jlb4;
    JButton jb;

    VerifyPhone(){
        jf = new JFrame();

        jlb3 = new JLabel("Sign In");
        jlb3.setBounds(230,10,100,50);
        jlb3.setFont(new Font("Verdana",Font.PLAIN,18));
        jf.add(jlb3);

        jlb2 = new JLabel("Phone Number");
        jlb2.setBounds(120,50,100,50);
        jf.add(jlb2);

        jlb1 = new JLabel("OTP");
        jlb1.setBounds(120, 75,60,60);
        jf.add(jlb1);

        jlb4 = new JLabel();
        jlb4.setBounds(250, 75,100,60);
        jf.add(jlb4);

        jtf1 = new JTextField();
        jtf1.setBounds(250,65,150,20);
        jf.add(jtf1);

        jb = new JButton("Generate");
        jb.setBounds(210,190,100,30);
        jb.addActionListener(this);
        jf.add(jb);

        jf.setTitle("Login Page");
        jf.setSize(500,300);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new VerifyPhone();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Random r = new Random();
        String id = String.format("%04d", r.nextInt(10000));
        jlb4.setText(id);

        validatePhone();

    }

    public void validatePhone(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "Select * from user where phone = '" + jtf1.getText() + "'";

        try{

            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);


            if(queryResult.next()){
                JOptionPane.showMessageDialog(jf,"password is "+queryResult.getString(5));
            }else{
                JOptionPane.showMessageDialog(jf,"Invalid Number!");
            }

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
}
