package ejercicio1;

public class Empleado {
	
 private final int id;
 private String nombre;
 private int edad;
 
 private static int contadorId = 999;
 
 public Empleado() {
	 contadorId++;
	 this.id = contadorId;
	 nombre = "sin nombre";
	 edad = 99;
 }
 
 	//GETTERS & SETTERS
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
