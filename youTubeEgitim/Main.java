package youTubeEgitim;

public class Main {

	public static void main(String[] args) {
		CreditManager creditmanager = new CreditManager();
		creditmanager.calculate();
		creditmanager.save();
		
		Customer customer = new Customer();
		customer.id = 1;
		customer.city = "İstanbul";
		
		CustomerManager customerManager = new CustomerManager(customer, new TeacherCreditManager());
		customerManager.save();
		customerManager.delete();
		
		Company company = new Company();
		company.taxNumber = "100000";
		company.companyName = "Arçelik";
		company.id = 100;
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		
		Person person = new Person();
		person.nationalIdentity = "123456";
		
		CustomerManager customerManager2 = new CustomerManager(person, new TeacherCreditManager());
		CustomerManager customerManager3 = new CustomerManager(customer, new MilitaryCreditManager());
		
	}

}
