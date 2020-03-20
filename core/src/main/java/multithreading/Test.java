package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Dhiraj
 * @date 24/12/19
 */
public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Address address = new Address();


        ExecutorService service = Executors.newFixedThreadPool(20);
        service.execute(()->address.getEmployeeAddress());
        for (int i = 0; i < 20; i++) {
            service.execute(() -> {
                //address.getEmployeeAddress();
                employee.getEmployee(address);
            });
        }
        service.shutdown();

    }
}
