package models;

import jdk.jfr.Category;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="tbl_orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isDelete;
    private Date dateCreated;

    @Column(length = 500, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="orderstatuses_id",nullable = false)
    private OrderStatuses orderStatusId;
}
