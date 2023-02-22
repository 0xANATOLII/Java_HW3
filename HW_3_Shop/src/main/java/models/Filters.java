package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name="tbl_filters")
public class Filters {
    @ManyToMany
    @JoinColumn(name="filterNames_Id",nullable = false)
    private FilterNames filterNamesId;

    @ManyToMany
    @JoinColumn(name="filtervalues_Id",nullable = false)
    private FilterValues filtervaluesId;

    @ManyToMany
    @JoinColumn(name="product_Id",nullable = false)
    private Product productId;

}
