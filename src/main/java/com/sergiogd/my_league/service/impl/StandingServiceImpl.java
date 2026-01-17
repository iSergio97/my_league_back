package com.sergiogd.my_league.service.impl;

import com.sergiogd.my_league.dto.StandingDTO;
import com.sergiogd.my_league.repository.StandingRepository;
import com.sergiogd.my_league.service.StandingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class StandingServiceImpl implements StandingService {

    private final StandingRepository standingRepository;

    @Override
    public List<StandingDTO> getStandingsByJourneyAndSeasonId(String seasonId, Integer matchDay) {
        UUID standingUUID = UUID.fromString(seasonId);
        return this.standingRepository.getStandingsByJourneyAndSeasonId(standingUUID, matchDay);
    }
}
