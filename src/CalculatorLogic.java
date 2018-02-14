import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CalculatorLogic {

    private static Queue<String> queue = new LinkedList<>();

    public CalculatorLogic(){

    }

    public static double Calculator(String expression){
        ArrayList<String> x = getExpression(expression);

        double total = evalExpression(x);

        return total;

    }

    private static double evalExpression(ArrayList<String> x){
        double total = 0;
        if(x.size()>2) {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i).equals("x")) {
                    total = Double.parseDouble(x.get(i - 1)) * Double.parseDouble(x.get(i + 1));
                    x.set(i, total + "");
                   // x.remove(i - 1);
                   // x.remove(i + 1);
                }
            }
        }
        if(x.size()>2) {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i).equals("/")) {
                    total = Double.parseDouble(x.get(i - 1)) / Double.parseDouble(x.get(i + 1));
                    x.set(i, total + "");
                   // x.remove(i - 1);
                    //x.remove(i + 1);
                }
            }
        }
        if(x.size()>2) {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i).equals("%")) {
                    total = Double.parseDouble(x.get(i - 1)) % Double.parseDouble(x.get(i + 1));
                    x.set(i, total + "");
                   // x.remove(i - 1);
                    //x.remove(i + 1);
                }
            }
        }
        if(x.size()>2) {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i).equals("+")) {
                    total = Double.parseDouble(x.get(i - 1)) + Double.parseDouble(x.get(i + 1));
                    x.set(i, total + "");
                   //  x.remove(i - 1);
                   // x.remove(i + 1);
                }
            }
        }
        if(x.size()>2) {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i).equals("-")) {
                    total = Double.parseDouble(x.get(i - 1)) - Double.parseDouble(x.get(i + 1));
                    x.set(i, total + "");
                   // x.remove(i - 1);
                   // x.remove(i + 1);
                }
            }
        }
        return total;
    }

    private static ArrayList<String> getExpression(String expression){
        String temp = "";

        ArrayList<String> x = new ArrayList<>();
        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i) != 'x' && expression.charAt(i) != '/' && expression.charAt(i) != '-' && expression.charAt(i) != '+' && expression.charAt(i) != '%' ) {
                temp = temp + expression.charAt(i);
                if(i == expression.length() -1){
                    x.add(temp);
                }
            }else{
                x.add(temp);
                if(expression.charAt(i) == '/'){
                    x.add(expression.charAt(i) + "");
                    temp = "";
                    i++;
                }else{
                    x.add(expression.charAt(i) + "");
                    temp = "";
                }

            }

        }

        return x;
    }



}
