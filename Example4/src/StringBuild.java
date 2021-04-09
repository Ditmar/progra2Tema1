
public class StringBuild {
	private StringBuilder cad;
	public StringBuild(String cad) {
		this.cad = new StringBuilder(cad);
	}
	public StringBuilder reverse() {
		return this.cad.reverse();
	}
}
