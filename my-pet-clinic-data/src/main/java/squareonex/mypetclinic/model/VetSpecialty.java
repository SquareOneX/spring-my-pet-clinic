package squareonex.mypetclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "specialties")
public class VetSpecialty extends BaseEntity    {
    @Column(name = "description")
    private String description;
}
