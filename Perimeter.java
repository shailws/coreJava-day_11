package Day11;
class Rectangel{
	public  Rectangel(double lenght, double breadth) {
		double peri = 2*(lenght + breadth);
		System.out.println("Perimeter of Rectangle : " + peri);
	}
}
public class Perimeter {
	public static void main(String args[]) {
		Rectangel rt = new Rectangel(88.9, 55.6);
	}
}
