package abstraction;

public  class Bclass extends Aclass{

	public Bclass(int b) {
		super(12);
		super.a=b;
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		Bclass bb=new Bclass(10);
		bb.simple();
        bb.siso();
        Aclass aa=new Bclass(10);
        aa.simple();
	}



	@Override
	void siso() {
		System.out.println("hellos");
		System.out.println(super.a);
	}

	@Override
	void simple() {
		System.out.println("hellow am");
	}

}

	
