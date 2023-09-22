package squareonex.mypetclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "types")
@NoArgsConstructor
@RequiredArgsConstructor
public class PetType extends BaseEntity {
    @Column(name = "name")
    @NonNull
    private String name;
}
