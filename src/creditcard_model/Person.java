package creditcard_model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Person {

    private Long id;
    private String name;


    @Id
    @GeneratedValue(strategy = GenerationType.TABLE);

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany
    private List<CreditCard> ccList = new ArrayList<CreditCard>();

}

