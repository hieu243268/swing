/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidates;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Validate {

    public Scanner sc = new Scanner(System.in);
    //Check input nhập vào 
    public int getInt(String Mess, int MIN, int MAX){
        int num = 0;
        System.out.print(Mess);
        while(true){
            try{
                num = Integer.parseInt(sc.nextLine());
                if(num >= MIN && num <= MAX){
                    return num;
                }
                System.err.print("Out of range [" + MIN + ", " + MAX + "]! Re- Enter: ");
            }
            catch(Exception e){
                System.err.print("Invalid! Re-enter: ");
            }
        }
    }
    
    // check String nhập vào sử dụng regex
    public String getString(String Mess, String Regex){
        String result = "";
        System.out.print(Mess);
        while(true){
            result = sc.nextLine();
            if(result.trim().equals("")){
                System.err.print("Can not be empty! Re-Enter: ");
                continue;
            }
            if(result.matches(Regex)){// xem có khớp vs regex k  
                return result;
            }
            System.err.print("Invalid! Re-Enter: ");
        }
    }
    
    
}
