package ejercicio1;

public class Principal {
	
	public static void main (String[] args) {
		
		Empleado[] vEmp = new Empleado [5];
		Empleado emp = new Empleado();
		//Asignacion de Empleados
		vEmp[0] = new Empleado("Jorge", 30);
		vEmp[1] = new Empleado();
		
		System.out.println("El proximo ID sera : " + Empleado.devolverProximoId() );

	}

}
