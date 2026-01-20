package com.sergiogd.my_league.rest;

import com.sergiogd.my_league.dto.SeasonDTO;
import com.sergiogd.my_league.model.Season;
import com.sergiogd.my_league.service.SeasonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seasons")
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
@CrossOrigin
public class SeasonRest {

    private final SeasonService seasonService;

    @GetMapping("/all")
    public List<Season> getAllSeasons() {
        return this.seasonService.getAllSeasons();
    }

    @GetMapping("/{leagueId}")
    public List<SeasonDTO> getSeasonByLeagueID(@PathVariable("leagueId") String leagueId) {
        return this.seasonService.getSeasonsByLeagueId(leagueId);
    }
}
