public class Area {
    
    public static  float area (int b, int h) {

     float a=(b*h)/2;

      return a;
    }

// main method
    
public static void main(String[] args)
 {
        int b = Integer.parseInt(args[0]);
  
          int h = Integer.parseInt(args[1]);
        
         float ar=area(b,h);

      System.out.print("Area of triangle" +ar);
  
     }
  
  
}

