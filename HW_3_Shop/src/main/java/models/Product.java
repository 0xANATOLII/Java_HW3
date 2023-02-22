package models;

import jdk.jfr.Category;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isDelete;
    @Column(length = 500, nullable = false)
    private String name;

    private double price;
    @Column(length = 4000)
    private String description;
    @ManyToOne
    @JoinColumn(name="category_id",nullable = false)
    private Category category;
}
