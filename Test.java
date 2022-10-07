import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
    	
    	BufferedWriter bw1 = new BufferedWriter(new FileWriter("D:\\Exerises.txt"));
    	
    	System.out.print("请输入出题数：");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	   	
    	//产生随机数
        Random r1 = new Random();
        Random r2 = new Random();

        //for循环产生n道100以内的加减法
        for(int i = 0; i < n;){
        	
        	int result = 0;
            //随机加号或者减号的产生
        	String[] operator = {"+", "-"};
            String op;
            int m = r2.nextInt(2);
            
            if(m == 0) {
            	op = operator[0];
            }else {
            	op = operator[1];
            }
            
            //随机减数/加数，被减数/被加数的产生
            int x = r1.nextInt(100);
            int y = r1.nextInt(100);
            if(m == 0) {
            	result = x + y;
            }else {
            	result = x + y;
            }
            
            bw1.write(x + op + y + "= " + result);
            bw1.newLine();
            bw1.flush();
            
           
            i ++;
        }
        bw1.flush();
        bw1.close();
        
        
    
    }   		   
}

