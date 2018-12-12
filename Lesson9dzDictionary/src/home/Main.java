package home;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		File dictFile = new File("Dictionary.txt");
		Map<String, String> dictionary = splitToDict(dictFile);
		System.out.println(dictionary);
		File enFile = new File("English.in");
		File uaFile = new File("Ukrainian.out");
		TranslateToUA(enFile, uaFile, dictionary);
		
		UpdateDict(dictFile);
		
	}

	private static void UpdateDict(File dict) {
		String enWord;
		String uaWord;
		try {
		enWord = strInput("Add english word");
		uaWord = strInput("Add ukranian word");
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Operation canseled");
			return;
		}
		if(enWord == null | uaWord == null) {
			return;
		}
		try(FileWriter writer = new FileWriter(dict, true)){
			String dictPart = "!" + enWord + ">" + uaWord;
			writer.write(dictPart);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String strInput(String phrase) throws NumberFormatException {
		String word = "";
		for (;;) {
			try {
				word = String.valueOf(JOptionPane.showInputDialog(phrase));
				if (word.equals("")) {
					throw new NumberFormatException();
				}
				break;
			} catch (NullPointerException e) {
				word = "";
				JOptionPane.showMessageDialog(null, "Cansel");
				break;
			}
		}
		return word;
	}

	private static void TranslateToUA(File enFile, File uaFile, Map<String, String> dictionary) {
		try (FileReader reader = new FileReader(enFile); FileWriter writer = new FileWriter(uaFile, false)) {
			String enText = "";
			String uaText = "";
			int c;
			while ((c = reader.read()) != -1) {

				enText += (char) c;
			}
			String[] enWordsArr = enText.split(" ");
			for (String enWord : enWordsArr) {
				uaText += " " + dictionary.get(enWord);
			}
			writer.write(uaText);
			System.out.println(uaText);
			writer.flush();
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
	}
	
	private static Map<String, String> splitToDict(File dict) {
		Map<String, String> dictionary = new HashMap<>();
		try (FileReader reader = new FileReader(dict)) {
			String text = "";
			int c;
			while ((c = reader.read()) != -1) {
				text += (char) c;
			}
			String[] dictArray = text.split("!");
			String[] pareArray;
			for (String pare : dictArray) {
				pareArray = pare.split(">");
				dictionary.put(pareArray[0], pareArray[1]);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return dictionary;
	}

}
