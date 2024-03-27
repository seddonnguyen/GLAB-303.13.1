import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;
=======
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> f20a93c (Add project files)
>>>>>>> 7ba78d4 (Add project files)

public class ScanDelimiterdFile {
    public static void main(String[] args) {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7ba78d4 (Add project files)
        try {
            String location = "cars.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            List<String[]> data = new ArrayList<>();

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] values = line.split(",");
                data.add(values);
            }
            input.close();

            for (String[] line : data) {
                System.out.println(STR."Car Name: \{line[0]}");
                System.out.println(STR."MPG: \{line[1]}");
                System.out.println(STR."Cylinders: \{line[2]}");
                System.out.println(STR."Displacement: \{line[3]}");
                System.out.println(STR."Horsepower: \{line[4]}");
                System.out.println(STR."Weight: \{line[5]}");
                System.out.println(STR."Acceleration: \{line[6]}");
                System.out.println(STR."Model: \{line[7]}");
                System.out.println(STR."Origin: \{line[8]}");
<<<<<<< HEAD
=======
=======
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
>>>>>>> f20a93c (Add project files)
>>>>>>> 7ba78d4 (Add project files)
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
