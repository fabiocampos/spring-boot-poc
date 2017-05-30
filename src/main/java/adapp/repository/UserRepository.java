package adapp.repository;

import adapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by fabiocampos on 29/05/17.
 */

public interface UserRepository extends MongoRepository<User, String> {

    public User findByName(String name);

}