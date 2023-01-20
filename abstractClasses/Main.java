package abstractClasses;

public class Main {

	public static void main(String[] args) {
		GameCalculator gamecalculator = new KidsGameCalculator();
		gamecalculator.hesapla();
		gamecalculator.gameOver();
	}

}
