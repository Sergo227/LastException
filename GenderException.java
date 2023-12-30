public class GenderException extends Exception{
    public GenderException(){

    }
    public void genderException(String i){
        System.out.printf("Неверно указан пол!", i);
        System.out.println();
    }
    }
