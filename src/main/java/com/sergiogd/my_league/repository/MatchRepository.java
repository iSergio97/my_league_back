package com.sergiogd.my_league.repository;

import com.sergiogd.my_league.dto.MatchDTO;
import com.sergiogd.my_league.model.Match;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Mapper
@Component
@Transactional
public interface MatchRepository {

    List<Match> getAllMatches();

    List<MatchDTO> getMatchsBySeasonIDAndMatchDay(@Param("seasonId") UUID seasonId, @Param("matchDay") Integer matchDay);
}
