package io.springboot.mainapp.Employer;

public class EmployerDetails {

	private String eId;
	private String eName;
	private int eage;

	public EmployerDetails() {

	}

	public EmployerDetails(String eId, String eName, int eage) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eage = eage;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

}
