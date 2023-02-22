package models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name="tbl_orderstatuses")
public class OrderStatuses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isDelete;
    private Date dateCreated;

    @Column(length = 500, nullable = false)
    private String name;


}
