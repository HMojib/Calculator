import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {

    public void actionPerformed(ActionEvent actionEvent){
        String actionCommand = actionEvent.getActionCommand();
        String value;
        if(actionCommand.equals("0")) {
            value = CalculatorFrame.LCD.getText() + "0";
            CalculatorFrame.LCD.setText(value);
            System.out.println(value);
        }
        if(actionCommand.equals("1")) {
            value = CalculatorFrame.LCD.getText() + "1";
            CalculatorFrame.LCD.setText(value);
            System.out.println(value);
        }
        if(actionCommand.equals("2")) {
            value = CalculatorFrame.LCD.getText() + "2";
            CalculatorFrame.LCD.setText(value);
            System.out.println(value);
        }
        if(actionCommand.equals("3")) {
            value = CalculatorFrame.LCD.getText() + "3";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("4")) {
            value = CalculatorFrame.LCD.getText() + "4";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("5")) {
            value = CalculatorFrame.LCD.getText() + "5";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("6")) {
            value = CalculatorFrame.LCD.getText() + "6";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("7")) {
            value = CalculatorFrame.LCD.getText() + "7";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("8")) {
            value = CalculatorFrame.LCD.getText() + "8";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("9")) {
            value = CalculatorFrame.LCD.getText() + "9";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals(".")) {
            value = CalculatorFrame.LCD.getText() + ".";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("ce")) {
            value = "";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("multiplication")) {
            value = CalculatorFrame.LCD.getText() + "x";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("divide")) {
            value = CalculatorFrame.LCD.getText() + "/";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("add")) {
            value = CalculatorFrame.LCD.getText() + "+";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("subtract")) {
            value = CalculatorFrame.LCD.getText() + "-";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("mod")) {
            value = CalculatorFrame.LCD.getText() + "%";
            CalculatorFrame.LCD.setText(value);
        }
        if(actionCommand.equals("equals")) {
            value = CalculatorFrame.LCD.getText() + "";
            CalculatorFrame.LCD.setText(value);
        }


    }
}
