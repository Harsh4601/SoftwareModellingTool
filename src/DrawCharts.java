import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawCharts implements ItemListener, MouseListener, MouseMotionListener {
    JFrame jf;
    JPanel jp1, jp2;
    JToggleButton jb1, jb2, jb3, jb4, jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12,jb13,jb14,jb15,jb16,jb17,jb18,jb19,jb20,jb21,jb22,jb23,jb24;
    JMenu jm1,jm2;
    JMenuBar mb;
    JMenuItem mi1,mi2,mi3;
    JTextField jtf1;

    int x,y;

    DrawCharts(){
        jf = new JFrame();

        mb = new JMenuBar();

        jm1 = new JMenu("File");

        mi1 = new JMenuItem("Save");
        jm1.add(mi1);
        mi3 = new JMenuItem("Import");
        jm1.add(mi3);
        mi2 = new JMenuItem("Export");
        jm1.add(mi2);

        jp1 = new JPanel();
        jp1.setBounds(10,150,300,600);

        // ------------  //
        ImageIcon letterA = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\letterA.png");
        jb1 = new JToggleButton(letterA);
        jb1.addItemListener(this);
        jb1.setBounds(25,35,35,35);

//        ImageIcon line = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\line.png");
//        jb2 = new JButton(line);
//        jb2.setBounds(90,35,35,35);
//
//        ImageIcon curveLine = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\curveLine.png");
//        jb3 = new JButton(curveLine);
//        jb3.setBounds(155,35,35,35);
//
//        ImageIcon square = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\square.png");
//        jb4 = new JButton(square);
//        jb4.setBounds(220,35,35,35);
//
//        // ------------  //
//        ImageIcon rectangle = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\rectangle.png");
//        jb5 = new JButton(rectangle);
//        jb5.setBounds(25,120,35,35);
//
//        ImageIcon roundedRectangle = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\roundedRectangle.png");
//        jb6 = new JButton("");
//        jb6.setBounds(90,120,35,35);
//
//        ImageIcon circle = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\circle.png");
//        jb7 = new JButton(circle);
//        jb7.setBounds(155,120,35,35);
//
//        ImageIcon oval = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\oval.png");
//        jb8 = new JButton(oval);
//        jb8.setBounds(220,120,35,35);
//
//        // ------------  //
//        ImageIcon triangle = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\triangle.png");
//        jb9 = new JButton(triangle);
//        jb9.setBounds(25,215,35,35);
//
//        ImageIcon rightTriangle = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\rightTriangle.png");
//        jb10 = new JButton(rightTriangle);
//        jb10.setBounds(90,215,35,35);
//
//        ImageIcon diamond = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\diamond.png");
//        jb11 = new JButton(diamond);
//        jb11.setBounds(155,215,35,35);
//
//        ImageIcon pentagon = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\pentagon.png");
//        jb12 = new JButton(pentagon);
//        jb12.setBounds(220,215,35,35);
//
//        // ------------  //
//        ImageIcon hexagon = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\hexagon.png");
//        jb13 = new JButton(hexagon);
//        jb13.setBounds(25,310,35,35);
//
//        ImageIcon arrowLeft = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\arrowLeft.png");
//        jb14 = new JButton(arrowLeft);
//        jb14.setBounds(90,310,35,35);
//
//        ImageIcon arrowRight = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\arrowRight.png");
//        jb15 = new JButton(arrowRight);
//        jb15.setBounds(155,310,35,35);
//
//        ImageIcon arrowUp = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\arrowUp.png");
//        jb16 = new JButton(arrowUp);
//        jb16.setBounds(220,310,35,35);
//
//        // ------------  //
//
//        ImageIcon arrowDown = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\arrowDown.png");
//        jb17 = new JButton(arrowDown);
//        jb17.setBounds(25,415,35,35);
//
//        ImageIcon fourPointStar = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\fourPointStar.png");
//        jb18 = new JButton(fourPointStar);
//        jb18.setBounds(90,415,35,35);
//
//        ImageIcon fivePointStar = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\fivePointStar.png");
//        jb19 = new JButton(fivePointStar);
//        jb19.setBounds(155,415,35,35);
//
//        ImageIcon sixPointStar = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\sixPointStar.png");
//        jb20 = new JButton(sixPointStar);
//        jb20.setBounds(220,415,35,35);
//
//        // ------------  //
//
//        ImageIcon roundedRectangularCallout = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\roundedRectangularCallout.png");
//        jb21 = new JButton(roundedRectangularCallout);
//        jb21.setBounds(25,510,35,35);
//
//        ImageIcon ovalCallout = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\ovalCallout.png");
//        jb22 = new JButton(ovalCallout);
//        jb22.setBounds(90,510,35,35);
//
//        ImageIcon cloudCallout = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\fourPointStar.png");
//        jb23 = new JButton("");
//        jb23.setBounds(155,510,35,35);
//
//        ImageIcon lightning = new ImageIcon("C:\\Users\\GUPTA\\IdeaProjects\\JavaGUIPaint1\\lightning.png");
//        jb24 = new JButton(lightning);
//        jb24.setBounds(220,510,35,35);

        jtf1 = new JTextField();
        jtf1.setBounds(350,100,400,30);
        jtf1.setVisible(false);
        jf.add(jtf1);

        jp1.setLayout(null);
        jp1.add(jb1);
//        jp1.add(jb2);
//        jp1.add(jb3);
//        jp1.add(jb4);
//        jp1.add(jb5);
//        jp1.add(jb6);
//        jp1.add(jb7);
//        jp1.add(jb8);
//        jp1.add(jb9);
//        jp1.add(jb10);
//        jp1.add(jb11);
//        jp1.add(jb12);
//        jp1.add(jb13);
//        jp1.add(jb14);
//        jp1.add(jb15);
//        jp1.add(jb16);
//        jp1.add(jb17);
//        jp1.add(jb18);
//        jp1.add(jb19);
//        jp1.add(jb20);
//        jp1.add(jb21);
//        jp1.add(jb22);
//        jp1.add(jb23);
//        jp1.add(jb24);
        jf.add(jp1);

        jp2 = new JPanel();
        jp2.setBounds(350,150,1150,600);
        jf.add(jp2);

        mb.add(jm1);

        jf.setJMenuBar(mb);

        jf.setTitle("Charts Template");
        jf.setSize(1800, 900);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.getContentPane().setBackground(Color.LIGHT_GRAY);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawCharts();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(jb1.isSelected()){
            jtf1.setVisible(true);
            String text = jtf1.getText();
            JLabel jl1 = new JLabel(text);
            jl1.setBounds(x,y,400,30);
        }
        if(!jb1.isSelected()){
            jtf1.setVisible(false);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
