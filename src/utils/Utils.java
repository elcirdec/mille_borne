package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import cartes.Carte;

public class Utils {

	public <T> T extraire(List<T> list){
		Random r = new Random();
		int ran=r.nextInt(list.size());
		T carte=list.get(ran);
		list.remove(carte);
		
		return carte;
	}
	
	public <T> List<T> melanger(List<T> list){
		List<T> list2=  new ArrayList<T>();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			T t=extraire(list);
			list2.add(t);
			list.remove(t);
		}
		return list2;
	}

	public <T> boolean verifierMelange(List<T> list1,List<T> list2) {
		if(list1.size()!=list2.size()) {
			return false;
		}
		for(int i=0; i<list1.size(); i++) {
			int freql1=Collections.frequency(list1, list1.get(i));
			int freql2=Collections.frequency(list2, list1.get(i));
			if(freql1!=freql2) {
				return false;
			}
		}
		return true;
		
	}
	
	
	
	
	
}
