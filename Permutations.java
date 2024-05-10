public class Permutations {
    public static void main(String[] args) {
        sub("","abc");
        System.out.println("--------");
        sub1("", "abc");
    }
    public static void sub(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String l=p.substring(i,p.length());
            sub(f+ch+l,up.substring(1));
        }
        // sub(ch+p,up.substring(1));
        // sub(p, up.substring(1));
    }
    public static void sub1(String p,String up){
        if(up.isEmpty()){
          System.out.println(p);
          return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
          String f=p.substring(0,i);
          String l=p.substring(i,p.length());
          sub1(f+ch+l,up.substring(1));
        }
      }
}
