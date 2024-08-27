package main;

public class Edificio {

	private int pisoFinal;
	private Ascensor ascensor;

	public Edificio(int pisoFinal) {
		this.pisoFinal = pisoFinal;
		this.ascensor = new Ascensor(pisoFinal);
	}

	public void gestionarDesplazamiento(int cantPersonas, int pisoDestino) {
		ascensor.desplazar(cantPersonas, pisoDestino);
	}

}
