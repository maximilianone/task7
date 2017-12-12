package task2;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    private Map<String,String> dictionary;
    public Translator(){
        dictionary = Dictionary.INSTANCE.getDictionary();
    }

    public void addWord(String word, String translate){
        dictionary.put(word,translate);
    }

    public String translate(String sentence) throws NonTranslatableException{
        String[] words = sentence.split(" |, ");
        int position = 0;
        for(String word: words){
            if(dictionary.get(word)!=null){
                position=sentence.indexOf(word);
                sentence = sentence.replace(sentence.substring(position,position+word.length()),dictionary.get(word));
            }else throw new NonTranslatableException();
        }
        return sentence;
    }
}
