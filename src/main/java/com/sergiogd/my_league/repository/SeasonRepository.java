package com.sergiogd.my_league.repository;

import com.sergiogd.my_league.model.Season;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
@Component
@Transactional
public interface SeasonRepository {

    List<Season> getAllSeasons();
}
