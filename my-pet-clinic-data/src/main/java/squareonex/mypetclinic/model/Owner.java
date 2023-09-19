package squareonex.mypetclinic.model;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Owner extends Person{
    private Set<Pet> pets;
}
