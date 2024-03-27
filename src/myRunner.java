import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class myRunner {
    public static void main(String[] args) {
        try {
            File file = new File("CourseData.csv");
            Scanner input = new Scanner(file);
            List<course> data = new ArrayList<>();

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] values = line.split(",");
                course c = new course();
                c.setCode(values[0]);
                c.setCourse_name(values[1]);
                c.setInstructor_name(values[2]);
                data.add(c);
            }
            input.close();

            for (course c : data) {
                System.out.println(STR."\{c.getCode()} | \{c.getCourse_name()} | \{c.getInstructor_name()}");
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
