package tubesTekom;

import java.util.Arrays;
import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
		Scanner kb;
		kb = new Scanner(System.in);
		
		String line;
		String state1 = null;
		String state2 = null;
		String state3 = null;
		String tenses = null;
		
		System.out.print("Input String : ");
		line = kb.nextLine();
		String regex = "([^a-zA-Z']+)'*\\1*";
		String[] split = line.split(regex);
		System.out.println("Kata yang didapat : "+Arrays.asList(split));

		
		for(int i=0;i<split.length;i++){
			if(split[i].equals("i")||(split[i].equals("you"))||(split[i].equals("we"))||(split[i].equals("they"))||(split[i].equals("he"))||(split[i].equals("she")) ){
				System.out.println(split[i]+" : t_S");
				state1 ="t_S";
			}
			else if(split[i].equals("had")){
				System.out.println(split[i]+" : t_PaP");
				state2 ="t_PaP";
			}
			else if (split[i].equals("has")){
				System.out.println(split[i]+" : t_hs");
				state2 ="t_hs";
			}
			else if(split[i].equals("have")){
				System.out.println(split[i]+" : t_hv");
				state3 ="t_hv";
			}
			else if(split[i].equals("will")){
				System.out.println(split[i]+" : t_F");
				state2 ="t_F";
			}
			else {
				System.out.println(split[i]+" : t_C");
			}
		
		}
		if ((state1=="t_S")&&(state2=="t_F")&&(state3=="t_hv")){
			tenses = "Future Perfect Tense";
		}
		else if ((state1=="t_S")&&(state2=="t_PaP")){
			tenses = "Past Perfect Tense";
		} 
		else if ((state1=="t_S")&&((state2=="t_hs")||(state3=="t_hv"))){
			tenses = "Present Perfect Tense";
		}
		else {
			tenses = "Format kalimat salah";
		}
		System.out.println(tenses);
		kb.close();


	}

}
