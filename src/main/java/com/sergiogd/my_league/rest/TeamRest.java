package com.sergiogd.my_league.rest;

import com.sergiogd.my_league.model.Match;
import com.sergiogd.my_league.model.Team;
import com.sergiogd.my_league.service.MatchService;
import com.sergiogd.my_league.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teams")
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class TeamRest {

    private final TeamService teamService;

    @GetMapping("/all")
    public List<Team> getAll() {
        return this.teamService.getAllTeams();
    }
}
