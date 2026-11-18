import java.util.ArrayList;
import java.util.List;

public class Between {
    public String[] sandwiched(String[] words, int low, int high) {
        List<String> goodWords = new ArrayList<>(); 
        for(int i = 0; i < words.length; i++){
            if(words[i].length() >= low && words[i].length() <= high){
                goodWords.add(words[i]);
            }
        }
        String[] finalWords = goodWords.toArray(new String[0]);
        return finalWords;
    }
}