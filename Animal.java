public abstract class Animal{
	private Sexo sexo;/*Al definir sexo como private, solo se tiene acceso dentro de la clase animal, sin embargo los métodos se han declarado como public y esto permite utilizarlo desde cualquier otro programa*/
	public Animal(){
		sexo = Sexo.MACHO;
	}
	public Animal(Sexo s){
		sexo = s;
	}
	public Sexo getSexo(){
		return sexo;
		
	}
	public String toString(){
		return "Sexo: "+this.sexo+"\n";
	}
	public void duerme(){
		System.out.println("ZzZz");
	}
}
