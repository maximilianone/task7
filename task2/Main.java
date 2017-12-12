package task2;

public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();
        try {
            System.out.println(translator.translate("don't worry, be happy"));
            System.out.println(translator.translate("I'm the best"));
        }catch (NonTranslatableException e){
            System.out.println(e.getMessage());
        }
        translator.addWord("I'm","Я");
        translator.addWord("the","");
        translator.addWord("best","кращий");
        try {
            System.out.println(translator.translate("I'm the best"));
        }catch (NonTranslatableException e){
            System.out.println(e.getMessage());
        }
    }
}
