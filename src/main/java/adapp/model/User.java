package adapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by fabiocampos on 29/05/17.
 */
@Document(collection = "teste")
public class User {
    @Id
    public String id;

    public String name;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%s, name='%s']",
                id, name);
    }

}
