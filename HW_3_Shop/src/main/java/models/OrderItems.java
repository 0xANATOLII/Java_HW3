package models;

import lombok.Data;
import org.hibernate.criterion.Order;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="tbl_orderitems")
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isDelete;
    private Date dateCreated;

    private Float priceBuy;
    private int count;
    @ManyToOne
    @JoinColumn(name="order_id",nullable = false)
    private Order orderId;

    @ManyToOne
    @JoinColumn(name="product_id",nullable = false)
    private Product productId;
}
