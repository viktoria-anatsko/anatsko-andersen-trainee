import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число: ");
        String sNum = reader.readLine();

        int num = Integer.parseInt(sNum);

        if (num > 7) {
             System.out.println("Привет");
        }
    }
}
