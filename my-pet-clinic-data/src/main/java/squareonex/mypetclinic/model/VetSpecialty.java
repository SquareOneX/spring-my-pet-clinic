package squareonex.mypetclinic.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class VetSpecialty extends BaseEntity    {
    private String description;
}
