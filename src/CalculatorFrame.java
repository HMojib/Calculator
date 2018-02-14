/*
 * Name: Hamoun Mojib
 * Date: February 13, 2018
 * Class: COMP585
 * Purpose: This class is the main frame for this project. This frame contains the calculator
 */

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorFrame extends JFrame {

    // ---------  THREE DIFFERENT PORTIONS OF THE FRAME  ---------
    private JPanel mainPanel;
    private JPanel LCDPanel;
    private JPanel numButtonPanel;
    private JPanel opButtonPanel;

    // ---------  TEXT FIELD FOR DISPLAYING NUMBERS  ---------
    public static JTextField LCD;

    // ---------  OPERATION BUTTONS  ---------
    private JButton multiplication;
    private JButton add;
    private JButton subtract;
    private JButton divide;
    private JButton mod;
    private JButton equals;

    // ---------  NUMBER BUTTONS  ---------
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;
    private JButton dot;
    private JButton ce;

    // ---------  MENU  ---------
    private JMenuBar menuBar;
    private JMenu appMenu;
    private JMenu helpMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem aboutMenuItem;

    public CalculatorFrame(){
        buildFrame();
    }

    public static void centerFrame(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }

    public static void setResult(String value){
        LCD.setText(value);
    }
    private void buildFrame(){
        buildTextField();
        buildButtons();
        buildPanels();
        addMenu();
        addClickListeners();
        pack();
        setTitle("WORLD'S BEST CALCULATOR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        centerFrame(this);
        setVisible(true);
    }

    private void buildTextField(){
        LCD = new JTextField();
        LCD.setText("");
    }

    private void buildButtons(){
        zero = new JButton("0");
        zero.setActionCommand("0");
        one = new JButton("1");
        one.setActionCommand("1");
        two = new JButton("2");
        two.setActionCommand("2");
        three = new JButton("3");
        three.setActionCommand("3");
        four = new JButton("4");
        four.setActionCommand("4");
        five = new JButton("5");
        five.setActionCommand("5");
        six = new JButton("6");
        six.setActionCommand("6");
        seven = new JButton("7");
        seven.setActionCommand("7");
        eight = new JButton("8");
        eight.setActionCommand("8");
        nine = new JButton("9");
        nine.setActionCommand("9");
        dot = new JButton(".");
        dot.setActionCommand(".");
        ce = new JButton("CE");
        ce.setActionCommand("ce");

        multiplication = new JButton("X");
        multiplication.setActionCommand("multiplication");
        divide = new JButton("/");
        divide.setActionCommand("divide");
        add = new JButton("+");
        add.setActionCommand("add");
        subtract = new JButton("-");
        subtract.setActionCommand("subtract");
        mod = new JButton("%");
        mod.setActionCommand("mod");
        equals = new JButton("=");
        equals.setActionCommand("equals");
    }

    private void buildPanels(){
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        LCDPanel = new JPanel();
        LCDPanel.setLayout(new BorderLayout());

        opButtonPanel = new JPanel();
        opButtonPanel.setLayout(new GridLayout(2,3));

        numButtonPanel = new JPanel();
        numButtonPanel.setLayout(new GridLayout(4,3));

        opButtonPanel.add(multiplication);
        opButtonPanel.add(divide);
        opButtonPanel.add(add);
        opButtonPanel.add(subtract);
        opButtonPanel.add(mod);
        opButtonPanel.add(equals);

        numButtonPanel.add(seven);
        numButtonPanel.add(eight);
        numButtonPanel.add(nine);
        numButtonPanel.add(four);
        numButtonPanel.add(five);
        numButtonPanel.add(six);
        numButtonPanel.add(one);
        numButtonPanel.add(two);
        numButtonPanel.add(three);
        numButtonPanel.add(dot);
        numButtonPanel.add(zero);
        numButtonPanel.add(ce);

        LCDPanel.add(LCD);

        mainPanel.add(LCDPanel, BorderLayout.NORTH);
        mainPanel.add(opButtonPanel, BorderLayout.CENTER);
        mainPanel.add(numButtonPanel, BorderLayout.SOUTH);
        add(mainPanel);
    }

    private void addMenu(){
        menuBar = new JMenuBar();

        appMenu = new JMenu("App");
        helpMenu = new JMenu("Help");

        exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setActionCommand("exit");
        aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.setActionCommand("about");

        appMenu.add(exitMenuItem);
        helpMenu.add(aboutMenuItem);

        menuBar.add(appMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        ActionListener listener = new MenuListeners();
        exitMenuItem.addActionListener(listener);
        aboutMenuItem.addActionListener(listener);
    }

    private void addClickListeners(){
        ActionListener listener = new ClickListener();
        zero.addActionListener(listener);
        one.addActionListener(listener);
        two.addActionListener(listener);
        three.addActionListener(listener);
        four.addActionListener(listener);
        five.addActionListener(listener);
        six.addActionListener(listener);
        seven.addActionListener(listener);
        eight.addActionListener(listener);
        nine.addActionListener(listener);
        dot.addActionListener(listener);
        ce.addActionListener(listener);

        multiplication.addActionListener(listener);
        divide.addActionListener(listener);
        add.addActionListener(listener);
        subtract.addActionListener(listener);
        divide.addActionListener(listener);
        equals.addActionListener(listener);
    }

    private void addKeyListeners(){

    }
}
