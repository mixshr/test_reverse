import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите любое число!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int value = 0;
        String input;
        boolean isNotCorrect = true;
        do {
            input = reader.readLine();
            try {
                value = Integer.parseInt(input);
                isNotCorrect = false;
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное значение, повторите попытку");
            }
        } while (isNotCorrect);

        char[] chars = input.toCharArray();
        int length = chars.length - 1;
        StringBuilder result = new StringBuilder();
        for (int i = length; i >= 0; i--) {
            result.append(chars[i]);
        }
        int valueResult = Integer.parseInt(result.toString());

        System.out.println("Реверс числу: " + value + ", является: " + valueResult);

    }
}