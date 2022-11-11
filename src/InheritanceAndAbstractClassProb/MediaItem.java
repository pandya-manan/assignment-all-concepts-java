package InheritanceAndAbstractClassProb;

import java.util.List;

public class MediaItem extends Item {
	
	private int runtime;

	public MediaItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MediaItem(Long identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}

	public MediaItem(Long identificationNumber, String title, int numberOfCopies, int runtime) {
		super(identificationNumber, title, numberOfCopies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + ", getIdentificationNumber()=" + getIdentificationNumber()
				+ ", getTitle()=" + getTitle() + ", getNumberOfCopies()=" + getNumberOfCopies() + ", toString()="
				+ super.toString() + "]";
	}

	
	
	

}
