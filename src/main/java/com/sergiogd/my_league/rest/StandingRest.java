package com.sergiogd.my_league.rest;

import com.sergiogd.my_league.dto.StandingDTO;
import com.sergiogd.my_league.service.StandingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/standings")
@CrossOrigin
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class StandingRest {

    private final StandingService standingService;

    @GetMapping("/getStandings/{seasonId}")
    public List<StandingDTO> getStandingsByJourneyAndSeasonId(@PathVariable("seasonId") String seasonId, @RequestParam("journey") Integer journey) {
        return this.standingService.getStandingsByJourneyAndSeasonId(seasonId, journey);
    }
}
