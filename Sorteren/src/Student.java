

import java.util.Date;




public class Student implements Comparable<Student>, BorneAble{

	private String voornaam;
	private String achternaam;
	private String studentNummer;
	private Date geboortedatum;

	public Student(String voornaam, String achternaam, String studentNummer, Date geboortedatum) {
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.studentNummer = studentNummer;
		this.geboortedatum = geboortedatum;
	}

	public Object getTitel() {
		// TODO Auto-generated method stub
		return "--";
	}
	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public String getStudentNummer() {
		return studentNummer;
	}

	public void setStudentNummer(String studentNummer) {
		this.studentNummer = studentNummer;
	}

	public Date getGeboortedatum() {
		return geboortedatum;
	}

	public void setGeboortedatum(Date geboortedatum) {
		this.geboortedatum = geboortedatum;
	}


	public int compareTo(Student student) {
		return (Integer.parseInt(this.studentNummer) - Integer.parseInt(student.studentNummer));
		}

	@Override
	public String toString() {
		return "Student [voornaam=" + voornaam + ", achternaam=" + achternaam + ", studentNummer=" + studentNummer
				+ ", geboortedatum=" + geboortedatum + "]";
	}


}
