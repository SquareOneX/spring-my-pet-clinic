package squareonex.mypetclinic.services;

import squareonex.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
