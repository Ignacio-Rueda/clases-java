public class Coche{
	//atributo de clase
	private static int kilometrajeTotal = 0;
	/*Almacena el número total de kilómetros que recorren todos los objetos de la clase coche, es un único valor por eso se declara static*/
	//método de clase
	public static int getKilometrajeTotal(){
		return kilometrajeTotal;
	}
	
	private String marca;
	private String modelo;
	private int kilometraje;/*Almacena los kilometros recorridos por un objeto concreto y tendrá un valor distinto para cada uno de ellos*/
	
	public Coche(String ma, String mo){
		marca = ma;
		modelo = mo;
		kilometraje = 0;
	}
	
	public int getKilometraje(){
		return kilometraje;
	}
	
	public void recorre(int km){
		kilometraje += km;
		kilometrajeTotal += km;
	}

}
