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
 
 public Empleado(String nombre, int edad){
	 contadorId++;
	 this.id = contadorId;
	 this.edad = edad;
	 this.nombre = nombre;
 }
 
 	@Override
	public String toString() {
		return "Empleado ID: " + id + ", nombre = " + nombre + ", edad = " + edad + ".";
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
