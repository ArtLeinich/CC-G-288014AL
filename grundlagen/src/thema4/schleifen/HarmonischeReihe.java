package thema4.schleifen;

public class HarmonischeReihe {
    public static void main(String[] args) {
        int[] nValues = {10000, 1000000, 10000000, 100000000};

        // Berechnungen für float
        System.out.println("Float-Genauigkeit:");
        for (int n : nValues) {
            float resultAscending = calculateHarmonicSeriesFloat(n, true);
            float resultDescending = calculateHarmonicSeriesFloat(n, false);
            System.out.println("n = " + n + ": von unten nach oben = " + resultAscending + ", von oben nach unten = " + resultDescending);
        }

        // Berechnungen für double
        System.out.println("\nDouble-Genauigkeit:");
        for (int n : nValues) {
            double resultAscending = calculateHarmonicSeriesDouble(n, true);
            double resultDescending = calculateHarmonicSeriesDouble(n, false);
            System.out.println("n = " + n + ": von unten nach oben = " + resultAscending + ", von oben nach unten = " + resultDescending);
        }
    }

    public static float calculateHarmonicSeriesFloat(int n, boolean ascending) {
        float sum = 0.0f;
        if (ascending) {
            for (int i = 1; i <= n; i++) {
                sum += 1.0f / i;
            }
        } else {
            for (int i = n; i >= 1; i--) {
                sum += 1.0f / i;
            }
        }
        return sum;
    }

    public static double calculateHarmonicSeriesDouble(int n, boolean ascending) {
        double sum = 0.0;
        if (ascending) {
            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i;
            }
        } else {
            for (int i = n; i >= 1; i--) {
                sum += 1.0 / i;
            }
        }
        return sum;
    }
}
