/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad4;

/**
 *
 * @author 18253
 */
import java.util.Scanner;
public class Notepad4 {

    /**
     * @param args the command line arguments
     */
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String word = "phrase";
        for(int i = 0; i <= word.length(); i++){
            if(word.charAt(i) != 'e' && word.charAt(i) != 'a'){
        System.out.print(word.charAt(i));
        }
        }
    }
}
        
        /*
        
        
        
        
        String s = "compsci";
        String sub = "";
        sub = s.substring(3);
        System.out.println(sub);
        sub = s.substring (0,3);
        System.out.println(sub);
        sub = s.substring (4);
        System.out.println(sub);*/
        
        
        
        
        
        
 /*       
char cOne = '0';
char cTwo = '1';
String sOne = "hello there";
String sTwo = "hallo there";
        System.out.println(sOne.indexOf('h'));
        System.out.println(sOne.indexOf('7'));
        System.out.println(sTwo.indexOf('a'));
        System.out.println(sOne.compareTo(sTwo));
        System.out.println(sTwo.compareTo("abc"));
        System.out.println(sTwo.replaceAll("e", "#"));
        System.out.println(sTwo.replaceAll("#", "*"));
        System.out.println(sTwo.length());
        System.out.println( sOne.charAt(20) );
   */     



