package bolaBoliche;

import java.util.Scanner;

public class TestaEnvio {
    public static void main(String[] args) throws Exception {
    	try {
    		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o diâmetro da bola\n");
        /*A cada  medida a ser inserida, uma função de validação é chamada, lendo o input obtido pelo scanner*/
        int diametro;
		diametro = validaNumero(sc.nextInt());
	

		//A mesma validação ocorre nas medidas da caixa
        System.out.println("Digite a altura, largura e profundidade da caixa no formato: X Y Z \n");
        int altura = validaNumero(sc.nextInt());
        int largura = validaNumero(sc.nextInt());
        int profundidade = validaNumero(sc.nextInt());

        //Como os testes são automaticos, segui a risca as saídas, apenas com S ou N
        if (diametro <= altura && diametro <= largura && diametro <= profundidade) {
        	System.out.println("S"); 
        } else {
            System.out.println("N"); 
        }

        sc.close();
    	}
    	//Caso alguma validação lance a exception, o programa reinicia.
    	catch(Exception e) {
    		System.out.println(e+ "\n"+ mensagemErro());
    		
    		main(args);
    	}
      
        
    }
   
    public static int validaNumero(int numero) throws Exception {
    	if (numero >= 1 && numero <= 10000) {
			return numero;
		}else 
		{
			throw new Exception(mensagemErro());
		}
    	
    }
    public static String mensagemErro() {
    	return "Numero inválido, digite um número no formato inteiro, e de tamanho válido (1 <= X <= 10.000)";
    }
}
