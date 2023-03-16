package org.howard.edu.hw5;

import java.util.*; 

public class IntegerSet {

	public class IntegerSetException {

	}
	List<Integer> set_int;
	
	public IntegerSet() {
		set_int = new ArrayList<Integer>();
	}
	public class Listemptyexception extends Exception {
		private static final long serialVersionUID = 1L;
		public Listemptyexception(String error) {
			super(error);
		}
	}
	public List<Integer> get_set() {
		return set_int;
	}
	public void set_set(List<Integer> new_set) {
		set_int = new_set;
	}
	public void clear() {
		set_int.clear();
	}	
	public int length() {
		return set_int.size();
	}
	public boolean equals(IntegerSet a) {
		if (set_int.size() != a.length()) {
			return false;
		}	
		else {
			return set_int.containsAll(a.set_int);
		}
	}
	public boolean contains(int value) {
		return set_int.contains(value);
	}
	public int largest() throws Listemptyexception {
		if (set_int.isEmpty()) {
			throw new Listemptyexception("The Set is Empty.");
		}
		else {
			int large = set_int.get(0);
			for (int i = 0; i < set_int.size(); i++) {
				if (set_int.get(i) > large) {
					large = set_int.get(i);
				}
			}
			return large;
		}
	}
	public int smallest() throws Listemptyexception {
		if (set_int.isEmpty()) {
			throw new Listemptyexception("IntegerSet is Empty.");
		}
		else {		
			int small = set_int.get(0);	
			for (int i = 0; i < set_int.size(); i++) {
			
				if (set_int.get(i) < small) {
					small = set_int.get(i);
				}
			}
			return small;
		}
	}
	public void add(int item) {
		if (set_int.contains(item) == false) {
			set_int.add(item);
		}
	}	
	public void remove(int item) {
		if (set_int.contains(item) == true) {
			set_int.remove(set_int.indexOf(item));
		}
	}	
	public void union(IntegerSet b) {
		for (int i = 0; i < b.length(); i++) {
			if (set_int.contains(b.set_int.get(i)) == false) {
				set_int.add(b.set_int.get(i));
			}
		}
	}	
	public void intersect(IntegerSet b) {
		set_int.retainAll(b.set_int);
	}	
	public void diff(IntegerSet b) {
		for (int i = 0; i < b.length(); i++) {
			if (set_int.contains(b.set_int.get(i)) == true) {
				set_int.remove(b.set_int.get(i));
			}
		}
	}	
	public boolean isEmpty() {
		return set_int.isEmpty();
	}
	public String toString() {
		String list = "";
		for (int i = 0; i < set_int.size(); i++) {
			list += set_int.get(i).toString() + ", ";
		}
		return list;
	}
}







