package com.sergiogd.my_league.service.impl;

import com.sergiogd.my_league.model.Season;
import com.sergiogd.my_league.model.Team;
import com.sergiogd.my_league.repository.SeasonRepository;
import com.sergiogd.my_league.repository.TeamRepository;
import com.sergiogd.my_league.service.SeasonService;
import com.sergiogd.my_league.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class TeamServiceImpl implements TeamService {

    private final TeamRepository seasonRepository;

    @Override
    public List<Team> getAllTeams() {
        return this.seasonRepository.getAllTeams();
    }
}
