package com.sergiogd.my_league.service;

import com.sergiogd.my_league.dto.StandingDTO;

import java.util.List;

public interface StandingService {

    List<StandingDTO> getStandingsByJourneyAndSeasonId(String seasonId, Integer matchDay);
}
