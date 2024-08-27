package main;

public class Ascensor {

	private static final int LIMITE_PESO = 750;
	private static final int PESO_POR_PERSONA = 50;
	private final int pisoFinal;
	private int pisoInicial = 1;

	public Ascensor(int pisoFinal) {
		this.pisoFinal = pisoFinal;
	}

	public void desplazar(int cantidadPersonas, int pisoDestino) {

		int pesoTotal = calcularPesoDesplazar(cantidadPersonas);

		if (pesoTotal > LIMITE_PESO) {
			System.out.println("Limite de peso excedido");
			return;
		}
		if (pisoDestino > pisoFinal || pisoDestino < 1) {
			System.out.println("Pisos permitidos entre 1 y " + pisoFinal);
			return;
		}
		moverAscensor(pisoDestino);
	}

	private int calcularPesoDesplazar(int cantidadPersonas) {
		return cantidadPersonas * PESO_POR_PERSONA;
	}

	private void moverAscensor(int pisoDestino) {
		if (pisoDestino > pisoInicial) {
			System.out.println("ascensor subiendo al piso: " + pisoDestino);
		} else if (pisoDestino < pisoInicial) {
			System.out.println("ascensor bajando al piso: " + pisoDestino);
		} else {
			System.out.println("El ascensor ya esta en el piso: " + pisoInicial);
			return;
		}

		pisoInicial = pisoDestino;
		System.out.println("Ascensor en piso " + pisoInicial);
	}

}
