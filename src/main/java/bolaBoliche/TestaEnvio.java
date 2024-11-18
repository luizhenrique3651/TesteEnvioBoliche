package bolaBoliche;

import java.util.Scanner;

public class TestaEnvio {
    public static void main(String[] args) throws Exception {
    	try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o diâmetro da bola\n");
        int diametro;
		diametro = validaNumero(sc.nextInt());
	

        System.out.println("Digite a altura, largura e profundidade da caixa no formato: X Y Z \n");
        int altura = validaNumero(sc.nextInt());
        int largura = validaNumero(sc.nextInt());
        int profundidade = validaNumero(sc.nextInt());

        if (diametro <= altura && diametro <= largura && diametro <= profundidade) {
        	System.out.println("S"); 
        } else {
            System.out.println("N"); 
        }

        sc.close();
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		
    		main(args);
    	}
      
        
    }
    
    public static int validaNumero(int numero) throws Exception {
    	if (numero >= 1 && numero <= 10000) {
			return numero;
		}else 
		{
			throw new Exception("Numero inválido");
		}
    	
    }
}
