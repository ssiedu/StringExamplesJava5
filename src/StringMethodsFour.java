
public class StringMethodsFour {
    public static void main(String[] args) {
        //String s1="this is java code to test string";
        String s1="indore,bhopal,delhi,mumbai";
        String words[]=s1.split(",");
        for(String word:words){
            System.out.println(word);
        }
        
        
        /*
        boolean b=s1.contains("test");
        System.out.println(b);
        */
        /*
        //String s2=s1.substring(5);
        String s2=s1.substring(5, 16);
        System.out.println(s2);
        */
        /*
        String s1="ab";
        String s2="cd";
        String s3=s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        */
        /*
        String s1="  this  is  java  ";
        System.out.println(s1.length());
        String s2=s1.trim();
        System.out.println("AFTER TRIM");
        System.out.println(s1.length());
        System.out.println(s2.length());
        */
        
        /*
        String s1=new String("indore");
        String s2=s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);
        */
                
        
    }
}
/*
    int length()
    String toUpperCase()
    String toLowerCase()
    String trim()
    String concat(String)
    String sustring(int)//start,last
    String substring(int,int)//range
    booolean contains(String)
    String[] split(String)

*/
