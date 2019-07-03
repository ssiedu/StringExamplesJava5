public class StringExampleOne {
    public static void main(String args[]){
        
        String files[]={"abc.txt","xyz.bmp","pqr.xlsx","mno.txt","stu.xlsx"};                
        
        for(String file:files){
            if(file.endsWith(".txt")){
                System.out.println(file+" is an text file");
            }else if(file.endsWith(".bmp")){
                System.out.println(file+" is an image file");
            }else if(file.endsWith(".xlsx")){
                System.out.println(file+" is an excel file");
            }else{
                System.out.println(file+" is an unknown type file");
            }
        }
        
        
        
    }
}
