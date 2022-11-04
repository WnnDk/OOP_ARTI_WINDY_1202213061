public class JFO6PRACTICE31 {
    
    static void createRectangle(int width, int height){
        for (int k=1;k<=height;k++){
            for (int l=1;l<=width;l++){
                if (k == 1 || k == height){
                    System.out.print("*");
                } else {
                    if (l == 1 || l == width){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                        }
                    }
            }
        System.out.println("");
        }
    }
        
        

    
    static void createTriangle(int leg){
            for (int i=1;i<=leg;i++){
                for (int j=1;j<=i;j++){
                    if (i == leg){
                        System.out.print("x");
                    }else {
                        if (j == 1 || j == i){
                           System.out.print("x"); 
                        }else{
                           System.out.print(" ");
                            }
                        }    
                    }
                System.out.println("");    
                } 
            
        
        
    }
}
