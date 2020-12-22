package kerneels.mvc.models;

import javax.persistence.*;

@Entity() // Will be used by JPA, is stored in DB
@Table(name="Customer") // Name of Table in DB
public class Customer {
    @Id // Sets this as PK for JPA
    @GeneratedValue(strategy = GenerationType.AUTO) // Tells JPA that the DB will generate this itself
    public long ID;
    public String first_name;
    public String last_name;
    public String email;
    public String password;
}
