package com.sergiogd.my_league.service;

import com.sergiogd.my_league.dto.MatchDTO;
import com.sergiogd.my_league.model.Match;

import java.util.List;

public interface MatchService {

    List<Match> getAllMatches();

    List<MatchDTO> getMatchsBySeasonIDAndMatchDay(String seasonId, Integer matchDay);
}
