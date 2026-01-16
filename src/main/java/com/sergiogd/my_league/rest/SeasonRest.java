package com.sergiogd.my_league.rest;

import com.sergiogd.my_league.model.League;
import com.sergiogd.my_league.model.Season;
import com.sergiogd.my_league.service.LeagueService;
import com.sergiogd.my_league.service.SeasonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seasons")
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class SeasonRest {

    private final SeasonService seasonService;

    @GetMapping("/all")
    public List<Season> getAllSeasons() {
        return this.seasonService.getAllSeasons();
    }
}
