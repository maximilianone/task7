package task2;

public class NonTranslatableException extends Exception{
        @Override
        public String getMessage(){
            return "Can't translate";
        }
}
