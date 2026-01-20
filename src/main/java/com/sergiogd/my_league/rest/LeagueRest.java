package com.sergiogd.my_league.rest;

import com.sergiogd.my_league.model.League;
import com.sergiogd.my_league.service.LeagueService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/leagues")
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
@CrossOrigin
public class LeagueRest {

    private final LeagueService leagueService;

    @GetMapping("/all")
    public List<League> getAllLeagues() {
        return this.leagueService.getAllLeagues();
    }
}
