import java.util.Scanner;
public class ConsecutiveDuplicates {

    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {
        
        // Write your code here
        int len = str.length();
        if(str.isEmpty() || len==1 )
        return false;
        for(int i=0;i<len-1;i++){
            if(str.charAt(i) == str.charAt(i+1) )
            return true;
        }
        
        return false;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ConsecutiveDuplicates obj = new ConsecutiveDuplicates();
        String result= ((obj.hasConsecutiveDuplicates(str))?"":"don\'t");
        System.out.printf("\"%s\" %s have consecutive duplicates in it",str,result).println();
        sc.close();
    }
}