package one;

public class PRODUCT {
	private String ID;
	private String NAME;
	private int PRICE;
	private String COLOR;
	private int SIZE;
	private int REPERTORY;
	public PRODUCT(String iD, String nAME, int pRICE, String cOLOR, int sIZE, int rEPERTORY2) {
		super();
		ID = iD;
		NAME = nAME;
		PRICE = pRICE;
		COLOR = cOLOR;
		SIZE = sIZE;
		REPERTORY = rEPERTORY2;
	}
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * @return the nAME
	 */
	public String getNAME() {
		return NAME;
	}
	/**
	 * @param nAME the nAME to set
	 */
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	/**
	 * @return the pRICE
	 */
	public int getPRICE() {
		return PRICE;
	}
	/**
	 * @param pRICE the pRICE to set
	 */
	public void setPRICE(int pRICE) {
		PRICE = pRICE;
	}
	/**
	 * @return the cOLOR
	 */
	public String getCOLOR() {
		return COLOR;
	}
	/**
	 * @param cOLOR the cOLOR to set
	 */
	public void setCOLOR(String cOLOR) {
		COLOR = cOLOR;
	}
	/**
	 * @return the sIZE
	 */
	public int getSIZE() {
		return SIZE;
	}
	/**
	 * @param sIZE the sIZE to set
	 */
	public void setSIZE(int sIZE) {
		SIZE = sIZE;
	}
	/**
	 * @return the rEPERTORY
	 */
	public int getREPERTORY() {
		return REPERTORY;
	}
	/**
	 * @param rEPERTORY the rEPERTORY to set
	 */
	public void setREPERTORY(int rEPERTORY) {
		REPERTORY = rEPERTORY;
	}
	@Override
	public String toString() {
		return "PRODUCT [ID=" + ID + ", NAME=" + NAME + ", PRICE=" + PRICE + ", COLOR=" + COLOR + ", SIZE=" + SIZE
				+ ", REPERTORY=" + REPERTORY + "]";
	}
	
}
