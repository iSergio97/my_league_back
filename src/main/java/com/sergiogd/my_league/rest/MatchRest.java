package com.sergiogd.my_league.rest;

import com.sergiogd.my_league.dto.MatchDTO;
import com.sergiogd.my_league.model.Match;
import com.sergiogd.my_league.service.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class MatchRest {

    private final MatchService matchService;

    @GetMapping("/all")
    public List<Match> getAll() {
        return this.matchService.getAllMatches();
    }

    @GetMapping("getMatchs/{seasonId}")
    public List<MatchDTO> getMatchsBySeasonIDAndMatchDay(@PathVariable("seasonId") String seasonId, @RequestParam("matchDay") Integer matchDay) {
        return this.matchService.getMatchsBySeasonIDAndMatchDay(seasonId, matchDay);
    }
}
