package com.sergiogd.my_league.service;

import com.sergiogd.my_league.dto.SeasonDTO;
import com.sergiogd.my_league.model.Season;

import java.util.List;

public interface SeasonService {

    List<Season> getAllSeasons();

    List<SeasonDTO> getSeasonsByLeagueId(String leagueId);
}
