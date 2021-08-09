package AppDesctopLesson7.homeWork;

import javax.swing.*;
import java.awt.*;

public class HomeWorkIcon extends JFrame {
    private int winWidth = 800;
    private int winHeight = 600;
    private int winPosX = 450;
    private int winPosY = 200;

    private JPanel header;
    private JPanel logotype;
    private JPanel menu;
    private JButton barMenu1;
    private JButton barMenu2;
    private JButton barMenu3;
    private JButton barMenu4;

    private JPanel Container1;
    private JPanel Content1;

    private JPanel Container2;
    private JPanel Content2;
    private JPanel Content3;

    HomeWorkIcon() {
        setVisible(true);
        setLayout(new GridLayout(3, 1));

        prepareWindow();
        prepareHeader();
        prepareContainer1();
        prepareContainer2();

        add(header, BorderLayout.NORTH);
        add(Container1);
        add(Container2);
    }
    private void prepareHeader(){
        header = new JPanel();
        header.setLayout(new GridLayout(1, 2));


        prepareLogotype();
        prepareMenu();

        header.add(logotype, BorderLayout.EAST);
        header.add(menu, BorderLayout.CENTER);
    }
    private void prepareLogotype(){
        logotype = new JPanel();
        logotype.setBackground(Color.RED);
    }
    private void prepareMenu(){
        menu = new JPanel();
        menu.setLayout(new GridLayout(1, 4));

        barMenu1 = new JButton("menu1");
        barMenu2 = new JButton("menu2");
        barMenu3 = new JButton("menu3");
        barMenu4 = new JButton("menu4");

        menu.add(barMenu1);
        menu.add(barMenu2);
        menu.add(barMenu3);
        menu.add(barMenu4);
    }

    private void prepareContainer1(){
        Container1 = new JPanel();
        Container1.setBackground(Color.MAGENTA);
        prepareContent1();
        Container1.add(Content1);
    }


   private void prepareContent1(){
        Content1 = new JPanel();
        Content1.setLayout(new GridLayout(4, 1));
        Content1.setBackground(Color.orange);

        Content1.add(new JLabel("Current Round: "));
        Content1.add(new JLabel("Current map size: "));
        Content1.add(new JLabel("Current enemy count: "));
        Content1.add(new JLabel("== Game Info =="));
   }


    private void prepareContainer2(){
        Container2 = new JPanel();
        Container2.setLayout(new GridLayout(2,1));
        prepareContent2();
        prepareContent3();
        Container2.add(Content2);
        Container2.add(Content3);
    }
    private void prepareContent2(){
        Content2 = new JPanel();
        Content2.setLayout(new GridLayout(4, 1));
        Content2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Content2.setBackground(Color.GRAY);

        Content2.add(new JLabel("Current Round: "));
        Content2.add(new JLabel("Current map size: "));
        Content2.add(new JLabel("Current enemy count: "));
        Content2.add(new JLabel("== Game Info =="));

    }
    private void prepareContent3(){
        Content3 = new JPanel();
        Content3.setLayout(new GridLayout(4, 1));
        Content3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Content3.setBackground(Color.GRAY);

        Content3.add(new JLabel("Current Round: "));
        Content3.add(new JLabel("Current map size: "));
        Content3.add(new JLabel("Current enemy count: "));
        Content3.add(new JLabel("== Game Info =="));
    }
    private void prepareWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(winPosX, winPosY);
        setSize(winWidth, winHeight);
        setTitle("HomeWorkIcon");
        setResizable(false);
    }
}
