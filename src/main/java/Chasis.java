public class Chasis {
	private int nroChasis;
	private String material;

	public int getNroChasis() {
		return this.nroChasis;
	}

	public void setNroChasis(int nroChasis) {
		this.nroChasis = nroChasis;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	public Chasis (int nroChasis , String material){
		this.nroChasis=nroChasis;
		this.material=material;
	}
}