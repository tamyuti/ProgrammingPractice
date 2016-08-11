package javaCoding3;

import java.util.Arrays;

public class Anagram {

	public static void isAnagram(String input1, String input2)
	{ 
		boolean isAnagram = false;
		String input1WithoutSpace= input1.replaceAll("\\s", "");
		String input2WithoutSpace= input2.replaceAll("\\s", "");
		if(input1WithoutSpace.length() == input2WithoutSpace.length())
		{
			char[] input1Array = input1WithoutSpace.toLowerCase().toCharArray();
			char[] input2Array = input2WithoutSpace.toLowerCase().toCharArray();
			Arrays.sort(input1Array);
			Arrays.sort(input2Array);
			if(Arrays.equals(input1Array, input2Array )){
				isAnagram=true;
			}
		}
		if(isAnagram)
		{
			System.out.println(input1+" and "+input2+" are anagrams");
		}
		else
		{
			System.out.println(input1+" and "+input2+" are not anagrams");
		}
	}

	public static void main(String[] args)
	{
		isAnagram("race", "acer");
		isAnagram("Mother In Law", "Hitler Woman");
		isAnagram("joy", "enjoy");
	}
}

