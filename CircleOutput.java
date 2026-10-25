public class CircleOutput{
public static void main(String[] args){

//Creates yip/yippee
Circle yippee = new Circle(5);
Circle yip = new Circle(3);

//Prints the stats of yip
yip.printStats();

//sets the (x,y) of yippee and prints the stats
yippee.setPoint(2,4);
yippee.printStats();

//Checks if the two circles are at the same point
if(yip.equals(yippee)==true){
   System.out.println("These circles are centered at the same point.");
}else{
   System.out.println("These circles are centered at different points.");
}
System.out.println();


}
}