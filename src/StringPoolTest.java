public class StringPoolTest {
    public static void main(String  args[]){
        //storing info about a person
        
        String name="Amit";
        String bplace="Indore";
        String eplace="Indore";
        String wplace="Indore";
        
        System.out.println("NAME : "+name);
        System.out.println("BIRTH PLACE : "+bplace);
        System.out.println("EDUCT PLACE : "+eplace);
        System.out.println("WORK  PLACE : "+wplace);
        System.out.println("____________________________");
        wplace="Bhopal";//one new object is created
                        //and assigned to existing ref wplace
                        //still the old object has "Indore"
        System.out.println("NAME : "+name);
        System.out.println("BIRTH PLACE : "+bplace);
        System.out.println("EDUCT PLACE : "+eplace);
        System.out.println("WORK  PLACE : "+wplace);
        System.out.println("____________________________");
        
        
        
        
    }
}
