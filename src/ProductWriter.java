import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ProductWriter {
    public static void main(String[] args) {

        try {
            File productData = new File("ProductTestData.txt");
            if (productData.createNewFile()) {
                System.out.println("File created:" + productData.getName());
            } else {
                System.out.println("File already exists:" + productData.getName());
            }
        } catch (IOException e) {
            System.out.println("File could not be created");
        }

        Scanner in = new Scanner(System.in);

        boolean done = true;

        String ID;
        String name;
        String desc;
        double cost;

        List<Product> product = new ArrayList<>();

        while(done) {
            ID = SafeInput.getNonZeroLenString(in, "Please input the products ID: ");
            name = SafeInput.getNonZeroLenString(in, "Please input the products Name: ");
            desc = SafeInput.getNonZeroLenString(in, "Please input the product Description: ");
            cost = SafeInput.getDouble(in, "Please input the product Cost: $");

            product.add(new Product(ID, name, desc, cost));

            done = SafeInput.getYNConfirm(in, "Are there more products to add?");
        }

        try {
            FileWriter productWriter = new FileWriter("ProductTestData.txt");
            for (Product x : product) {
                productWriter.write(x.toCSV() + "\n");
            }
            productWriter.close();
        } catch (IOException e) {
            System.out.println("File could not be written");
        }
    }
}
