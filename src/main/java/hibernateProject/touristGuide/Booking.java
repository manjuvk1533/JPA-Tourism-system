package hibernateProject.touristGuide;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Entity;

@Entity
public class Booking {
	@ManyToOne
    @JoinColumn(name = "customer_id")
	private Customer customer;
	@ManyToOne
    @JoinColumn(name = "package_id" )
	private TourPackage Package;

}
