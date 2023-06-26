import java.util.Scanner;
public class Example {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		boolean x = true;
		System.out.println(x);
		int intero = 9;
		System.out.println(intero);
		double decimali = 2.7;
		System.out.println(decimali);
		System.out.println(intero + decimali);
		System.out.println(intero * decimali);
		
		byte numeroPiccolo = (byte) 6000;
		System.out.println(numeroPiccolo);

		String a = "Good Morning";
		System.out.println(a);
		String b = "Good Evening";
		System.out.println(a + " " + b);
		System.out.println("La lunghezza della prima stringa è: " + a.length()
				+ " , la lunghezza della seconda stringa è: " + b.length()
				+ ". La lunghezza di entrambe le stringhe è :" + (a.length() + b.length()));

		String[] array = { "ciao", "mondo", "bello" };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		int result = sum(4, 2);
		System.out.println(result);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome:");
		String name = input.nextLine();
		System.out.println("Hai inserito " + name);

		System.out.println("Primo Numero:");
		int num1 = input.nextInt();
		System.out.println("Secondo Numero:");
		int num2 = input.nextInt();
		System.out.println("La somma dei numeri è: " + sum(num1, num2));
		input.close();
	}


	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static void printSum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println(sum);
	}

}
