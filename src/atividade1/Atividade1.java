/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *Criado por Gian, se outra pessoa pegar foi pq ta no pc do if
 */
package atividade1;

import javax.swing.JOptionPane;

/**
 *
 * @author laboratorioe
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        String opcao = JOptionPane.showInputDialog("Insira um valor:\n 1 - soma"
                + "\n 2 - subtração");
        
                switch(opcao){
                    case "1":
                       new Operacao().soma();
                           break;
                    case "2":
                        new Operacao().subtrai();
                            break;
                    default: 
                        JOptionPane.showMessageDialog(null, "Opção incorreto");
                
                }
    }
}
