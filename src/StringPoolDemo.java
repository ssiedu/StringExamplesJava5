
public class StringPoolDemo {
    public static void main(String[] args) {

        String s1=new String("indore");
        String s2=new String("indore");
        
        String s3="india";
        String s4="india";
        
        String s5=new String("india");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        
        System.out.println(s1==s2);
        System.out.println(s3==s4);
            System.out.println(s3==s5);
        
    }
}
