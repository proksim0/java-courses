public class Calculate 
{
	
	public static void main(String[] arg) 
	{
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		
		
		int summ = first + second;
		int vichitanie = first - second;
		float delenie = first/second;
		int umnozhenie = first*second;
		double stepen = Math.pow(first,second);
		
		System.out.println("�����: " + summ);
		System.out.println("���������: " + vichitanie);
		System.out.println("�������: " + delenie);
		System.out.println("���������: " + umnozhenie);
		System.out.println("�������: " + stepen);
	}
	
}