package entities;

public class Media {
	public  String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
    private double media;
	
    

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public double calcMedia() {
		return (nota1+nota2+nota3+nota4)/4;
		
		
	}
	
	public String toString() {
		return
				"Media = "+
				String.format("%.2f",media );
	}
	
	
}
