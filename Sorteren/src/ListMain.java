
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;



public class ListMain {

	public static void main(String[] args) {

		List<Docent> docenten = new ArrayList<Docent>();

		docenten.add(new Docent("Peter", "Schuler", "Dhr.", getDate("1980-12-04")));
		docenten.add(new Docent("Peter", "Schuler", "Dhr.", getDate("1980-12-04")));
		docenten.add(new Docent("Carla", "Bullstronk", "Mvr.", getDate("1980-12-04")));
		for (Docent docent : docenten) {
			System.out.format("%s %s, %s %n", docent.getTitel(), docent.getAchternaam(), docent.getVoornaam());
		}

		// }
		//
		// Iterator<Docent> docentenIt = docenten.iterator();
		//
		// while (docentenIt.hasNext()) {
		// Docent docent = (Docent) docentenIt.next();
		// System.out.format("%s %s, %s %n", docent.getTitel(),
		// docent.getAchternaam(), docent.getVoornaam());
		// }

		Klas<Student> klassen = new Klas<Student>();

		klassen.add(new Student("Henk", "Wijmand", "0000312", getDate("1992-12-05")));
		klassen.add(new Student("Klaas", "Bovenkerk", "0000313", getDate("1999-04-25")));
		klassen.add(new Student("Franka", "Machtenvelt", "000190", getDate("1980-12-24")));
		klassen.add(new Student("Henk", "Vars", "0000452", getDate("1978-08-01")));
		klassen.add(new Student("Henk", "Vars", "0000452", getDate("1978-08-01")));

		Klas<DeeltijdStudent> klassen2 = new Klas<DeeltijdStudent>();
		klassen2.add(new DeeltijdStudent("Freek", "Vonk", "0000332", getDate("1992-12-05")));
		klassen2.add(new DeeltijdStudent("Madelief", "de Vries", "0000332", getDate("1992-12-05")));

		printList(klassen);
		System.out.println("");
		System.out.println("nu met sortering opdracht 1.3");
		Collections.sort(klassen);
		printList(klassen);
		System.out.println("de beste leerling is : " + klassen.getBesteLeerling().getAchternaam());
		System.out.println("de beste Deeltijd leerling is : " + klassen2.getBesteLeerling().getAchternaam());
		Student student = new Student("Franka", "Machtenvelt", "000190", getDate("1980-12-24"));
		System.out.println("kijken met contains : " + klassen.contains(student));
		System.out.println("de Equals functie bekijken bij een nieuwe student :"
				+ klassen.equals(new Student("Henk", "Wijmand", "0000312", getDate("1992-12-05"))));

		Collections.sort(klassen, new Comparator<BorneAble>() {

			@Override
			public int compare(BorneAble arg0, BorneAble arg1) {
				return arg0.getGeboortedatum().compareTo(arg1.getGeboortedatum());
			}
		});
		printList(klassen);

		// @Override
		// public int compare(Cookie o1, Cookie o2) {
		// if (o1.hasChoclat()&&!(o2.hasChoclat())){
		// return -1;
		// } else if (!(o1.hasChoclat())&&o2.hasChoclat()){
		// return 1;// (o1.getRadius()-o2.getRadius());
		// } else {
		// return o1.getRadius()-o2.getRadius();
		// }
		// else {
		// if (o1.hasNoChoclat)
		// return 1;// (o1.getRadius()-o2.getRadius());
		// }
	}



	// Iterator<Student> studentenIt = studenten.iterator();
	//
	// while (studentenIt.hasNext()) {
	// Student docent = (Student) studentenIt.next();
	// System.out.format("%s %s, %s %n", docent.getTitel(),
	// docent.getAchternaam(), docent.getVoornaam());
	// }
	//
	// }

	private static void printList(Klas<Student> klassen) {
		for (Student student : klassen) {
			System.out.format("%s %s, %s %n met nummer %s en geb datum %s", student.getTitel(), student.getAchternaam(),
					student.getVoornaam(), student.getStudentNummer(), student.getGeboortedatum());

		}
		System.out.println("");
		System.out.println("-------------------------------------------------");
	}

	public static Date getDate(String date) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (ParseException e) {
			return null;
		}
	}

}
