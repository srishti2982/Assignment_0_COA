
public class Sensor {
	public static boolean sensing(double head) {
		double h= head;
		boolean flag=true;
		double r=Math.random();
		if(r>h) {
			for(int i=0;i<3;i++) {
				double k=Math.random();
				if(k<=h) {
					continue;
				}
				else {
					flag=false;
					break;
				}
			}
		}
		else {
			flag=true;
		}
		return flag;
		
	}
}
