package atividade1;
import javax.swing.JOptionPane;


public class Operacao {
    
   public void soma(){
       double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
       double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
       double result = n1 + n2;
       new Exibir().exibir(result);
    }
   
    public void subtrai(){
       double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
       double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
       double result = n1 - n2;
       new Exibir().exibir(result);
    }
}
