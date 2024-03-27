<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 7ba78d4 (Add project files)
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
<<<<<<< HEAD
=======
=======
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class myRunner {
    public static void main(String[] args) throws IOException {
        try (var bufferedReader = Files.newBufferedReader(Path.of("CourseData.csv"))) {
            var courses = new ArrayList<course>();

            while (bufferedReader.ready()) {
                var line = bufferedReader.readLine();
                var values = line.split(",");
                var course = new course();
                course.setCode(values[0]);
                course.setCourse_name(values[1]);
                course.setInstructor_name(values[2]);
                courses.add(course);
            }

            for (var course : courses) {
                System.out.println(STR."\{course.getCode()} | \{course.getCourse_name()} | \{course.getInstructor_name()}");
                System.out.println("===============================");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

>>>>>>> f20a93c (Add project files)
>>>>>>> 7ba78d4 (Add project files)
