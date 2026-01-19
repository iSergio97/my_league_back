package com.sergiogd.my_league.service.impl;

import com.sergiogd.my_league.dto.SeasonDTO;
import com.sergiogd.my_league.model.Season;
import com.sergiogd.my_league.repository.SeasonRepository;
import com.sergiogd.my_league.service.SeasonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class SeasonServiceImpl implements SeasonService {

    private final SeasonRepository seasonRepository;

    @Override
    public List<Season> getAllSeasons() {
        return this.seasonRepository.getAllSeasons();
    }

    @Override
    public List<SeasonDTO> getSeasonsByLeagueId(String leagueId) {
        UUID leagueUUID = UUID.fromString(leagueId);
        return this.seasonRepository.getSeasonsByLeagueId(leagueUUID);
    }
}
