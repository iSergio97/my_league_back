package com.sergiogd.my_league.rest;

import com.sergiogd.my_league.model.SeasonTeam;
import com.sergiogd.my_league.model.Team;
import com.sergiogd.my_league.service.SeasonTeamService;
import com.sergiogd.my_league.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/season-teams")
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class SeasonTeamRest {

    private final SeasonTeamService seasonTeamService;

    @GetMapping("/all")
    public List<SeasonTeam> getAll() {
        return this.seasonTeamService.getAllSeasonTeams();
    }
}
