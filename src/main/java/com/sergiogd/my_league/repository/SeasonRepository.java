package com.sergiogd.my_league.repository;

import com.sergiogd.my_league.dto.SeasonDTO;
import com.sergiogd.my_league.model.Season;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Mapper
@Component
@Transactional
public interface SeasonRepository {

    List<Season> getAllSeasons();

    List<SeasonDTO> getSeasonsByLeagueId(@Param("leagueId")UUID leagueId);
}
