package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
		//override edilmemesini final ile sağlarız 
		//private kullanılmaz çünkü inherit edilen sınıflar bu alanı göremez
	}
}
