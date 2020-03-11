public class ChainManipulator{
    public String trimAndConcat(String x, String y){
        String king = x;
        String queen = y;
        String final_str = king.trim().concat(queen.trim());
        return final_str;
    }

    public Integer getIndexOrNull(String word, char letter){
        String wrd = word;
        int index = wrd.indexOf(letter);
        if(index == -1){
            return null;
        }else{
            return index;
        }
    }

    public Integer getIndexOrNull(String word, String substrng){
        String wrd = word;
        String sub_string = substrng;
        int index = wrd.indexOf(sub_string);
        if(index == -1){
            return null;
        }else{
            return index;
        }
    }

    public String concatSubstring(String first, int initial, int last, String second){
        String fst = first;
        String snd = second;

        int i = initial;
        int l = last;

        String final_str = fst.substring(i,l).concat(snd);

        return final_str;
    }
}
