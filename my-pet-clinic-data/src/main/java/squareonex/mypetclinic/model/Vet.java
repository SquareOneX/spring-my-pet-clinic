package squareonex.mypetclinic.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Vet extends Person{
    private VetSpecialty specialty;
}
