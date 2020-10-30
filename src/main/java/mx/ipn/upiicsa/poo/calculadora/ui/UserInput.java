package mx.ipn.upiicsa.poo.calculadora.ui;

import java.util.Scanner;

import mx.ipn.upiicsa.poo.calculadora.bs.Operacion;
import mx.ipn.upiicsa.poo.calculadora.bs.OperationEnum;
import mx.ipn.upiicsa.poo.calculadora.bs.OperationMode;
import mx.ipn.upiicsa.poo.calculadora.bs.OperationStatus;

public class UserInput {
	
	public OperationMode getModoOperacion(String mode) {		
		OperationMode operationMode = new OperationMode(mode);
		return operationMode;
	}
	
	public Operacion getOperacion(String[] params) {		
		return new Operacion(params);
	}
	
	public Operacion getUserOperation() {
		Scanner sc = new Scanner(System.in);
		
		UserOutput.showMenu();
		String operationString = sc.next();
		
		OperationEnum operationEnum = Operacion.operationsEnum.get(operationString);
		int countParams = operationEnum.getParams();
		String[] params = new String[countParams+1];
		params[0] = operationString;
		
		UserOutput.requestData("primer numero");
		params[1] = sc.next();
				
		if(countParams == 2) {
			UserOutput.requestData("segundo numero");
			params[2] = sc.next();
		}
		
		return getOperacion(params);
	}
	
	public void waitEnter() {
		Scanner sc = new Scanner(System.in);
		UserOutput.waitEnterMsj();
		sc.nextLine();
	}
	
}
