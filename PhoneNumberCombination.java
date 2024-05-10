public class PhoneNumberCombination {
    public static void main(String[] args) {
        pad("", "123");
    }
    public static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            pad(ch+p, up.substring(1));
        }
    }
}
