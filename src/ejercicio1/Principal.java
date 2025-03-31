package ejercicio1;

public class Principal {
	
	public static void main(String[] args) {
		
		Empleado[] vEmp = new Empleado [5];

		//Asignacion de Empleados
		vEmp[0] = new Empleado("Jorge", 30);
		vEmp[1] = new Empleado();
		vEmp[2] = new Empleado("Alex", 27);
		vEmp[3] = new Empleado();
		vEmp[4] = new Empleado("Pablo", 59);
		
		for (Empleado e : vEmp) {
			System.out.println(e.toString());
		}
		System.out.println("El proximo ID sera : " + Empleado.devuelveProximoId());
	}

}
