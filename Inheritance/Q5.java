package Inheritance;

class Order{
    int orderID;
    String orderDate;

    Order(String orderDate, int orderID){
        this.orderDate=orderDate;
        this.orderID=orderID;
    }
    String getOrderStatus(){
        return "order placed";
    }

}
class ShippedOrder extends Order{
    int trackingNumber;
    ShippedOrder(int trackingNumber,String orderDate, int orderID){
        super(orderDate,orderID);
        this.trackingNumber=trackingNumber;
    }
    String getOrderStatus(){
        return "order shipped";
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;

    DeliveredOrder(String deliveryDate,int trackingNumber,String orderDate, int orderID){
        super(trackingNumber,orderDate,orderID);
        this.deliveryDate=deliveryDate;
    }
    String getOrderStatus(){
        return "order delivered";
    }
}

public class Q5 {
    public static void main(String[] args) {
        Order o1 = new Order("2026-01-10", 101);
        ShippedOrder o2 = new ShippedOrder(102, "2026-01-11", 102);
        DeliveredOrder o3 = new DeliveredOrder("2026-01-10", 102, "2026-01-10", 102);

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());

    }
}
