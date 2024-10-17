import java.util.ArrayList;
public class Main2 {
    public static void main(String[] args) {
     ArrayList<Integer>numbers=new ArrayList<>();
     numbers.add(2);  
     numbers.add(4);
     numbers.add(5);
     numbers.add(6);
     System.out.println(numbers); 
     numbers.forEach((x)->{System.out.println(x);});
     numbers.forEach((a)->{
        if(a==2){
            System.out.println("2 found");
        }
        else{
            System.out.println("2 not found");
        }
     });
    }
}
