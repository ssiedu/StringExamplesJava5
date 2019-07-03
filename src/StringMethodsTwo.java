public class StringMethodsTwo {
    public static void main(String args[]) {

        String s="this is java language and java is powerful";
        
        
        System.out.println(s.indexOf("language"));
        System.out.println(s.lastIndexOf("language"));
        
        
        System.out.println("Result of LastIndexOf");
        int n5=s.lastIndexOf('a');//searchs the last occurence
        System.out.println(n5);
        int n6=s.lastIndexOf("is");
        System.out.println(n6);
        //searching for first occurence of char a
        System.out.println("Result of Index-Of");
        int n1=s.indexOf('a');//searchs the first occurence
        System.out.println(n1);
        int n2=s.indexOf('a',15);//search starts from 15
        System.out.println(n2);
        int n3=s.indexOf("is");//searching for 1st occr of "is"
        System.out.println(n3);
        int n4=s.indexOf("is",20);//search starts from index 20
        System.out.println(n4);
        
        
        
    }
}
/*
    String Methods (Searching)
    -----------------------------

    int indexOf(char)       (-1 if searching fails)
    int indexOf(char,int)
    int indexOf(String)
    int indexOf(String,int)
    int lastIndexOf(char)
    int lastIndexOf(char,int)
    int lastIndexOf(String)
    int lastIndexOf(String,int)









*/
