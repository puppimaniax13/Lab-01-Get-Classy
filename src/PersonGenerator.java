import java.io.FileWriter;
import java.time.Year;
import java.util.*;
import java.io.File;
import java.io.IOException;


public class PersonGenerator {
    public static void main(String[] args) {

        try {
            File personData = new File("PersonTestData.txt");
            if (personData.createNewFile()) {
                System.out.println("File created:" + personData.getName());
            } else {
                System.out.println("File already exists:" + personData.getName());
            }
        } catch (IOException e) {
            System.out.println("File could not be created");
        }

        Scanner in = new Scanner(System.in);

        boolean done = false;

        String ID;
        String firstName;
        String lastName;
        String title;
        int yearBorn;




        List<Person> people = new ArrayList<>();

        while(!done) {
            ID = SafeInput.getNonZeroLenString(in, "Please input the Person's ID: ");
            firstName = SafeInput.getNonZeroLenString(in, "Please input the first name: ");
            lastName = SafeInput.getNonZeroLenString(in, "Please input the last name: ");
            title = SafeInput.getNonZeroLenString(in, "Please input the title: ");
            yearBorn = SafeInput.getInt(in, "Please input the year born: ");

            people.add(new Person(ID, firstName, lastName, title, yearBorn));

            done = SafeInput.getYNConfirm(in, "Are you done adding people?");
        }



        try {
            FileWriter personWriter = new FileWriter("PersonTestData.txt");
            for (Person x : people) {
                personWriter.write(x.toCSV() + "\n");
            }
            personWriter.close();
        } catch (IOException e) {
            System.out.println("File could not be written");
        }


        System.out.println(people.size());

    }
}

