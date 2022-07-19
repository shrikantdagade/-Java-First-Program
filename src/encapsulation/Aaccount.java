package encapsulation;

public class Aaccount {
	private long acc_no;
	private String name;
	private float ammount;
	
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no=acc_no;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public float getammount() {
		return ammount;
	}
	public void setammount(float ammount) {
		this.ammount=ammount;
	}
	public static void main(String[] args) {
		Aaccount aa =new Aaccount ();
		aa.setAcc_no(551023);
		aa.setname("shrikant");
        aa.setammount(1236.45f);
        System.out.println(aa.getAcc_no()+" "+aa.getname()+" "+aa.getammount());
	}

}
