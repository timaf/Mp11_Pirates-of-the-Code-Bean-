package at.refugeescode.mp11piratesofthecodebean3.endpoint;

import at.refugeescode.mp11piratesofthecodebean3.logic.PirateService;
import at.refugeescode.mp11piratesofthecodebean3.persistence.Pirate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pirates")
public class PiratesEndpoint {

    private PirateService pirateService;

    public PiratesEndpoint(PirateService pirateService) {
        this.pirateService = pirateService;
    }

    @GetMapping
    List<Pirate> findAll() {
        pirateService.populatePirates();
        return pirateService.findAll();
    }

}

/*Mp11 - Pirates of the Code-Bean #3 (At World's End )
        The application will read from a csv file a collection of pirates with their respective pieces of eight.
        The relation between Pirate and Piece of Eight is a one to one. When the app is started,
        the pirates and the pieces of eight will be stored in the database if they are not already there.
         The right Piece of Eight will be assigned to the right Pirate.
         The app will have an endpoint called /pirates that will display all pirates if receives a get request*/

