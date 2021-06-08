import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите длину массива: ");
        String sSize = reader.readLine();
        int size = Integer.parseInt(sSize);

        int arr[] = new int[size];
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < size; i++) {
            String sNum = reader.readLine();
            arr[i] = Integer.parseInt(sNum);
        }
            System.out.println("Элементы массива, кратные 3: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 3 == 0 ) {
                System.out.println(arr[i]);
            }
        }
    }
}
