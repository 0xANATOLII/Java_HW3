package models;

import lombok.Data;

import javax.annotation.processing.Filer;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name="tbl_filternamegroups")
public class FilterNameGroups {
    @ManyToMany
    @JoinColumn(name="filtervalues_Id",nullable = false)
    private FilterNames filternameId;

    @ManyToMany
    @JoinColumn(name="filtervalues_Id",nullable = false)
    private FilterValues filtervaluesId;
}
