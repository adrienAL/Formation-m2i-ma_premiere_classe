package m2i.formation.java;

public class Employe 
{
	// attributs
	private String Nom;
	private String Prenom;
	private float Salaire;
	private byte Nb_Enf;
	
	//Constructeur
	public Employe(String nom, String prenom, float salaire, byte nb_Enf) 
	{
		Nom = nom;
		Prenom = prenom;
		Salaire = salaire;
		Nb_Enf = nb_Enf;
	}
	
	
	
	//méthodes (Dans une fonction toutes les branche doivent retourner une valeur
	public double Prime_Salaire()
	{
		double primeS = 0;
		
		if (this.Salaire<=3000)
		{
			primeS =  this.Salaire*0.4;
		} 
		else 
			if (this.Salaire>4000)
			{
				primeS =  this.Salaire*0.1;
			} 
			else
				primeS =  this.Salaire*0.2;
		
		return primeS;
	}

	public double Prime_Enfants()
	{
		double primeE = 0;
		if (this.Salaire<=3000)
		{
			if (this.Nb_Enf > 2)
				primeE =  this.Nb_Enf*1000;
			else
				primeE =  this.Nb_Enf*500;
		} 
		else 
			if (this.Salaire>4000)
			{
				primeE =  this.Nb_Enf*100;
		
			} 
			else 
				{
					if (this.Nb_Enf > 3)
						primeE =  this.Nb_Enf*500;
					else
						primeE = this.Nb_Enf*300;
				}

		return primeE;
	}
	
	
	public double Prime_Totale()
	{
		return this.Prime_Enfants() + this.Prime_Salaire(); // le this précise que c'est une fonctionnalité de l'objet courrant
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employe [Nom=");
		builder.append(Nom);
		builder.append(", Prenom=");
		builder.append(Prenom);
		builder.append(", Salaire=");
		builder.append(Salaire);
		builder.append(", Nb_Enf=");
		builder.append(Nb_Enf);
		builder.append(", Prime_Salaire()=");
		builder.append(Prime_Salaire());
		builder.append(", Prime_Enfants()=");
		builder.append(Prime_Enfants());
		builder.append(", Prime_Totale()=");
		builder.append(Prime_Totale());
		builder.append("]");
		return builder.toString();
	}
	
	
}
