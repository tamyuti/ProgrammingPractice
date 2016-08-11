package javaCoding2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class Dictionary {
	Map<String,String> map=new TreeMap<String,String>();
	public void putDictionary(String key,String value)
	{
		if(map.containsKey(key)){
			map.replace(key, value);
		}
		else{
			map.put(key, value);
		}
		
	}
	public static void main(String[] args) {
		Dictionary d=new Dictionary();
		d.putDictionary("take", "carry or bring with one");
		d.putDictionary("jump", "move suddenly and quickly in a specified way");
		d.putDictionary("walk", "an act of traveling or an excursion on foot");
		d.putDictionary("run", "an spell of running");
		d.putDictionary("dance", "move in a quick and lively way");
		d.putDictionary("help", "serve someone with");
		d.putDictionary("run", "an act or spell of running");
		Set set = d.map.entrySet();
	    Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry m = (Map.Entry)iterator.next();
	         System.out.print(m.getKey() +" -> ");
	         System.out.println(m.getValue());
	      }
		
	}

}
