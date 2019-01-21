import java.io.*;

public class GetMean {
    public static void main(String [] args) throws IOException {
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        while (true){
            try {
                System.out.println("How many numbers do you want to input? ");
                int array = Integer.parseInt(br.readLine());
                
                double size[]=new double[array];
                for (int i = 0; i < array; i++){
                    while(true){
                        try{
                            System.out.println("Enter" +i+ "Element of Array: ");
                            size[i]= Float.parseFloat(br.readLine());
                            break;
                        }
                        catch(Exception e){
                            System.out.println("Invalid number, Please enter a valid number");
                        }
                    }
                }
                System.out.println("Average is:" + mean(size );
                break;
            }
            catch(Exception e){
                    System.out.println("Ivalid size, Please enter a valid size");
            }
        }
    }
    public static double mean(double[] x){
        double average = 0;
        
        for (int i=0; i<x.length; i++){
            average+= x[i];
        }
        return average/x.length;
    }
}
