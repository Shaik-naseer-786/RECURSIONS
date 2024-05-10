import java.util.ArrayList;
import java.util.List;

public class PhonenumberCombination2 {
    public static void main(String[] args) {
        List<String> res= letterCombinations("23");
        System.out.println(res.toString());
    }
    public static List<String> letterCombinations(String digits) {
        List<String> output=new ArrayList<>();
        if(digits.isEmpty()){
            return output;
        }
        String[] alpas={"abc","def","ghi","jkl","mno","pqrs","tvu","wxyz"};
        helper("",digits,alpas,output);
        return output;
    }
    private static void helper(String p, String up, String[] alpas, List<String> output) {
        if(up.isEmpty()){
            output.add(p);
            return;
        }
        else{
            String letters=alpas[up.charAt(0)-'2'];
            for(char ch:letters.toCharArray()){
                helper(p+ch, up.substring(1), alpas, output);
            }
        }
    }
    
}
