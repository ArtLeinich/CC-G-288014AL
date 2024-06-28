package bodymassindex;

public class BodyMassIndex {
    public static void main(String[] args) {
        // Asking for the user's name
        String name = IO.promptAndReadString("Bitte Namen eingeben: ");
        IO.writeln("Hallo, " + name + "!");

        // Asking for height and weight
        double height = IO.promptAndReadDouble("Bitte Größe in Metern eingeben: ");
        double weight = IO.promptAndReadDouble("Bitte Gewicht in Kilogramm eingeben: ");

        // Calculating the BMI
        double bmi = weight / (height * height);

        // Rounding the BMI to 2 decimal places
        bmi = IO.round(bmi, 2);

        // Displaying the result
        IO.writeln("Ihr Body Mass Index (BMI) beträgt: " + bmi);
    }
}
