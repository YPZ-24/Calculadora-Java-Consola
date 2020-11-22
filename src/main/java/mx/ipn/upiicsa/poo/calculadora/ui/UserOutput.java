package mx.ipn.upiicsa.poo.calculadora.ui;

import mx.ipn.upiicsa.poo.calculadora.bs.OperationEnum;

public class UserOutput {
		
	public static void showErrorMode() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Modo de operación incorrecto");
		System.out.println("Prueba utilizando...");
		System.out.println("\t java Calculadora -m");
		OperationEnum[] operations = OperationEnum.values();
		for(OperationEnum operation: operations) {
			System.out.println("\t java Calculadora -p "+operation.getDescription());
		}
		System.out.println("-----------------------------------------------------------------------------");
	}
	
	public static void showError() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Error: Verifica tus datos");
	}

	public static void showMenu() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("--------------------------- C A L C U L A D O R A ---------------------------");
		OperationEnum[] operations = OperationEnum.values();		
		for(OperationEnum operation: operations) {
			System.out.println(operation.getId()+". \t "+operation.getName()+"("+operation.getCommand()+")");
		}
		System.out.println("9. \t Salir ("+UserInput.EXIT+")");
		System.out.print("¿Que operación desea realizar? ");
	}
	
	public static void requestData(String nameData) {
		System.out.println("Ingrese "+nameData+":");
	}
	
	public static void printResult(double res) {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("El resultado es: "+res);
		System.out.println("-----------------------------------------------------------------------------");
	}
	
	public static void waitEnterMsj() {
		System.out.print("Presiona enter para continuar...");
	}
	
	public static void exitMsj() {
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Ustes salio del programa");
		System.out.println("-----------------------------------------------------------------------------");
	}

	
}
