package javaCoding3;

import java.util.Arrays;

public class Anagaram {
	
	    public static void isAnagram(String word, String anagram)
	    { 
	    	boolean isAnagram = true;
	        String wordWithoutSpace= word.replaceAll("\\s", "");
	        String AnagramWithoutSpace= anagram.replaceAll("\\s", "");
	        if(wordWithoutSpace.length() != AnagramWithoutSpace.length())
	        {
	            isAnagram = false;
	        }
	        else
	        {
	            char[] wordArray = wordWithoutSpace.toLowerCase().toCharArray();
	            char[] anagramArray = AnagramWithoutSpace.toLowerCase().toCharArray();
	            Arrays.sort(wordArray);
	            Arrays.sort(anagramArray);
	            if(Arrays.equals(wordArray, anagramArray )){
	            	isAnagram=true;
	            }
	        }
	        if(isAnagram==true)
	        {
	            System.out.println(word+" and "+anagram+" are anagrams");
	        }
	        else
	        {
	            System.out.println(word+" and "+anagram+" are not anagrams");
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	    	isAnagram("race", "acer");
	        isAnagram("Mother In Law", "Hitler Woman");
	        isAnagram("joy", "enjoy");
	    }
	}

