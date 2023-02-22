package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Data
@Entity
@Table(name="tbl_roles")

public class Baskets {
        @ManyToMany
        @JoinColumn(name="user_Id",nullable = false)
        private User userId;

        @ManyToMany
        @JoinColumn(name="role_Id",nullable = false)
        private Role roleId;

        private  int count;
}
