

/**
 * Created by leon on 1/29/18.
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        
        
        return array [0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        
        return array [1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int len = array.length;
        
        return array[len-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
       int len = array.length;
        
        return array[len-2];  
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean bool=false;
        int len=array.length;
        for (int i=0;i<len;i++){
            
            if(array[i].equals(value)){
                
                bool=true;
                break;
               }
        }
        
        return bool;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int len = array.length;
        String[] reverse =new String[len];
        
        
       for(int i=0;i<len;i++){
           reverse [i]=array[len-(i+1)];
        }
        
        
        
        return reverse;
        
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean bool =false;
        int len = array.length;
        String [] palindrome = new String [len];
        
        palindrome = reverse(array);
       
           
           if (Arrays.equals(array,palindrome)){
           
               
               bool=true;
            }
        
        return bool;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Boolean bool=false;
        //Compare the joined string with the string {abcdefghijklmnopqrstuvwxyz};
        String pangram = String.join("",array);
        String str_smallcase = pangram.toLowerCase();
        String alphabets ="abcdefghijklmnopqrstuvwxyz";
        int len = alphabets.length();
        
        for (int i=0;i<len;i++)
        {
            if (!(str_smallcase.contains(String.valueOf(alphabets.charAt(i))))){
                
               bool=false;
               break;
            }
            else{
                
                bool =true;
            }
        }
     
            
           /*for (char character ='a';character<='z';character++) {
               
               if (! ((contains(array,Character.toString(character)))))
              
               //(contains (array,Character.toString(Character.toUpperCase(character)))))

                
                {
                   
                  bool=false; 
                }
                
                else if (! (contains (array,Character.toString(Character.toUpperCase(character)))))
                {
                bool=false;    
                }
          
                else {
            bool=true;
        }
        
    }*/
    
        
        return bool;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occur=0;
        int len=array.length;
        
        for (int i=0;i<len;i++){
            
        if (array[i].equals(value)){
        
        occur++;
    }
    }
        
        return occur;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int len=array.length;
        int count=0;
        
        for(int i=0;i<len;i++){
            
            if (array[i].equals(valueToRemove)){
               array[i]="";
               count++;
               break;
                
            }
        }
          
        String [] new_string =new String [(len-count)];
            
        for (int i=0,j=0;i<len;i++)   {
            
            if(!(array[i].equals(""))){
           
                
              new_string [j]=array[i];
              
              j++;
                
            }
            
            
        }
            
           
        
        return new_string;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
       
        ArrayList<String> str=new ArrayList<String>();
        int len=array.length;
        
        str.add(array[0]);
        
        for(int i=1;i<len;i++){
            
           if(!(array[i-1].equals(array[i]))) {
               
               
               str.add(array[i]);
               
             
               
            }
            
         
            
           
            
        }
       String[] new_array = str.toArray(new String[str.size()]);
 return new_array ;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        
        ArrayList<String> str=new ArrayList<String>();
        int len=array.length;
        String str1=array[0];
        
        //str.add(array[0]);
        
        
        
        for(int i=1; i<len;i++){
            
            
            if(array[i]==array[i-1]){
                
                str1=str1+array[i];
                
            }
            
            
         else{
                
             str.add(str1);
             str1= array[i];
             
             //str1=str1+array[i];
               
            //str.add(i+1,array[i]); 
            }
        }
        str.add(str1);
        
        String[] pack_array = str.toArray(new String[str.size()]);
        return pack_array;
    }


}
