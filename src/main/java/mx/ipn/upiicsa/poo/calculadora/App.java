package mx.ipn.upiicsa.poo.calculadora;

import mx.ipn.upiicsa.poo.calculadora.bs.Operacion;
import mx.ipn.upiicsa.poo.calculadora.bs.OperationMode;
import mx.ipn.upiicsa.poo.calculadora.bs.OperationStatus;
import mx.ipn.upiicsa.poo.calculadora.ui.UserInput;
import mx.ipn.upiicsa.poo.calculadora.ui.UserOutput;

public class App {

	public static void main(String[] args) {
		
		UserInput userInput = new UserInput();
		OperationMode operationMode = userInput.getModoOperacion(args[0]);
		
		if(operationMode.getMode() == OperationMode.ID_PARAMS_MODE){
			
			String[] argsOperacion = new String[args.length-1];
			for(int i = 1; i<args.length; i++) {
				argsOperacion[i-1] = args[i];
			}
			Operacion operacion = userInput.getOperacion(argsOperacion);
			operationMode.setOperation(operacion);
			if(operationMode.getOperation().getTipo() != OperationStatus.ERROR.getCode() && operationMode.getOperation().getStatus() != OperationStatus.VALUE_ERROR.getCode()) {
				double res = operacion.getResultado();
				UserOutput.printResult(res);	
			}else {
				UserOutput.showError();
			}
			
		} else if(operationMode.getMode() == OperationMode.ID_MENU_MODE){
			
			Operacion operacion;
			do {
				operacion = userInput.getUserOperation();
				operationMode.setOperation(operacion);
				if(operationMode.getOperation().getTipo() != OperationStatus.ERROR.getCode() && operationMode.getOperation().getStatus() != OperationStatus.VALUE_ERROR.getCode()) {
					double res = operacion.getResultado();
					UserOutput.printResult(res);
				}else {
					UserOutput.showError();
				}
				userInput.waitEnter();
			}while(operacion.getStatus() != 0);
		
		}else {
			UserOutput.showErrorMode();
		}
		
		System.exit(0);
	}

}
