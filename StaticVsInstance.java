package benchcodepractice;

public class StaticVsInstance {
	
	static int count=1;
	public StaticVsInstance(){
		System.out.println(this.count);
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StaticVsInstance S1=new StaticVsInstance();
      StaticVsInstance S2=new StaticVsInstance();
      StaticVsInstance S3=new StaticVsInstance();
      StaticVsInstance S4=new StaticVsInstance();
      StaticVsInstance S=new StaticVsInstance();
	}

}
