package application;

import java.util.Scanner;

import entities.Media;
public class Program {

	public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     Media media=new Media();
     
     
     System.out.println("Digite o nome: ");
     media.nome=sc.nextLine();
     
     System.out.println("Digite a nota 1 : ");
      media.nota1=sc.nextDouble();
     
     System.out.println("Digite a nota 1 : ");
     media.nota2=sc.nextDouble();
     
     System.out.println("Digite a nota 1 : ");
     media.nota3=sc.nextDouble();
     
     System.out.println("Digite a nota 1 : ");
     media.nota4=sc.nextDouble();
     media.calcMedia();
     
     if (media.getMedia()==10) {
    	 System.out.println("estou igual a 10");
     }
     System.out.println("Media = "+media.toString());
	}

}
