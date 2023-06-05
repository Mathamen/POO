package package1;

import java.util.ArrayList;

public class TesteFuncoesEstranhas {
	 public static void main (String [] args) {
		ArrayList x= new ArrayList();
		x.add("casa");
		x.add("carro");
		x.add("Navio");
		x.add("Navio");
		System.out.println(x.size()); // RETORNA O TAMANHO DA LISTA
		System.out.println(x.get(0)); // VERIFICA QUEM EST� NA POSI��O 0 DA LISTA
		System.out.println(x.contains("carro")); // VERIFICA SE EST� NA LISTA, E RETORNA TRUE SE ESTIVER
		System.out.println(x.indexOf("carro")); // RETORNA A POSI��O NA LISTA
		System.out.println(x.remove("carro")); // VAI RETORNAR TRUE SE REMOVER E FALSE SE N�O CONSEGUIR
		System.out.println(x.remove("Navio")); // VAI REMOVER O PRIMEIRO S�!
		System.out.print(x.remove(0)); // REMOVE O ELEMENTO 0 DA LISTA
		
		
		
		
		
		String k []= new String[10];
		k[0]= "casa";
		k[1]= "carro";
		System.out.println(k.length);
		
		
		ArrayList j= new ArrayList();
		j.add(new String("333"));
		System.out.println(j.contains(new String("333")));
		
		ArrayList beta= new ArrayList();
		beta.add(new Cliente ("444"));
		Cliente c= new Cliente("444");
		Cliente y= new Cliente ("444");
		System.out.println(beta.contains(y)); //FALSE! S�O OBJETOS DIFERENTES
		System.out.println(beta.get(0).equals(y));
		System.out.println(beta.indexOf(y));
		System.out.println(beta.remove(y));
		System.out.println(beta.size());
		
		ArrayList alfa= new ArrayList();
		alfa.add("Navio");
		alfa.add("Navio");
		alfa.add("Mesa");
		
		ArrayList gama= new ArrayList();
		gama.add("Navio");
		alfa.removeAll(gama);
		alfa.retainAll(gama);
		
	}
}
