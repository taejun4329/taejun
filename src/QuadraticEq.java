
public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float dRoots;
		float b= (float)-3.0;
		float c = (float)2.0;
		float k = (float)Math.sqrt(b*b-4*c);
		dRoots = (-b+k)/2;
		System.out.println(dRoots);
		dRoots = (-b-k)/2;
		System.out.println(dRoots);

	}

}
