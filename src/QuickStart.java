

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class QuickStart implements ActionListener {

    public static final String GOOGLE_SEARCH_URL = "https://www.google.com/search";

    JFrame jf;
    JRadioButton jr1, jr2, jr3, jr4;
    JLabel jl1, jl2, folderName, locationName;
    JButton jb1, jb2, jb3;
    ButtonGroup bg;
    int y1=70,y2=90;
    JSeparator jsp;

    QuickStart(){
        jf = new JFrame();

        jl1 = new JLabel("Quick Start");
        jl1.setBounds(500,40,200,50);
        jl1.setFont(new Font("Verdana",Font.PLAIN,25));
        jf.add(jl1);

        jl2 = new JLabel("Recent Work");
        jl2.setBounds(70,10,200,50);
        jl2.setFont(new Font("Verdana",Font.PLAIN,18));
        jf.add(jl2);

        bg = new ButtonGroup();

        jr1 = new JRadioButton("Create New Project");
        jr1.setBounds(380,100,250,50);
        bg.add(jr1);

        jr2 = new JRadioButton("Open Existing Project");
        jr2.setBounds(380,160,250,50);
        bg.add(jr2);

        jr3 = new JRadioButton("Import From Drive");
        jr3.setBounds(380,220,250,50);
        bg.add(jr3);

        jr4 = new JRadioButton("Help");
        jr4.setBounds(380,280,250,50);
        bg.add(jr4);

        jf.add(jr1);
        jf.add(jr2);
        jf.add(jr3);
        jf.add(jr4);

        jb1 = new JButton("Continue");
        jb1.setBounds(620,350,90,30);
        jb1.addActionListener(this);
        jf.add(jb1);

        JSeparator s = new JSeparator();
        s.setOrientation(SwingConstants.VERTICAL);
        s.setBounds(300,0,10,490);
        s.setBackground(Color.BLACK);
        jf.add(s);

        jf.setTitle("Quick Start");
        jf.setSize(800, 500);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);


        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();


        try{
            Statement stmt = connectDB.createStatement();
            String query = "Select * from recentworks where email = '"+SignIn.jtf.getText()+"'";
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                String name = rs.getString("folderName");
                String location = rs.getString("location");
                System.out.println(name);
                System.out.println(location);

                folderName = new JLabel("");
                folderName.setBounds(20,y1,100,20);
                jf.add(folderName);

                locationName = new JLabel("");
                locationName.setBounds(20,y2,200,20);
                jf.add(locationName);

                folderName.setText(name);
                locationName.setText(location);

                y1+=60;
                y2+=60;
            }



        }catch (Exception ex){
            ex.printStackTrace();
            ex.getCause();
        }
    }

    public static void main(String[] args) {
        new QuickStart();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(jr1.isSelected()){
            System.out.println("create new selected");
            new createNewProject();
        }else if(jr2.isSelected()){
//            JOptionPane.showMessageDialog(jf,"Existing File");
            new Draw();
        }else if(jr3.isSelected()){
//            JOptionPane.showMessageDialog(jf,"Import from Drive");
                try{
                    Runtime.getRuntime().exec("cmd /c start https://drive.google.com/drive/my-drive");
                    new Draw();

                }catch(Exception e1){

                e1.printStackTrace();
            }
        }
    }
}
