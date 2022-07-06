
public class NumPrimo {


    public static void main(String args[]) {
       int NumerosPrimos = 0;
       int TesteNumPrimo = 0;
       
       for(int i = 1 ; i < 10000 ; i++ ){
       		
       		TesteNumPrimo = 0;
       		/* Por quê o programa não estava funcionando quando usei j == i+1 no for
       		   abaixo? Queria que ele executasse até o j ser igual a i+1 , ou seja, i
       		   (pois ele nao conta o último).*/
       		for(int j = 1; j < i+1 ; j++){
       			
       			if( i % j == 0){
       			
       				TesteNumPrimo++;
      
       			}
       		
       		
       		}
       		
       		if ( TesteNumPrimo == 2){
       			
       			
       			NumerosPrimos++;
       			System.out.println(i + " é o "+ NumerosPrimos + "° número primo!");
       		
       		}
       		
       		if (NumerosPrimos == 15){
       			
       			break;
       			
       		}
       		
       					
       }
    }
}
