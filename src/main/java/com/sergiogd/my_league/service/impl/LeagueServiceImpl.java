package com.sergiogd.my_league.service.impl;

import com.sergiogd.my_league.model.League;
import com.sergiogd.my_league.repository.LeagueRepository;
import com.sergiogd.my_league.service.LeagueService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class LeagueServiceImpl implements LeagueService {

    private final LeagueRepository leagueRepository;

    @Override
    public List<League> getAllLeagues() {
        return this.leagueRepository.getAllLeagues();
    }
}
