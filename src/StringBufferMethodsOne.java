
public class StringBufferMethodsOne {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("indore(m.p.)");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println("______________________");
        sb.setLength(20);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println("______________________");
        
    }
}

/*
    int length()
    int capacity()
    void setLength(int)
    StringBuffer append(String)







*/