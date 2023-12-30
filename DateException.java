public class DateException extends Exception{
    public DateException(){

    }
    public void dateCheck(String i){
        System.out.printf("Неккоректный формат даты!", i);
        System.out.println();
    }
}
