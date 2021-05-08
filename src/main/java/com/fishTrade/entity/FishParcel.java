package com.fishTrade.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class FishParcel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double weight;
    private double price;
    private double deliveryPrice;
    private boolean isRegistered;
    private boolean isWrittenOff;
    @ManyToOne
    @JoinColumn(name="employeeId")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name ="fishId")
    private Fish fish;

    public FishParcel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public boolean isWrittenOff() {
        return isWrittenOff;
    }

    public void setWrittenOff(boolean writtenOff) {
        isWrittenOff = writtenOff;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Fish getFish() {
        return fish;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FishParcel that = (FishParcel) o;
        return id == that.id && Double.compare(that.weight, weight) == 0 && Double.compare(that.price, price) == 0 && Double.compare(that.deliveryPrice, deliveryPrice) == 0 && isRegistered == that.isRegistered && isWrittenOff == that.isWrittenOff && Objects.equals(employee, that.employee) && Objects.equals(fish, that.fish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weight, price, deliveryPrice, isRegistered, isWrittenOff, employee, fish);
    }

    @Override
    public String toString() {
        return "FishParcel{" +
                "id=" + id +
                ", weight=" + weight +
                ", price=" + price +
                ", deliveryPrice=" + deliveryPrice +
                ", isRegistered=" + isRegistered +
                ", isWrittenOff=" + isWrittenOff +
                ", employee=" + employee +
                ", fish=" + fish +
                '}';
    }
}




