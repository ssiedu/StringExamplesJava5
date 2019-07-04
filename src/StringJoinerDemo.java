
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        String s1="indore";
        String s2="delhi";
        String s3="mumbai";
        String s4="chennai";
        
        //StringJoiner sj=new StringJoiner("<--->");
        StringJoiner sj=new StringJoiner("#","[","]");
        sj.add(s1); sj.add(s2); sj.add(s3); sj.add(s4);
        System.out.println(sj);
        
        
        
    }
}
