
public class StringMethodsOne {
    public static void main(String[] args) {

        String s1="indore"; 
        String s2="Iddore";
        //System.out.println((int)'i');
        //System.out.println((int)'b');
        //int n=s1.compareTo(s2); //'o','i'
        int n=s1.compareToIgnoreCase(s2);
        System.out.println(n);
        
        /*
        String email="abc@yahoo.com";
        
        boolean b=email.endsWith(".com");
        System.out.println(b);
        */
        
        /*
        String s1=new String("india");
        String s2=new String("indore");
        
        boolean b1=s1.startsWith("indo");
        boolean b2=s2.startsWith("indo");
        
        System.out.println(b1);
        System.out.println(b2);
        */
        
        /*
        //boolean res=s1.equals(s2);
        boolean res=s1.equalsIgnoreCase(s2);
        System.out.println(res);
        if(res)
            System.out.println("They have same data");
        else
            System.out.println("They have diff data");
        */
    }
}
/*
    String class methods
    ----------------------------------
    Compare
    -----------
    boolean equals(String)
    boolean equalsIgnoreCase(String)
    boolean startsWith(String)
    boolean endsWith(String)
    int compareTo(String)

        















*/