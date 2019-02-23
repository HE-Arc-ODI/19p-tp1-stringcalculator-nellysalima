/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nellysal.jaquet
 */
public class StringCalculator {
    
    //constructeur prenant un chiffre en paramètre
    public StringCalculator(int Res) {}
    int Res;
    String ResSum;
    
    public int add(String numbers){
        if (numbers == null || numbers == ""){
            Res = 0;
            return Res;
          
        } if (numbers != null){
                String ResSum = numbers;
                return Integer.parseInt(ResSum);                      
        }else {
            return 0;
        }

    } 
   

   
    
  
}
