package mx.ipn.upiicsa.poo.calculadora.bs;

public enum OperationEnum{
	SUMA(1, "Suma", "-s", "-s 2 3", 2), 
	RESTA(2, "Resta", "-r", "-r 2 3", 2), 
	MULTIPLICACION(3, "Multiplicacion", "-m", "-m 2 3", 2), 
	DIVISION (4, "Division", "-d", "-d 2 3", 2), 
	PORCENTAJE (5, "Porcentaje", "-p", "-p 2 3", 2), 
	PISO (6, "Piso", "-pi", "-pi 2.5", 1), 
	TECHO (7, "Techo", "-t", "-t 2.5", 1),
	REDONDEO (8, "Redondeo", "-re", "-pi 2.5", 1);
	
	private int id;
	private String name;
	private String command;
	private String description;
	private int params;

	private OperationEnum(int id, String name, String command, String description, int params) {
		this.id = id;
		this.name = name;
		this.command = command;
		this.description = description;
		this.params = params;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCommand() {
		return command;
	}

	public String getDescription() {
		return description;
	}

	public int getParams() {
		return params;
	}
	/*
	public static OperationEnum getOperationByCommand(String command) {
		OperationEnum operationEnum = null;
		for(OperationEnum on: OperationEnum.values()) {
			if(on.getCommand().equals(command)) {
				operationEnum = on;
				break;
			}
		}
		return operationEnum;
	}
	*/
}