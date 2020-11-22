package mx.ipn.upiicsa.poo.calculadora.bs;

public enum OperationStatus {
	SUCCESS(1, "Exito"), 
	ERROR(-1, "Error de Operacion"), 
	VALUE_ERROR(-2, "Error en Valores");
	
	private int code;
	private String name;
	
	
	private OperationStatus(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
}
