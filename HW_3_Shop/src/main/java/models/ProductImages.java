package models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name="tbl_productimages")
public class ProductImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isDelete;
    private Date DateCreated;
    @Column(length = 500, nullable = false)
    private String name;
    private int priority;
    @ManyToOne
    @JoinColumn(name="product_id",nullable = false)
    private Product productId;

}
