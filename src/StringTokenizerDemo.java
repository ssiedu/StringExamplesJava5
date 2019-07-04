import java.util.StringTokenizer;
public class StringTokenizerDemo {
    public static void main(String[] args) {
        //String s="java cpp oracle php";
        
        String s="java,oracle;python,php,mysql";
        
        StringTokenizer st=new StringTokenizer(s,",;");
        
        System.out.println(st.countTokens());
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        
        System.out.println(st.countTokens());
    }
}
/*
    StringTokenizer
    ----------------------

    StringTokenizer(String)//space
    StringTokenizer(String,String)

    String nextToken()
    boolean hasMoreTokens()
    int countTokens()


*/