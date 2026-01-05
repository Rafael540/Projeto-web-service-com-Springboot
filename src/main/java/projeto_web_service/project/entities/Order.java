package projeto_web_service.project.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
import java.time.Instant;


@Entity
@Table(name = "tb_order")
@EqualsAndHashCode(of ="id")
public class Order  implements Serializable {
    private static final long SeriaVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",timezone = "GMT")
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order() {}

    public Order(Long id, Instant moment, User client) {
        this.id = id;
        this.moment = moment;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }
}
