
public class StringConstructorsDemo {
    
    public static void disp(String s){
        System.out.println(s);
    }
    
    public static void main(String[] args) {

        String s1=new String("indore");
        disp(s1);
        //below is an characer array
        char ch[]={'a','b','c','d','e','f','g','h','i','j'};
        String s2=new String(ch);//consume entire array
        disp(s2);

        String s3=new String(ch,3,4);//part of the array
        disp(s3);
        
        byte b[]={65,66,67,68,69,70,71,72,73,74,75,76,77,78};
        String s4=new String(b);
        disp(s4);
        
        String s5=new String(b,2,5);
        disp(s5);
        
        
        
        
        
    }
}
/*
    Constructors of String class
    -------------------------------

    String()        //create String of length zero
    String(String)
    String(char[])
    String(char[],int,int)
    String(byte[])
    String(byte[],int,int)


*/
