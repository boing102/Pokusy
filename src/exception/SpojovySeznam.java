package exception;

import java.util.ArrayList;

public class SpojovySeznam {
	static ArrayList<Object> zoznam = new ArrayList<Object>();
	
	void vloz(Object obj) {
		zoznam.add(obj);
	}
	
	void vypisZoznam() {
		for(int i = 0; i < zoznam.size(); i++) {
			System.out.println(zoznam.get(i));
			System.out.println("Nieco... z ineho pc hehehe");

		}
	}
}
