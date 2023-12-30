import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertion.*;
public class GeopoliticalZone{

	@Test
	public void TestFindGeopoliticalZone(){
	Geolocator geolocator = new Geolocator();
	String state = "Kano";
	String zone = geolocator.findGeopoliticalZone(state);
	assertEquals("NW"+zone);
	}


}