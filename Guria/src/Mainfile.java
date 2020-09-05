
public class Mainfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Infiltrator infiltrator=new Infiltrator();
		double head = 0.00;
		for(int x = 0; x < 10; x++) {
			head = head + 0.10;
		for(int q=3; q< 15; q++) {
			int width = q;
		for(int p=0;p<20;p++) {
			int time=infiltrator.decision(width, head);
			sum = sum+time;
		}
		int result=sum/20;
		System.out.print(result);
		System.out.print("\t");
	}
		System.out.print("\n");
}
	}

}
