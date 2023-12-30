public class DataException extends Exception{
        public DataException(){
    
        }
        public void dataCheck(String i){
            System.out.printf("Неккоректный формат!", i);
            System.out.println();
        }
    }
