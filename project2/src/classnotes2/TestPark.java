package classnotes2;

public class TestPark {

	public static void main(String[] args) {
	   Park centralPark = new Park();
	   centralPark.createSwings();
	   
	   Park icecream = new Park();
	   icecream.icecreamtruck();
	   
	   Park funSlide = new Park();
	   funSlide.slides();
	   
	   ParkingLot BigLot = new ParkingLot();
	   BigLot.createBigLot();
	   
	   Park Cars= new Park();
	   Cars.icecreamtruck(centralPark + funSlide);
	   }

}
