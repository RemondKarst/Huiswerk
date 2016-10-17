package ocp.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class SortingMain {
	
	public static void main(String[] args) {
		
		Cookie cookie1 = new Cookie(true, false, true, 5);
		Cookie cookie2 = new Cookie(true, false, true, 5);
		Cookie cookie3 = new Cookie(true, false, true, 10);
		Cookie cookie4 = new Cookie(true, true, true, 20);
		Cookie cookie5 = new Cookie(false, false, false, 30);
		Cookie cookie6 = new Cookie(true, false, true, 50);
		Cookie cookie7 = new Cookie(true, false, true, 5);
		Cookie cookie8 = new Cookie(false, false, true, 4);
		
		List<Cookie> cookieJar = Arrays.asList(cookie1, cookie2, cookie3, cookie4,
				cookie5, cookie6, cookie7, cookie8);
		
		System.out.println("Unsorted:");
		System.out.println(cookieJar);

//		TreeSet<Cookie> set = new TreeSet<>(new Comparator<Cookie>(){
//			public int compare(Cookie p1, Cookie p2) {
//			return (p1.getRadius()-p2.getRadius());
//			}
//			});

		Collections.sort(cookieJar);
//		
		System.out.println("Sorted:");
		System.out.println(cookieJar);
		
		Collections.sort(cookieJar,new Comparator<Cookie>() {

			@Override
			public int compare(Cookie o1, Cookie o2) {
				if (o1.hasChoclat()&&!(o2.hasChoclat())){
					return -1;
				} else if (!(o1.hasChoclat())&&o2.hasChoclat()){
					 return 1;// (o1.getRadius()-o2.getRadius());
				} else {
					return o1.getRadius()-o2.getRadius();
				}
			//	else {
			//	if (o1.hasNoChoclat)
			//	return 1;// (o1.getRadius()-o2.getRadius());
		//	}
			}
		});
		
		System.out.println("Sorted - chocolat first:");
		System.out.println(cookieJar);
	}
}
