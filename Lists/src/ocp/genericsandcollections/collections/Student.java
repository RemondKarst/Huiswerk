package ocp.genericsandcollections.collections;

import java.util.Date;

public class Student {

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

	public Object getTitel() {
		// TODO Auto-generated method stub
		return "Heb die niet";
	}
	@Override
	public boolean equals(Object o){
		
			if (o != null && o instanceof Student) {
			Student c = (Student)o;
			System.out.println("in de equals studentnummer is :"+c.studentNummer);
			return true;//(studentNummer.equals(c.studentNummer));
			}
			else
			return false;
		
	}

}