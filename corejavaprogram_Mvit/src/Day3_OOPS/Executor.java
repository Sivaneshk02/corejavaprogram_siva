package Day3_OOPS;

public class Executor {
public static void main(String[] args) {
Customer c1=new Customer();
c1.setCid(112);
c1.setCname("sivanesh");
c1.setAddress("puducherry");
Customer c2=new Customer();
c2.setCid(113);
c2.setCname("mukesh");
c2.setAddress("karaikal");
System.out.println("Customer id:"+c1.getCid()+" Customer name:"+c1.getCname()+"Customer Address:"+c1.getAddress());
System.out.println(c2);  //calling the tostring method
Customer c3=new Customer();  //invoke Explicit defalut constructor
System.out.println(c3);

Customer c4=new Customer(114,"kaviya","chennai");//invoke parameterized constructor
System.out.println(c4);
}
}
