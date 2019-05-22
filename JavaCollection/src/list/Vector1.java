package list;

import java.util.*;

public class Vector1{

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();

		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
		v.add("Garima");
		v.add("Ayush");
		Iterator<String>itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	
		
	}


