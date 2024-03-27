import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ScanDelimiterdFile {
    public static void main(String[] args) {

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
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
