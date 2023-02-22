package models;

import jdk.jfr.Category;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tbl_userroles")
public class UserRoles {
    @ManyToMany
    @JoinColumn(name="user_Id",nullable = false)
    private User userId;

    @ManyToMany
    @JoinColumn(name="role_Id",nullable = false)
    private Role roleId;
}
