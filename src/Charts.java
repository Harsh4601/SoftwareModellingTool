import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Charts implements ActionListener {
    public static File imageFile1;
    JFrame jf;
    JLabel jl,jl1,jl2;
    JButton jbtn1,jbtn2,jbtn3,jbtn4,jbtn5;
    JLabel FlowImage1,FlowImage2,FlowImage3,GanttImage1,GanttImage2,GanttImage3,ErImage1,ErImage2,FishImage1;
    JButton FlowChart1,FlowChart2,FlowChart3,GanttChart1,GanttChart2,GanttChart3,ErChart1,ErChart2,FishChart1;

    Charts(){
        jf = new JFrame();

        jl = new JLabel("Select Any one To proceed...");
        jl.setFont(new Font("Verdana",Font.BOLD,5));
        jl.setBounds(600,50,400,50);
        jf.add(jl);

        jbtn1 = new JButton("Flow Chart");
        jbtn1.setFont(new Font("Verdana",Font.PLAIN,20));
        jbtn1.setBounds(200,150,150,50);
        jf.add(jbtn1);
        jbtn1.addActionListener(this);

        jbtn2 = new JButton("Gantt Chart");
        jbtn2.setFont(new Font("Verdana",Font.PLAIN,20));
        jbtn2.setBounds(480,150,200,50);
        jbtn2.addActionListener(this);
        jf.add(jbtn2);

        jbtn3 = new JButton("ER Diagram");
        jbtn3.setFont(new Font("Verdana",Font.PLAIN,20));
        jbtn3.setBounds(780,150,250,50);
        jbtn3.addActionListener(this);
        jf.add(jbtn3);

        jbtn4 = new JButton("Fish Bone");
        jbtn4.setFont(new Font("Verdana",Font.PLAIN,20));
        jbtn4.setBounds(1130,150,150,50);
        jbtn4.addActionListener(this);
        jf.add(jbtn4);

        jbtn5 = new JButton("Continue as Empty");
        jbtn5.setFont(new Font("Verdana",Font.PLAIN,15));
        jbtn5.setBounds(1200,700,200,40);
        jf.add(jbtn5);
        jbtn5.addActionListener(this);

        jl1 = new JLabel("");
        jl1.setFont(new Font("Verdana",Font.PLAIN,22));
        jl1.setBounds(600,250,400,50);
        jf.add(jl1);
        jl1.setVisible(false);

        ImageIcon c1=new ImageIcon(ClassLoader.getSystemResource("icons/FlowChart 1.jpg"));
        Image i1=c1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon c11=new ImageIcon(i1);
        FlowImage1=new JLabel(c11);
        FlowImage1.setBounds(300,330,200,200);
        FlowImage1.setVisible(false);
        jf.add(FlowImage1);

        FlowChart1 = new JButton("FlowChart 1");
        FlowChart1.setBounds(340,550,120,30);
        FlowChart1.setVisible(false);
        jf.add(FlowChart1);
        FlowChart1.addActionListener(this);

        ImageIcon c2=new ImageIcon(ClassLoader.getSystemResource("icons/FlowChart 2.jpg"));
        Image i2=c2.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon c22=new ImageIcon(i2);
        FlowImage2=new JLabel(c22);
        FlowImage2.setBounds(650,330,200,200);
        FlowImage2.setVisible(false);
        jf.add(FlowImage2);

        FlowChart2 = new JButton("FlowChart 2");
        FlowChart2.setBounds(690,550,120,30);
        FlowChart2.setVisible(false);
        jf.add(FlowChart2);
        FlowChart2.addActionListener(this);

        ImageIcon c3=new ImageIcon(ClassLoader.getSystemResource("icons/flowchart.png"));
        Image i3=c3.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon c33=new ImageIcon(i3);
        FlowImage3=new JLabel(c33);
        FlowImage3.setBounds(1000,330,200,200);
        FlowImage3.setVisible(false);
        jf.add(FlowImage3);

        FlowChart3 = new JButton("FlowChart 3");
        FlowChart3.setBounds(1040,550,120,30);
        FlowChart3.setVisible(false);
        jf.add(FlowChart3);
        FlowChart3.addActionListener(this);

        //Gantt Chart

        ImageIcon c4=new ImageIcon(ClassLoader.getSystemResource("icons/GanttChart 1.png"));
        Image i4=c4.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon c44=new ImageIcon(i4);
        GanttImage1=new JLabel(c44);
        GanttImage1.setBounds(300,330,200,200);
        GanttImage1.setVisible(false);
        jf.add(GanttImage1);

        GanttChart1 = new JButton("GanttChart 1");
        GanttChart1.setBounds(340,550,120,30);
        GanttChart1.setVisible(false);
        jf.add(GanttChart1);
        GanttChart1.addActionListener(this);

        ImageIcon c5=new ImageIcon(ClassLoader.getSystemResource("icons/GanttChart 2.jpg"));
        Image i5=c5.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon c55=new ImageIcon(i5);
        GanttImage2=new JLabel(c55);
        GanttImage2.setBounds(650,330,200,200);
        GanttImage2.setVisible(false);
        jf.add(GanttImage2);

        GanttChart2 = new JButton("GanttChart 2");
        GanttChart2.setBounds(690,550,120,30);
        GanttChart2.setVisible(false);
        jf.add(GanttChart2);
        GanttChart2.addActionListener(this);

        ImageIcon c6=new ImageIcon(ClassLoader.getSystemResource("icons/GanttChart 3.jpg"));
        Image i6=c6.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon c66=new ImageIcon(i6);
        GanttImage3=new JLabel(c66);
        GanttImage3.setBounds(1000,330,200,200);
        GanttImage3.setVisible(false);
        jf.add(GanttImage3);

        GanttChart3 = new JButton("GanttChart 3");
        GanttChart3.setBounds(1040,550,120,30);
        GanttChart3.setVisible(false);
        jf.add(GanttChart3);
        GanttChart3.addActionListener(this);

        ImageIcon c7=new ImageIcon(ClassLoader.getSystemResource("icons/ERDiagram 1.png"));
        Image i7=c7.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon c77=new ImageIcon(i7);
        ErImage1=new JLabel(c77);
        ErImage1.setBounds(300,330,200,200);
        ErImage1.setVisible(false);
        jf.add(ErImage1);

        ErChart1 = new JButton("ERDiagram 1");
        ErChart1.setBounds(340,550,120,30);
        ErChart1.setVisible(false);
        jf.add(ErChart1);
        ErChart1.addActionListener(this);

        ImageIcon c8=new ImageIcon(ClassLoader.getSystemResource("icons/ERDiagram 2.png"));
        Image i8=c8.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon c88=new ImageIcon(i8);
        ErImage2=new JLabel(c88);
        ErImage2.setBounds(650,330,200,200);
        ErImage2.setVisible(false);
        jf.add(ErImage2);

        ErChart2 = new JButton("ERDiagram 2");
        ErChart2.setBounds(690,550,120,30);
        ErChart2.setVisible(false);
        jf.add(ErChart2);
        ErChart2.addActionListener(this);

        ImageIcon c9=new ImageIcon(ClassLoader.getSystemResource("icons/FishBone 1.png"));
        Image i9=c9.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon c99=new ImageIcon(i9);
        FishImage1=new JLabel(c99);
        FishImage1.setBounds(300,330,200,200);
        FishImage1.setVisible(false);
        jf.add(FishImage1);

        FishChart1 = new JButton("FishChart 1");
        FishChart1.setBounds(340,550,120,30);
        FishChart1.setVisible(false);
        jf.add(FishChart1);
        FishChart1.addActionListener(this);

        jl2 = new JLabel("");
        jl2.setBounds(250,700,1000,40);
        jl.setFont(new Font("Verdana",Font.PLAIN,18));
        jl2.setVisible(false);
        jf.add(jl2);

        jf.setTitle("Charts Template");
        jf.setSize(1920, 1200);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Charts();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = e.getActionCommand();
        if(text.equals("Flow Chart")){
//            JOptionPane.showMessageDialog(jf,"Open Flow Chart");
            jl1.setText("Sample Templates for"+" "+text);
            jl1.setVisible(true);
            FlowImage1.setVisible(true);
            FlowChart1.setVisible(true);
            FlowImage2.setVisible(true);
            FlowChart2.setVisible(true);
            FlowChart3.setVisible(true);
            FlowImage3.setVisible(true);

            GanttImage1.setVisible(false);
            GanttImage2.setVisible(false);
            GanttImage3.setVisible(false);
            GanttChart3.setVisible(false);
            GanttChart2.setVisible(false);
            GanttChart1.setVisible(false);

            FishChart1.setVisible(false);
            FishImage1.setVisible(false);

            ErChart2.setVisible(false);
            ErImage2.setVisible(false);
            ErChart1.setVisible(false);
            ErImage1.setVisible(false);

        }
        if(text.equals("Gantt Chart")){
//            JOptionPane.showMessageDialog(jf,"Open Gantt Chart");
            jl1.setText("Sample Templates for"+" "+text);
            jl1.setVisible(true);
            FlowImage1.setVisible(false);
            FlowChart1.setVisible(false);
            FlowImage2.setVisible(false);
            FlowChart2.setVisible(false);
            FlowChart3.setVisible(false);
            FlowImage3.setVisible(false);

            GanttImage1.setVisible(true);
            GanttImage2.setVisible(true);
            GanttImage3.setVisible(true);
            GanttChart3.setVisible(true);
            GanttChart2.setVisible(true);
            GanttChart1.setVisible(true);

            FishChart1.setVisible(false);
            FishImage1.setVisible(false);

            ErChart2.setVisible(false);
            ErImage2.setVisible(false);
            ErChart1.setVisible(false);
            ErImage1.setVisible(false);

        }
        if(text.equals("ER Diagram")){
//            JOptionPane.showMessageDialog(jf,"Open ER Diagram");
            jl1.setText("Sample Templates for"+" "+text);
            jl1.setVisible(true);
            FlowImage1.setVisible(false);
            FlowChart1.setVisible(false);
            FlowImage2.setVisible(false);
            FlowChart2.setVisible(false);
            FlowChart3.setVisible(false);
            FlowImage3.setVisible(false);

            GanttImage1.setVisible(false);
            GanttImage2.setVisible(false);
            GanttImage3.setVisible(false);
            GanttChart3.setVisible(false);
            GanttChart2.setVisible(false);
            GanttChart1.setVisible(false);

            FishChart1.setVisible(false);
            FishImage1.setVisible(false);

            ErChart2.setVisible(true);
            ErImage2.setVisible(true);
            ErChart1.setVisible(true);
            ErImage1.setVisible(true);

        }
        if(text.equals("Fish Bone")){
//            JOptionPane.showMessageDialog(jf,"Open Fish Bone");
            jl1.setText("Sample Templates for"+" "+text);
            jl1.setVisible(true);
            FlowImage1.setVisible(false);
            FlowChart1.setVisible(false);
            FlowImage2.setVisible(false);
            FlowChart2.setVisible(false);
            FlowChart3.setVisible(false);
            FlowImage3.setVisible(false);

            GanttImage1.setVisible(false);
            GanttImage2.setVisible(false);
            GanttImage3.setVisible(false);
            GanttChart3.setVisible(false);
            GanttChart2.setVisible(false);
            GanttChart1.setVisible(false);

            FishChart1.setVisible(true);
            FishImage1.setVisible(true);

            ErChart2.setVisible(false);
            ErImage2.setVisible(false);
            ErChart1.setVisible(false);
            ErImage1.setVisible(false);


        }
        if(text.equals("Continue as Empty")){
            new Draw();
        }

        if(text.equals("FlowChart 1")){
            String text1 = "Follow the instructions to open the template : ( After 2 seconds when the window opens ) Click Open -> Select the template with the same name";
            jl2.setText(text1);
            jl2.setVisible(true);
            int delay = 2000;
            Timer timer = new Timer( delay, e0 -> {
                new Draw();
            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();
        }

        if(text.equals("FlowChart 2")){
            String text1 = "Follow the instructions to open the template : ( After 2 seconds when the window opens ) Click Open -> Select the template with the same name";
            jl2.setText(text1);
            jl2.setVisible(true);
            int delay = 2000;
            Timer timer = new Timer( delay, e0 -> {
                new Draw();
            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();
        }
        if(text.equals("FlowChart 3")){
            String text1 = "Follow the instructions to open the template : ( After 2 seconds when the window opens ) Click Open -> Select the template with the same name";
            jl2.setText(text1);
            jl2.setVisible(true);
            int delay = 2000;
            Timer timer = new Timer( delay, e0 -> {
                new Draw();
            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();
        }

        if(text.equals("GanttChart 1")){
            String text1 = "Follow the instructions to open the template : ( After 2 seconds when the window opens ) Click Open -> Select the template with the same name";
            jl2.setText(text1);
            jl2.setVisible(true);
            int delay = 2000;
            Timer timer = new Timer( delay, e0 -> {
                new Draw();
            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();
        }
        if(text.equals("GanttChart 2")){
            String text1 = "Follow the instructions to open the template : ( After 2 seconds when the window opens ) Click Open -> Select the template with the same name";
            jl2.setText(text1);
            jl2.setVisible(true);
            int delay = 2000;
            Timer timer = new Timer( delay, e0 -> {
                new Draw();
            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();
        }

        if(text.equals("GanttChart 3")){
            String text1 = "Follow the instructions to open the template : ( After 2 seconds when the window opens ) Click Open -> Select the template with the same name";
            jl2.setText(text1);
            jl2.setVisible(true);
            int delay = 2000;
            Timer timer = new Timer( delay, e0 -> {
                new Draw();
            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();
        }
        if(text.equals("ERDiagram 1")){
            String text1 = "Follow the instructions to open the template : ( After 2 seconds when the window opens ) Click Open -> Select the template with the same name";
            jl2.setText(text1);
            jl2.setVisible(true);
            int delay = 2000;
            Timer timer = new Timer( delay, e0 -> {
                new Draw();
            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();
        }

        if(text.equals("ErDiagram 2")){
            String text1 = "Follow the instructions to open the template : ( After 2 seconds when the window opens ) Click Open -> Select the template with the same name";
            jl2.setText(text1);
            jl2.setVisible(true);
            int delay = 2000;
            Timer timer = new Timer( delay, e0 -> {
                new Draw();
            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();
        }
        if(text.equals("FishChart 1")){
            String text1 = "Follow the instructions to open the template : ( After 2 seconds when the window opens ) Click Open -> Select the template with the same name";
            jl2.setText(text1);
            jl2.setVisible(true);
            int delay = 2000;
            Timer timer = new Timer( delay, e0 -> {
                new Draw();
            } );
            timer.setRepeats( false );//make sure the timer only runs once
            timer.start();
        }

    }
}
