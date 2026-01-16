package com.sergiogd.my_league.service.impl;

import com.sergiogd.my_league.model.Match;
import com.sergiogd.my_league.repository.MatchRepository;
import com.sergiogd.my_league.service.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    @Override
    public List<Match> getAllMatches() {
        return this.matchRepository.getAllMatches();
    }
}
