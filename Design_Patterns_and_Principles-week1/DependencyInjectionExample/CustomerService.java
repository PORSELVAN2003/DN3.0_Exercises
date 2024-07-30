public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public String getCustomerDetails(String id) {
        return repository.findCustomerById(id);
    }
}
