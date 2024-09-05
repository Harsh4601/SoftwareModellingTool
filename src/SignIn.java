import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SignIn implements ActionListener {
    JFrame jf;
    public static JTextField jtf;
    JPasswordField jpf1;
    JLabel jlb1,jlb2,jlb3;
    JButton jb;
    JCheckBox jcb;

    SignIn(){
        jf = new JFrame();

        jlb1 = new JLabel("Sign In");
        jlb1.setBounds(230,10,50,50);
        jlb1.setSize(50,50);
        jf.add(jlb1);

        jlb2 = new JLabel("Email-Id");
        jlb2.setBounds(120,50,50,50);
        jf.add(jlb2);

        jlb3 = new JLabel("Password");
        jlb3.setBounds(120, 75,60,60);
        jf.add(jlb3);

        jtf = new JTextField();
        jtf.setBounds(250,65,150,20);
        jf.add(jtf);

        jpf1 = new JPasswordField();
        jpf1.setBounds(250,95,150,20);
        jf.add(jpf1);

        jcb = new JCheckBox("Forget Password");
        jcb.setBounds(270,140,150,20);
        jf.add(jcb);

        jb = new JButton("Submit");
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
        new SignIn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(jcb.isSelected()){
            new VerifyPhone();
        }


        if(jtf.getText().isBlank()==false && jpf1.getText().isBlank()==false){
            validateLogin();
        }else{
            JOptionPane.showMessageDialog(jf,"Please enter email and password");
        }



//        String jtfText = jtf.getText();
//        String jpfText = jpf1.getText();
//
//        if(jcb.isSelected()){
//            JOptionPane.showMessageDialog(jf,"Password is Password");
//        }else{
//            if(jtfText.equals("Admin") && jpfText.equals("Password"))
//                JOptionPane.showMessageDialog(jf,"Sign In Id: "+jtfText+" Password: "+jpfText);
//            else
//                JOptionPane.showMessageDialog(jf,"Invalid Id or Password");
//        }

    }

    public void validateLogin(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "Select * from user where email = '" + jtf.getText() + "' and password = '" + jpf1.getText() + "'";

        try{

            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);


            if(queryResult.next()){
                JOptionPane.showMessageDialog(jf,"Congratulations!");
                jf.setVisible(false);
                new QuickStart();
            }else{
                JOptionPane.showMessageDialog(jf,"Invalid login!");
            }

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
}
