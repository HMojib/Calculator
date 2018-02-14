import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListeners implements ActionListener{
    public void actionPerformed(ActionEvent actionEvent){
        if(actionEvent.getActionCommand().equals("exit")){
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(null,"Thanks for using my app.", "HELP", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
