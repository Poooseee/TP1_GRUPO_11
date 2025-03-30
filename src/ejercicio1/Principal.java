package ejercicio1;

public class Principal {
	
	public static void main (String[] args) {
		
		Empleado[] vEmp = new Empleado [5];

		//Asignacion de Empleados
		System.out.println("El proximo ID sera : " + Empleado.devuelveProximoId() );
		vEmp[0] = new Empleado("Jorge", 30);
		System.out.println("El proximo ID sera : " + Empleado.devuelveProximoId() );
		vEmp[1] = new Empleado();
		
	}

}
