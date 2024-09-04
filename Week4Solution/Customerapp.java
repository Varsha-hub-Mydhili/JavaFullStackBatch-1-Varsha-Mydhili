class Customerapp{
String name;

Customerapp(String name){
this.name=name;
}
void displayCustomerName(){
System.out.println(this.name);
}
public static void main(String args[]){

Customerapp c=new Customerapp("VerizonUSer");
c.displayCustomerName();
}
}
 
