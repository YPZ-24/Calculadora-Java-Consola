package mx.ipn.upiicsa.poo.calculadora.bs;

public class OperationMode {

	public static final String MENU_MODE = "-m";
	public static final String PARAMS_MODE = "-p";
	
	public static final int ID_MENU_MODE = 1;
	public static final int ID_PARAMS_MODE = 2;
	public static final int ID_ERROR_MODE = -1;
	
	
	private int mode;
	private Operacion operation;
	
	public OperationMode(String mode) {
		if(OperationMode.MENU_MODE.equals(mode)){
			this.mode = ID_MENU_MODE;
		}else if(OperationMode.PARAMS_MODE.equals(mode)) {
			this.mode = ID_PARAMS_MODE;
		}else {
			this.mode = ID_ERROR_MODE;
		}
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public Operacion getOperation() {
		return operation;
	}

	public void setOperation(Operacion operation) {
		this.operation = operation;
	}
	
}
