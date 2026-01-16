package com.sergiogd.my_league.rest;

import com.sergiogd.my_league.model.Match;
import com.sergiogd.my_league.service.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/standings")
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class StandingRest {

    private final MatchService matchService;

    @GetMapping("/all")
    public List<Match> getAll() {
        return this.matchService.getAllMatches();
    }
}
