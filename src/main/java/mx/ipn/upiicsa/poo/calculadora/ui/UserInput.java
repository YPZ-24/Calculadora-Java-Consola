package mx.ipn.upiicsa.poo.calculadora.ui;

import java.util.Scanner;

import mx.ipn.upiicsa.poo.calculadora.bs.Operacion;
import mx.ipn.upiicsa.poo.calculadora.bs.OperationEnum;
import mx.ipn.upiicsa.poo.calculadora.bs.OperationMode;

public class UserInput {
	
	public static String EXIT = "-q";
	
	public OperationMode getModoOperacion(String mode) {		
		OperationMode operationMode = new OperationMode(mode);
		return operationMode;
	}
	
	public Operacion getOperacion(String[] params) {
		return new Operacion(params);
	}
	
	public Operacion getUserOperation() {
		Scanner sc = new Scanner(System.in);
		String[] params = null;
		
		UserOutput.showMenu();
		String operationString = sc.next();
		
		if(operationString.equals(EXIT)) {
			UserOutput.exitMsj();
			System.exit(0);
		}else {
			OperationEnum operationEnum = Operacion.operationsEnum.get(operationString);
			int countParams = operationEnum.getParams();
			params = new String[countParams+1];
			params[0] = operationString;
			
			UserOutput.requestData("primer numero");
			params[1] = sc.next();
					
			if(countParams == 2) {
				UserOutput.requestData("segundo numero");
				params[2] = sc.next();
			}
		}
		
		return getOperacion(params);
	}
	
	
	
	public void waitEnter() {
		Scanner sc = new Scanner(System.in);
		UserOutput.waitEnterMsj();
		sc.nextLine();
	}
	
}
