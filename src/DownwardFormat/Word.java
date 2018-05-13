package DownwardFormat;

public class Word extends Vertex {
	private String property;
	
	
	
	/**
	 * @return the property
	 */
	public String getProperty() {
		return property;
	}


	/**
	 * @param property the property to set
	 */
	public void setProperty(String property) {
		this.property = property;
	}


	public Word(String label) {
		super(label);
	}


	public void p() {
		System.out.println("children");
	}
	
	
	public static void main(String[] args) {
		Word cw =(Word) Vertex.createVertex();
		cw.p();
	}

}
