package gmit;

public class Element implements Comparable<Element>{
	private String elementName;
	private int elementScore;
	
	public Element(String elementName, int elementScore) {
		this.elementName = elementName;
		this.elementScore = elementScore;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public int getElementScore() {
		return elementScore;
	}

	public void setElementScore(int elementScore) {
		this.elementScore = elementScore;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Element){
			Element next = (Element) obj;
			return this.elementName.equals(next.getElementName());
		}else{
			return false;
		}
	}
	
	public int compareTo(Element e) {
		if (this.getElementScore() < e.getElementScore()){ 
			return -1;
		}else if (this.getElementScore() > e.getElementScore()){ 
			return 1; 
		}else{ 
			return 0; 
		}
	}
}