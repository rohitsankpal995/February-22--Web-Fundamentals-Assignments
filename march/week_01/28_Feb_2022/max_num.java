package Feb_28_2022;

public class max_num {
	
	public static int getmax1(int a, int b) {
		
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
		
	}
	public static int getmax2(int a, int b) {
		
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
		
	}
	public static int getmax3(int a, int b) {
		
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =55;
		 int b=62;
		 int max =0;
		 max = getmax1(a,b);
		System.out.println("Maximum number is "+max);
		
		int c =100;
		int d=90;
		max = getmax2(c,d);
		System.out.println("Maximum number is "+max);
		
		int e =525; 
		int f =624;
		max = getmax3(e,f);
		System.out.println("Maximum number is "+max);

	}

}
