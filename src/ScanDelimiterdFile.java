import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ScanDelimiterdFile {
    public static void main(String[] args) {

        try (var input = new Scanner(new File("cars.csv"))) {
            var cars = new ArrayList<String[]>();

            while (input.hasNextLine()) {
                var carAttributes = input.nextLine();
                String[] car = carAttributes.split(",");
                cars.add(car);
            }

            for (var car : cars) {
                System.out.println(STR."Car Name: \{car[0]}");
                System.out.println(STR."MPG: \{car[1]}");
                System.out.println(STR."Cylinders: \{car[2]}");
                System.out.println(STR."Displacement: \{car[3]}");
                System.out.println(STR."Horsepower: \{car[4]}");
                System.out.println(STR."Weight: \{car[5]}");
                System.out.println(STR."Acceleration: \{car[6]}");
                System.out.println(STR."Model: \{car[7]}");
                System.out.println(STR."Origin: \{car[8]}");
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
