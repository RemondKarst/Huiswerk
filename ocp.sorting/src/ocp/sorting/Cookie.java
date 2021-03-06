package ocp.sorting;

public class Cookie implements Comparable<Cookie>{

	private boolean hasChoclat;
	private boolean hasNuts;
	private boolean hasDoraTheExplorerSprinkels;
	private int radius;

	public Cookie(boolean hasChoclat, boolean hasNuts,
			boolean hasDoraTheExplorerSprinkels, int radius) {
		this.hasChoclat = hasChoclat;
		this.hasNuts = hasNuts;
		this.hasDoraTheExplorerSprinkels = hasDoraTheExplorerSprinkels;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	public boolean hasChoclat(){
		return hasChoclat;
	}
	
	public String toString() {
		String output = String.format("Cookie (%d)", radius);
		
		String conjunction = "with";
		
		if (hasChoclat) {
			output += " " + conjunction + " choclat";
			conjunction = "and";
		}

		if (hasNuts) {
			output += " " + conjunction + " nuts";
			conjunction = "and";
		}

		if (hasDoraTheExplorerSprinkels) {
			output += " " + conjunction + " Dora Dora Dora";
		}
		
		return "\n" + output;
	}
	public int compareTo(Cookie cookie) {
		return (this.radius-cookie.radius);
		}

}