package loosJava;

public class Patternstar {

	public static void main(String[] args) {
		int n=6;
     for(int i=0;i<n+1;i++) {
    	 for(int j=n;j>i;j--) {
    		 System.out.print(" ");
    	 }
    	 for(int k=0;k<(2*i-1);k++) {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
	}

}
