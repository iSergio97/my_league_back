package com.sergiogd.my_league.dto;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class MatchDTO {

    private UUID matchId;
    private UUID seasonId;
    private Integer matchDay;
    private String localTeam;
    private String awayTeam;
    private Date matchDate;
    private String status;
    private Integer localGol;
    private Integer awayGol;
}
