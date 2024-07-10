package thema6.verschachtelung;

public class EinfacheProgrammierung {

	public static void main(String[] args) {

		double[][] temperatures = { { 20.5, 22.3, 19.8, 21.0, 23.1, 20.4, 18, 7 }, // Stadt 1
				{ 15.5, 17.2, 16.3, 14.8, 15.7, 16.0, 14.9 }, // Stadt 2
				{ 25.1, 24.3, 26.7, 27.2, 26.1, 25.9, 24.8 } // Stadt 3
		};

		double[] durchschnitt = new double[3];

		for (int stadt = 0; stadt < temperatures.length; stadt++) {
			double summe = 0;
			for (int tag = 0; tag < temperatures[stadt].length; tag++) {
				summe += temperatures[stadt][tag];
			}
			durchschnitt[stadt] =  Math.round((summe / temperatures[stadt].length)*10.0) / 10.0 ;
		}

		for (int stadt = 0; stadt < durchschnitt.length; stadt++) {
			System.out.println("Die durchschnittliche Temperatur für Stadt " + (stadt + 1) + " beträgt "
					+ durchschnitt[stadt] + " Grad.");
		}
	}

}
