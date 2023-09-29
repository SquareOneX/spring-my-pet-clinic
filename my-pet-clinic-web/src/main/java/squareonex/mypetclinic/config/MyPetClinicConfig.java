package squareonex.mypetclinic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import squareonex.mypetclinic.datasource.FakeDataSource;
import squareonex.mypetclinic.repositories.OwnerRepository;
import squareonex.mypetclinic.services.*;
import squareonex.mypetclinic.services.map.*;

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
    @Profile("map")
    OwnerService ownerService(){
        return new OwnerServiceMapImpl();
    }
    @Bean(name = "ownerService")
    @Profile("jpa")
    OwnerService ownerServiceJpa(OwnerRepository ownerRepository){
        return new squareonex.mypetclinic.services.springdatajpa.OwnerServiceImpl(ownerRepository);
    }
    @Bean
    PetService petService(){
        return new PetServiceImpl();
    }
    @Bean
    VetService vetService() {
        return new VetServiceImpl();
     }
    @Bean
    PetTypeService petTypeService() {
        return new PetTypeServiceImpl();
    }
    @Bean
    SpecialtyService vetSpecialtyService() {
        return new SpecialtyServiceImpl();
    }
}
