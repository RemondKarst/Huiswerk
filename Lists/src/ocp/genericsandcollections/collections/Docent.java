package ocp.genericsandcollections.collections;


import java.util.Date;

public class Docent  {
	private String voornaam;
	private String achternaam;
	private String titel;
	private Date geboortedatum;

	public Docent(String voornaam, String achternaam, String titel, Date geboortedatum) {
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.titel = titel;
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

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public Date getGeboortedatum() {
		return geboortedatum;
	}

	public void setGeboortedatum(Date geboortedatum) {
		this.geboortedatum = geboortedatum;
	}

}
