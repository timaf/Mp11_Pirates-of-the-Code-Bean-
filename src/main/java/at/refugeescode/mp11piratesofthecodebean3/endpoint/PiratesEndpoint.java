package at.refugeescode.mp11piratesofthecodebean3.endpoint;

import at.refugeescode.mp11piratesofthecodebean3.logic.PirateService;
import at.refugeescode.mp11piratesofthecodebean3.persistence.Pirate;

import java.util.List;

//@RestController
//@RequestMapping("/pirates")
public class PiratesEndpoint {

    private PirateService pirateService;

    public PiratesEndpoint(PirateService pirateService) {
        this.pirateService = pirateService;
    }

    //    @GetMapping
    List<Pirate> findAll() {
        pirateService.populatePirates();
        return pirateService.findAll();
    }

}
