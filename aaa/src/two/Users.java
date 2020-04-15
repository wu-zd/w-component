package two;

public class Users {
private String uname;
private String upass;
public Users(String uname, String upass) {
	super();
	this.uname = uname;
	this.upass = upass;
}
/**
 * @return the uname
 */
public String getUname() {
	return uname;
}
/**
 * @param uname the uname to set
 */
public void setUname(String uname) {
	this.uname = uname;
}
/**
 * @return the upass
 */
public String getUpass() {
	return upass;
}
/**
 * @param upass the upass to set
 */
public void setUpass(String upass) {
	this.upass = upass;
}
}
