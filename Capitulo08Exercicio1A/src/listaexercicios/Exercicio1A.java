package listaexercicios;

// <editor-fold defaultstate="collapsed" desc="imports...">
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 *
 * Description: ...
 *
 * @version 1.0.0
 * @author Aluno, 14 de set de 2019, 18:01:00
 */// </editor-fold>
public class Exercicio1A {

    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    //</editor-fold>
    //<editor-fold desc="executable method...">
    public static void main(String[] args) {

        //1°) Criar Arrays: A, B, C
        int tamanhoLinha = 2;
        int tamanhoColuna = 2;

        int[][] arrayA = new int[tamanhoLinha][tamanhoColuna];
        int[][] arrayB = new int[tamanhoLinha][tamanhoColuna];
        int[][] arrayC = new int[tamanhoLinha][tamanhoColuna];

        //2°) Ler valores para A e B
        lerArray(arrayA);
        lerArray(arrayB);

       

        //3°) Somar elementos respectivos de A e B e armazenar em C
                 for (int contLinha = 0; contLinha < arrayC.length; contLinha++) {
            for (int contColuna = 0; contColuna < arrayC[0].length; contColuna++) {
                arrayC[contLinha][contColuna] = 
                        arrayA[contLinha][contColuna] +
                        arrayB[contLinha][contColuna];
            }
        }
        
        //4°) Exibir array C
                         for (int contLinha = 0; contLinha < arrayC.length; contLinha++) {
            for (int contColuna = 0; contColuna < arrayC[0].length; contColuna++) {
                System.out.println("arrayC[" + contLinha + "][" + contColuna + "]: " + arrayC[contLinha][contColuna]);
            }
        }
    }//main
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static and auxiliary methods...">
    public static void lerArray(int[][] array){
         Scanner scanner = new Scanner(System.in);
         for (int contLinha = 0; contLinha < array.length; contLinha++) {
            for (int contColuna = 0; contColuna < array[0].length; contColuna++) {
                System.out.print("Digite o elemento [" + contLinha + "][" + contColuna + "]: ");
                array[contLinha][contColuna] = scanner.nextInt();
                System.out.println();
            }
        }
    }
    //</editor-fold>
}//class
