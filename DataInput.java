import java.util.Scanner;

public class DataInput {
    public String[] dataInput(){
        Scanner iScanner = new Scanner(System.in);
        while(true) {
            System.out.println("Введите фамилию, имя, отчество, дату рождения в формате:  dd.mm.yyyy, ваш номер телефона, а также ваш пол f - если женщина или m - если мужчина: , (без запятых и лишних пробелов)");
            String input = iScanner.nextLine();
            String [] data = input.split(" ");
            if (data.length == 6) {
                return data;
            }
            else if (data.length < 6){
                System.out.println("Error! Введено меньше данных о пользователе.");
            }
            else{
                System.out.println("Error! Введено слишком много данных о пользователе.");
        }
       }
}
}