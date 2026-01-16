package com.sergiogd.my_league.service.impl;

import com.sergiogd.my_league.model.League;
import com.sergiogd.my_league.model.Standing;
import com.sergiogd.my_league.repository.LeagueRepository;
import com.sergiogd.my_league.repository.StandingRepository;
import com.sergiogd.my_league.service.LeagueService;
import com.sergiogd.my_league.service.StandingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class StandingServiceImpl implements StandingService {

    private final StandingRepository standingRepository;

    @Override
    public List<Standing> getAllStandings() {
        return this.standingRepository.getAllStandings();
    }
}
