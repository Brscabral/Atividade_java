package teclado;
import java.io.*;

public class AtividadeIndividual {
public static void main(String[] args) throws IOException {
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	int num=0;
	int mult=1;
	int cont=1;
	System.out.println("Digite um numero para o calculo do fatorial");
	
	num=Integer.parseInt(bfr.readLine());
	cont=num;
	for(int i=0; i < num; i++) {
		
		mult*=cont;
		
		--cont;
		
	}
	System.out.println("O numero em fatorial eh: " + mult);
	
}
}
