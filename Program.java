
import java.io.IOException;
import java.util.HashMap;
// Происходит запуск приложения
public class Program {
    public static void main(String[] args) {
        Hash hash = new Hash(); // Создается объект класса ParsData
        String newFileName = null; // Иннициализация переменной
        NewFile newFile = new NewFile(); // Создается объект класса WriteFile

        HashMap<String, Object> data = hash.parsInputData(); // Иннициализация словаря
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = hash.parsInputData();
            }
        } // Цикл для ввода данных, пока пользователь не введет корректные данные

        newFileName = data.get("lastName") + ".txt"; // Указывается файл для записи данных пользователя
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        newFile.writeData(String.valueOf(sb), filePath); // Вызывается метод класса WriteFile для записи в файл

    }
}
