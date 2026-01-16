package com.sergiogd.my_league.service.impl;

import com.sergiogd.my_league.model.League;
import com.sergiogd.my_league.model.SeasonTeam;
import com.sergiogd.my_league.repository.LeagueRepository;
import com.sergiogd.my_league.repository.SeasonTeamRepository;
import com.sergiogd.my_league.service.LeagueService;
import com.sergiogd.my_league.service.SeasonTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class SeasonTeamServiceImpl implements SeasonTeamService {

    private final SeasonTeamRepository seasonTeamRepository;

    @Override
    public List<SeasonTeam> getAllSeasonTeams() {
        return this.seasonTeamRepository.getAllSeasonTeams();
    }
}
