package information;

public class AboutBox {

	private final static String DEVELOPERS = "Tyler Phippen, Nicola Daoud, Gyubeom Kim, and Jun Kim";
	private final static String VERSION_NUMBER = AboutBox.class.getPackage().getImplementationVersion();

	public AboutBox() {

	}

	public String getMyVersionNumber() {
		return VERSION_NUMBER;
	}

	public String getMyDevelopers() {
		return DEVELOPERS;
	}

	public static void main(final String[] args) {
		final AboutBox box = new AboutBox();
		System.out.println(box.getMyDevelopers());
		System.out.println(box.getMyVersionNumber());
	}

}