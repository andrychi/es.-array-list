/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg30.pkg11.pkg17.luca.es.array.list;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class LucaEsArrayList {
static ArrayList<String> nomi;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nomi = new ArrayList<>();
        /// chiedere i nomi all'ingresso e aggiungerli in un array list 
        //fer finire di chiedere lasciare vuoto nella casella di input
        //alla fine creare con una apposito metodo una stringa da passare alla finestra di messaggio output
        //fase 1 dichiarare le variabili e creare le eventuali procedure da usare
        //arraylist ecc
        //fase 2 chiedere i dati in input
        //cicleare per caricare array list

        boolean finito = false;
        do {

            String nome = JOptionPane.showInputDialog("Inserisci il nome del candidato\nSe hai inserito tutti i candidati, non inserire niente e premere INVIO");

            if (nome.equals("")) {
                finito = true;

            } else {
                nomi.add(nome);
            }

        } while (!finito);
        // fase 3 eventuale elaborazione dati
        // richiamare la procedura che prepara il testo del report

        //fase 4 output per l'utente
        //presentare il testo del report
        String testo = report();
        JOptionPane.showMessageDialog(null, testo);
    }

    static String report() {
        String lista = "I partecipanti al corso sono:\n";
        for (int i = 0; i < nomi.size(); i++) {

            lista = lista + (i + 1) + ") " + nomi.get(i) + " \n";
        }

        return lista;
    }

}
