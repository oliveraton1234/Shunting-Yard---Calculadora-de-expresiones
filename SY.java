import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.Scanner;

public class SY{
  
  public static int orden(char signo) {
          char sign = signo;
          if (sign == '+' || sign == '-') {
              return 2;
          } else if (sign == '*' || sign == '/') {
              return 3;
          } else if (sign == '^') {
              return 4;
          } else if (sign == '(') {
              return 1;
          }
       return 0;
  }
      
  public static boolean Mayor(int x, int y) {
      return x > y;
  }      
      
  public static boolean verifica(char x) {
        char caracter = x;
        if (caracter == '(' || caracter == ')' || caracter == '*' || caracter == '+' || caracter == '-' || caracter == '/' || caracter == '^') {
            return true;
        } else {
            return false;
        }
    }
}
public static void main(String[] args) {
        try{           
            
            Scanner sc = new Scanner(System.in);                                   
            String ecuacion = new String();
             BufferedReader br = new BufferedReader(new FileReader("a.txt"));                                                                       
            while( (ecuacion = br.readLine()) != null){
                String final_res = ShuntingYard(ecuacion);
                System.out.println((final_res));
            }                        
            br.close();            
        }catch(Exception e){
            System.out.println("No se encontro el archivo");
        } 
    }
public static String transdormar(LQueue resultado){
        StringBuilder str = new StringBuilder();
        
        while(!resultado.isEmpty()){
            char letra = (char)resultado.pop();
            str.append(letra);
        }
        str.append("\n");
        String posfijo = str.toString();
        return posfijo;
    } 
