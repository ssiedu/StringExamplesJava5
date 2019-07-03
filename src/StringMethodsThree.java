
public class StringMethodsThree {
    public static void main(String[] args) {

        String s="this is java";
        byte b[]=s.getBytes();
        for(byte tmp:b){
            System.out.println(tmp);
        }
        /*
        String s="ABCDEFGH";
        char ch[]=s.toCharArray();
        
        for(char c:ch){
            System.out.println(c);
        }
        */
        
        /*
        for(int i=3;i<7;i++){
            char ch=s.charAt(i);
            System.out.println(ch);
        }
        */
        
    }
}
/*
    String Methods
    -------------------

        char charAt(int)
        char[] toCharArray()
        byte[] getBytes()




*/
