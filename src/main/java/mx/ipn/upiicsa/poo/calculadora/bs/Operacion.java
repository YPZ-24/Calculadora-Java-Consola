package mx.ipn.upiicsa.poo.calculadora.bs;

import java.util.HashMap;
import java.util.Map;

import mx.ipn.upiicsa.poo.calculadora.ui.UserOutput;

public class Operacion {
	
	private int tipo;
	private int status;
	private double a;
	private double b;
	
	public static Map<String,OperationEnum> operationsEnum = new HashMap<String,OperationEnum>();
	
	static {
		for(OperationEnum o : OperationEnum.values()){
			operationsEnum.put(o.getCommand(), o);
		}
	}
	
	public Operacion(String[] operationParams) {
		extractParameter(operationParams);
	}
	
	private void extractParameter(String[] operationParams) {
		String operation = operationParams[0];
		this.tipo = OperationStatus.ERROR.getCode();
		try {
			OperationEnum operationEnum = operationsEnum.get(operation);
			if(operationEnum != null) {
				this.tipo = operationEnum.getId();
				this.a = Double.parseDouble(operationParams[1]);
				if(operationEnum.getParams()==2) {
					this.b = Double.parseDouble(operationParams[2]);
				}
				this.status = OperationStatus.SUCCESS.getCode();
			}else if(operation.equals(UserOutput.EXIT)) {
				this.status = OperationStatus.EXIT.getCode();
			}else {
				this.status = OperationStatus.VALUE_ERROR.getCode();
			}
		}catch(Exception e) {
			this.status = OperationStatus.VALUE_ERROR.getCode();
		}
	}
	
	public Double getResultado() {
		double res = 0;
		
		if(this.tipo == OperationEnum.SUMA.getId()) {
			res = Calculadora.suma(this.a, this.b);
		}else if(this.tipo == OperationEnum.RESTA.getId()) {
			res = Calculadora.resta(this.a, this.b);
		}else if(this.tipo == OperationEnum.MULTIPLICACION.getId()) {
			res = Calculadora.multiplicacion(this.a, this.b);
		}else if(this.tipo == OperationEnum.DIVISION.getId()) {
			res = Calculadora.division(this.a, this.b);
		}else if(this.tipo == OperationEnum.PORCENTAJE.getId()) {
			res = Calculadora.porcentaje(this.a, this.b);
		}else if(this.tipo == OperationEnum.PISO.getId()) {
			res = Calculadora.piso(this.a);
		}else if(this.tipo == OperationEnum.TECHO.getId()) {
			res = Calculadora.techo(this.a);
		}else if(this.tipo == OperationEnum.REDONDEO.getId()) {
			res = Calculadora.redondeo(this.a);
		}
		
		return res;
	}
	
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
