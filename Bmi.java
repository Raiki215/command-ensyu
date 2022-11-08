public class Main {
	public static void main(String[] args){
		double height = 1.69;
		double weight = 62;
		double height2 = 1.70;
		double weight2 = 75;
		System.out.println(String.format("%.2f",weight/(height*height)));
		System.out.println(String.format("%.2f",weight2/(height2*height2)));
	}
}
