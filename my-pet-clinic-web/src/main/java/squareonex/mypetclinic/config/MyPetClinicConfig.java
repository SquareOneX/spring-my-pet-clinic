package squareonex.mypetclinic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import squareonex.mypetclinic.datasource.FakeDataSource;
import squareonex.mypetclinic.repositories.OwnerRepository;
import squareonex.mypetclinic.repositories.PetRepository;
import squareonex.mypetclinic.repositories.PetTypeRepository;
import squareonex.mypetclinic.repositories.SpecialtyRepository;
import squareonex.mypetclinic.services.*;
import squareonex.mypetclinic.services.map.*;
import squareonex.mypetclinic.services.springdatajpa.PetServiceImpl;
import squareonex.mypetclinic.services.springdatajpa.PetTypeServiceImpl;
import squareonex.mypetclinic.services.springdatajpa.SpecialtyServiceImpl;

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
    @Profile("map")
    PetService petService(){
        return new PetServiceMapImpl();
    }
    @Bean(name = "petService")
    @Profile("jpa")
    PetService petJPAService(PetRepository petRepository){
        return new PetServiceImpl(petRepository);
    }
    @Bean
    VetService vetService() {
        return new VetServiceImpl();
     }
    @Bean
    @Profile("map")
    PetTypeService petTypeService() {
        return new PetTypeServiceMapImpl();
    }
    @Bean(name = "petTypeService")
    @Profile("jpa")
    PetTypeService petTypeJPAService(PetTypeRepository petTypeRepository) {
        return new PetTypeServiceImpl(petTypeRepository);
    }
    @Bean
    @Profile("map")
    SpecialtyService vetSpecialtyService() {
        return new SpecialtyServiceMapImpl();
    }
    @Bean(name = "vetSpecialtyService")
    @Profile("jpa")
    SpecialtyService vetSpecialtyJPAService(SpecialtyRepository repository) {
        return new SpecialtyServiceImpl(repository);
    }
}
