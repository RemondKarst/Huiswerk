package ocp.genericsandcollections.collections;
import java.util.ArrayList;
import java.util.Date;

public class Klas<E extends Student> extends ArrayList<E> {




	public E getBesteLeerling() {
		
		return get(0);
	}
}
