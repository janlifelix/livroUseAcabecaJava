/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capituloum;

import static java.lang.System.out;
import java.util.Arrays;
/**
 *
 * @author Janli Felix
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] bandaListaUm={"Deep Purple", "Black Sabbath", "Led Zeppelin", "Grand Funk", "Uriah Heep"};
        String [] bandaListaDois={"Rush", "Hawkwind", "Ramones", "Sex Pistols", "Ac/Dc"};
        String [] bandaListaTres={"Iron Maiden", "Nirvana", "Pearl Jam", "Alice In Chains", "AudioSlave"};
        out.println("De manhã "+Arrays.toString(bandaListaUm));
        out.println("De tarde "+Arrays.toString(bandaListaDois));
        out.println("De noite "+Arrays.toString(bandaListaTres));
        
        int listaUm = bandaListaUm.length;
        int listaDois = bandaListaDois.length;
        int listaTres = bandaListaTres.length;
        out.println("L1 = "+listaUm+"\nL2 = "+listaDois+"\nL3 = "+listaTres);
        
        int x =(int)(Math.random()*listaUm);
        int y =(int)(Math.random()*listaDois);
        int z =(int)(Math.random()*listaDois);
        out.println("N1 = "+x+"\nN2 = "+y+"\nN3 = "+z);
        
        String playlist ="\nManhã "+bandaListaUm[x]+"\nTarde "+bandaListaDois[y]+"\nNoite "+bandaListaTres[z];
        out.println("Minha playlist..."+playlist);
    }
    
}
