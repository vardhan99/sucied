package source;

public class Random {

	public static void main(String[] args) {
		String productId = null;
		// TODO Auto-generated method stub
		Random random = new Random();
		int randomNumber = random.nextInt(900) + 100;
		String firstTwoLetters = "V";
		productId = firstTwoLetters + randomNumber;
		System.out.println(productId);
	}

	private int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
