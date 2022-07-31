/*Para crear en Java una subclase de otra clase existente se utiliza la palabra reservada extends*/

public class Gato extends Animal{
	private String raza;
	
	public Gato(Sexo s, String r){
		super(s);
		raza=r;
	}
	
	public Gato(Sexo s){
		super(s);
		raza = "siamés";
	}
	
	public Gato(String r){
		super(Sexo.HEMBRA);
		raza = r; 
	}
	
	public Gato(){
		super (Sexo.HEMBRA);
		raza = "siamés"; 
	}
	
	public String toString(){
		return super.toString()+"Raza: "+this.raza+"\n*******\n";
	}

	public void maulla(){
		System.out.println("Miauuu");
	}
	
	public void ronronea(){
		System.out.println("Grrrr");
	}
	
	public void come (String comida){
		if(comida.equals("pescado")){
			System.out.println("Hmmm gracias!");
		}else{
			System.out.println("Lo siento, yo solo como pescado");
		}
	}
		
	public void peleaCon(Gato contrincante){
		if(this.getSexo()==Sexo.HEMBRA){
			System.out.println("no me gusta pelear");
		}else{
			if(contrincante.getSexo()==Sexo.HEMBRA){
				System.out.println("no peleo con gatitas");
			}else{
				System.out.println("ven aquí que te vas a enterar");
			}
		}
	
	
	}
	
	
}
