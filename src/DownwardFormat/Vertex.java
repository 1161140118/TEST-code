package DownwardFormat;

public class Vertex {
	private String label;

	public Vertex(String label) {
		this.label = label;		
	}
	
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
	public static Vertex createVertex() {
		Word word = new Word("fromVertex");
		word.setProperty("PropertyOfWord");
		return word;
	}
	
	
}
