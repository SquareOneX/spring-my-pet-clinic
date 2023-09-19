package squareonex.mypetclinic.model;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Owner extends Person{
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;
}
