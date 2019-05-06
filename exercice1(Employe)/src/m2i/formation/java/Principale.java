package m2i.formation.java;

public class Principale {

	public static void main(String[] args) 
	{
		Employe E1 = new Employe("Dupon", "Jean", 40000f, (byte) 2); 	// Si on met pas le f et le (byte), il ne comprend pas car il met par
																		// defaut un double et un int
		System.out.println(E1);
		
	}

}
