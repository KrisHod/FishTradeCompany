package com.fishTrade.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private java.sql.Date ordered;
    private java.sql.Date shipped;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name ="customerId")
    private Customer customer;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ordered_fish_parcel", joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "fishParcelId"))
    List<FishParcel> fishParcelList;

    @OneToMany(mappedBy = "customerOrder")
    private List<Payment> payments;

    public CustomerOrder() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrdered() {
        return ordered;
    }

    public void setOrdered(Date ordered) {
        this.ordered = ordered;
    }

    public Date getShipped() {
        return shipped;
    }

    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<FishParcel> getFishParcelList() {
        return fishParcelList;
    }

    public void setFishParcelList(List<FishParcel> fishParcelList) {
        this.fishParcelList = fishParcelList;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerOrder that = (CustomerOrder) o;
        return id == that.id && Objects.equals(ordered, that.ordered) && Objects.equals(shipped, that.shipped) && orderStatus == that.orderStatus && Objects.equals(customer, that.customer) && Objects.equals(fishParcelList, that.fishParcelList) && Objects.equals(payments, that.payments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ordered, shipped, orderStatus, customer, fishParcelList, payments);
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "id=" + id +
                ", ordered=" + ordered +
                ", shipped=" + shipped +
                ", orderStatus=" + orderStatus +
                ", customer=" + customer +
                ", fishParcelList=" + fishParcelList +
                ", payments=" + payments +
                '}';
    }
}
