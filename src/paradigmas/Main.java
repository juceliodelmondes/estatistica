package paradigmas;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Jucelio
 */
public class Main {
    public static void main(String[] args) {
        Float[] sequencia = formatarSequencia(JOptionPane.showInputDialog("Digite uma sequencia de números").split(" "));
        Information information = new Information();
        information.setMenorNumero(menorNumero(sequencia));
        information.setMaiorNumero(maiorNumero(sequencia));
        information.setMedia(media(sequencia));
        information.setMediana(mediana(sequencia));
        information.setSoma(soma(sequencia));        
        
        System.out.println(information.toString());
    }
    
    
    /**
     * Formata a sequencia de caracteres do Joptionpane
     * @param sequencia
     * @return 
     */
    private static Float[] formatarSequencia(String[] sequencia) {
        Float[] retorno = new Float[sequencia.length];
        for(int i = 0; i < sequencia.length; i++) {
            retorno[i] = Float.parseFloat(sequencia[i]);
        }
        return retorno;
    }
    
    /**
     * retorna o menor número
     * @param sequencia
     * @return 
     */
    private static Float menorNumero(Float[] sequencia) {
        Float menorNumero = Float.MAX_VALUE;
        for(Float numAtual : sequencia) {
            menorNumero = Float.min(numAtual, menorNumero);
        }
        return menorNumero;
    }
    
    /**
     * Retorna o maior numero
     * @param sequencia
     * @return 
     */
    private static Float maiorNumero(Float[] sequencia) {
        Float maiorNumero = Float.MIN_VALUE;
        for(Float numAtual : sequencia) {
            maiorNumero = Float.max(numAtual, maiorNumero);
        }
        return maiorNumero;
    }
    
    /**
     * Retorna a média da sequencia informada
     * @param sequencia
     * @return 
     */
    private static Float media(Float[] sequencia) {
        Float media = 0.0f;
        for(Float numAtual : sequencia) {
            media = Float.sum(media, numAtual);
        }
        return media/sequencia.length;
    }
    
    /**
     * Retorna a mediana da sequencia informada
     * @param sequencia
     * @return 
     */
    private static Float mediana(Float[] sequencia) {
        Arrays.sort(sequencia);
        if(sequencia.length % 2 == 0) {
            return (Float.sum(sequencia[sequencia.length/2], sequencia[(sequencia.length/2)-1]))/2;
        } else return sequencia[sequencia.length/2];
    }
    
    /**
     * Retorna a soma da sequencia informada
     * @param sequencia
     * @return 
     */
    private static Float soma(Float[] sequencia) {
        Float soma = 0.0f;
        for(Float numAtual : sequencia) {
            soma = Float.sum(soma, numAtual);
        }
        return soma;
    }
}
