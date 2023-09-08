package squareonex.mypetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import squareonex.mypetclinic.services.OwnerService;

@SpringBootApplication
public class MyPetClinicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MyPetClinicApplication.class, args);
        OwnerService bean = context.getBean(OwnerService.class);
        System.out.println(bean.findAll());
    }

}
