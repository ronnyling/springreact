package repositories;


import model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface ContactRepository extends CrudRepository<Contact, String> {
    @Override
    void delete(Contact deleted);

    Optional<Contact> findById(String id);

    Optional<Contact> getId(String id);
}