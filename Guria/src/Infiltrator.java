
public class Infiltrator {
	public static int decision(int width, double head) {
		int t=0;
		int j=1;
		Sensor sensor=new Sensor();
		while(j<width) {
			boolean ans=sensor.sensing(head);
			if(ans==true) {
				t = t+10;
				continue;
			}
			else {
				t = t+10;
				j++;
				continue;
			}
		}
		return t;
	}
}
