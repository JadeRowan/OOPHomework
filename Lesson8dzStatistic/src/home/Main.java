package home;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("a.txt");
		Map <String, Integer> taskMap = splitToMap(file);
		
		printStatistic(taskMap);
		System.out.println("Для сравнения:");
		System.out.println(taskMap);
	}
	
	public static Map <String,Integer> splitToMap(File file){
		Map <String, Integer> splitMap = new HashMap<>();
		try(FileReader reader = new FileReader(file))
		{
			int c;
			
			for(;(c=reader.read()) != -1;) {
				String symbol = String.valueOf((char)c);
				switch(symbol) {
					case " ":
					case ",":
					case ".":
					case ":":
					case ";":
						continue;
				}
				symbol = symbol.substring(0,1).toUpperCase();
				
				Integer a = splitMap.get(symbol);
				if(a == null) {
					splitMap.put(symbol , 1);
				}else {
					splitMap.put(symbol , splitMap.get(symbol) + 1);
				}
				
			}
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return splitMap;
	}
	
	public static void printStatistic(Map <String, Integer> map) {
		Set<String> keys = map.keySet();
		Integer letterSum = 0;
		String output;
		double percent;
		for (String key : keys) {
			letterSum += map.get(key);
		}
		for (String key : keys) {
			percent = Math.round((double)map.get(key) *1000 / letterSum) / 10.0;
			output = " "+key+": " + percent + "%";
			System.out.println(output);
			
		}
	}
}
