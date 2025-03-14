package ejPowerPoint;

public class Empleado implements Comparable<Empleado> {

	
	private int edad;
	private int salario;
	private String nombre;
	private String departamento;
	/**
	 * @param edad
	 * @param salario
	 * @param nombre
	 * @param departamento
	 */
	public Empleado(int edad, int salario, String nombre, String departamento) {
		this.edad = edad;
		this.salario = salario;
		this.nombre = nombre;
		this.departamento = departamento;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}
	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Empleado [edad=" + edad + ", salario=" + salario + ", nombre=" + nombre + ", departamento="
				+ departamento + "]";
	}
	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		return Double.compare(this.salario, o.salario);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
