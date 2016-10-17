package ocp.genericsandcollections.collections;

import java.util.Date;

public class DeeltijdStudent extends Student {
	
	private String avondenBeschikbaar;

	public DeeltijdStudent(String voornaam, String achternaam,
			String studentNummer, Date geboortedatum) {
		super(voornaam, achternaam, studentNummer, geboortedatum);
		// TODO Auto-generated constructor stub
	}
	
	public String getAvondenBeschikbaar() {
		return avondenBeschikbaar;
	}

	public void setAvondenBeschikbaar(String avondenBeschikbaar) {
		this.avondenBeschikbaar = avondenBeschikbaar;
	}


}
