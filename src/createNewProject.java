import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.Statement;

public class createNewProject extends Component implements ActionListener {

    JFrame jf;
    JLabel jlName,jlLocation,jlHeading,jlChoice;
    JTextField jtfName,jtfLocation;
    JComboBox jcbChoice;
    JButton jbtn1,jbtn2;

    createNewProject(){
        jf = new JFrame();

        jlHeading = new JLabel("Configure your Project");
        jlHeading.setFont(new Font("verdana",Font.PLAIN,20));
        jlHeading.setBounds(40,40,300,50);
        jf.add(jlHeading);

        jlName = new JLabel("Name");
        jlName.setBounds(120,120,50,20);
        jf.add(jlName);

        jtfName = new JTextField("Untitled 1");
        jtfName.setBounds(240,120,250,20);
        jf.add(jtfName);

        jlLocation = new JLabel("Save Location");
        jlLocation.setBounds(120,170,100,20);
        jf.add(jlLocation);

        jtfLocation = new JTextField("C:/Users/Gupta/Desktop/Tool/");
        jtfLocation.setBounds(240,170,250,20);
        jf.add(jtfLocation);

        jbtn1 = new JButton("S");
        jbtn1.setBounds(500,170,20,20);
        jbtn1.addActionListener(this);
        jf.add(jbtn1);

        jlChoice = new JLabel("Choice");
        jlChoice.setBounds(120,220,100,20);
        jf.add(jlChoice);

        jcbChoice = new JComboBox();
        jcbChoice.addItem("Charts");
        jcbChoice.addItem("Draw");
        jcbChoice.setBounds(240,220,100,20);
        jf.add(jcbChoice);

        jbtn2 = new JButton("Continue");
        jbtn2.setBounds(450,300,100,30);
        jf.add(jbtn2);
        jbtn2.addActionListener(this);

        jf.setTitle("Create New File");
        jf.setSize(650, 400);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new createNewProject();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String text = e.getActionCommand();

        if(text.equals("S")){
            JFileChooser c = new JFileChooser();
            // Demonstrate "Save" dialog:
            int rVal = c.showSaveDialog(createNewProject.this);
            if (rVal == JFileChooser.APPROVE_OPTION) {
                jtfName.setText(c.getSelectedFile().getName());
                jtfLocation.setText(c.getCurrentDirectory().toString());
            }
            if (rVal == JFileChooser.CANCEL_OPTION) {
                jtfName.setText("You pressed cancel");
                jtfLocation.setText("");
            }
        }

        if(text.equals("Continue")){
            new Charts();
            jf.setVisible(false);

            String path = jtfLocation.getText();
            path = path + jtfName.getText();
            File f2 = new File(path);
            Boolean bool = f2.mkdir();
            if(bool){
                System.out.println("Folder created");
            }
            else{
                System.out.println("Folder Not Created");
            }

            DatabaseConnection connectNow = new DatabaseConnection();
            Connection connectDB = connectNow.getConnection();

            try{

                String email = SignIn.jtf.getText();
                String name  = jtfName.getText();
                String location = jtfLocation.getText();

                Statement statement = connectDB.createStatement();
                String query = "Insert into recentworks values ('"+ email+ "','"+name+"','"+location+"')";
                statement.executeUpdate(query);



            }catch (Exception ex){
                ex.printStackTrace();
                ex.getCause();
            }
        }
    }
}
