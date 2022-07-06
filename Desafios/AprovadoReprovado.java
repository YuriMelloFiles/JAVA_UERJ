
public class AprovadoReprovado {


    public static void main(String args[]) {
    	/* Encontrei na internet que depois de inserir números float deve-se usar o f ao 		   final */
        float provaUm = 8.7f;
        float provaDois = 4.6f;
        float media = (provaUm + provaDois)/2;
        String situacao;
        
        if(media >= 7 ){
        
        	situacao = " Aprovado !";
        
        } else if(media < 7 && media >= 4){
        
        	situacao = " Prova Final.";
        
        } else {
        
        	situacao = " Reprovado.";
        }
        
        
        
        System.out.println("Prova 1 :"+ provaUm + "\nProva 2 :"+ provaDois + "\nMédia :"+ media + "\nSituação :" + situacao);
    }
}
