public class DependencyInjectionTest {
    public static void main(String[] args) {

        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        String customerDetails = service.getCustomerDetails("84273");

        System.out.println(customerDetails);
    }
}
