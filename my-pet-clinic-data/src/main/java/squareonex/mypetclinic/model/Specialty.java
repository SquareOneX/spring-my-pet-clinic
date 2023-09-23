package squareonex.mypetclinic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "specialties")
@AllArgsConstructor
@NoArgsConstructor
public class Specialty extends BaseEntity    {
    @Column(name = "description")
    private String description;
}
