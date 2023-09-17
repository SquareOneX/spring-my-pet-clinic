package squareonex.mypetclinic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import squareonex.mypetclinic.datasource.FakeDataSource;
import squareonex.mypetclinic.services.OwnerService;
import squareonex.mypetclinic.services.PetService;
import squareonex.mypetclinic.services.VetService;
import squareonex.mypetclinic.services.map.OwnerServiceImpl;
import squareonex.mypetclinic.services.map.PetServiceImpl;
import squareonex.mypetclinic.services.map.VetServiceImpl;

@PropertySource("classpath:datasource.properties")
@Configuration
public class MyPetClinicConfig {
    @Bean
    FakeDataSource fakeDataSource(@Value("username") String username,
                                  @Value("password") String password,
                                  @Value("jdbcURL") String jdbcURL)
    {
        return new FakeDataSource(username, password, jdbcURL);
    }
    @Bean
    OwnerService ownerService(){
        return new OwnerServiceImpl();
    }
    @Bean
    PetService petService(){
        return new PetServiceImpl();
    }
    @Bean
    VetService vetService() {
        return new VetServiceImpl();
     }
}
