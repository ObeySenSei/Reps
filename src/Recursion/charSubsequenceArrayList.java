package Recursion;

import java.util.ArrayList;

public class charSubsequenceArrayList {
    public static void main(String[] args) {

        ArrayList<String> allSubSequence = getSubSequence("" , "abc");
        System.out.println(allSubSequence);

    }
    static ArrayList<String> getSubSequence (String p, String un){

        if (un.isEmpty()){
            ArrayList<String> list = new ArrayList<>();   /// Create the new array list
            list.add (p);
            return list;
        }
        char ch = un.charAt(0);

        ArrayList<String> left = getSubSequence(p, un.substring(1));
        ArrayList<String> right = getSubSequence(p + ch, un.substring(1));

        left.addAll(right);
        return left;
    }
}
/**
 When up becomes empty (""), it means we have looked at every single letter and made our choices.
 At that point, whatever final combination we built inside p gets wrapped up into a tiny ArrayList, and we hand it back.

 char ch = up.charAt(0);
 We grab the very first letter of our remaining string (up). If up is "abc", then ch is 'a'.


 4. The Two Choices (The Core Magic)

 ArrayList<String> left = getSubsequence(p, up.substring(1));
 ArrayList<String> right = getSubsequence(p + ch, up.substring(1));
 This is where the function splits into two parallel universes for that letter ('a'):

 left (Leave it out): We call the function again, but we don't add ch to p.
 We also chop off the first letter from up (up.substring(1) becomes "bc").
 right (Take it): We call the function again, and we do add ch to p (p + ch). We also chop off the first letter from up.

 left.addAll(right);
 return left;
 Once all the recursive paths finish running down to the bottom and return their lists, left.addAll(right) merges
 the "leave-it-out" results and the "take-it-out" results into one big list, and passes it back up.

 */
