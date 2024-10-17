import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
   ArrayList<String> animals=new ArrayList<>();
   System.out.println(animals);   
   // add elements 
   animals.add("tiger");
   animals.add("lion");
   animals.add("dog");
   System.out.println(animals);
   animals.clear();
   System.out.println(animals);
   if(animals.isEmpty()){
    System.out.println("Array is empty");
    
   }
   else{
    System.out.println("Array is not empty");

   }
   animals.add("tiger");
   animals.add("lion");
   animals.add("dog");
   System.out.println(" the size of Array "+ animals.size() );
   // remove element
   animals.remove(2);
   System.out.println(animals);  
    }
}