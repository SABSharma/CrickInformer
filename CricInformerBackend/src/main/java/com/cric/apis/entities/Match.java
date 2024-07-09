package com.cric.apis.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "crick_matches")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;

    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;

    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    private MatchStatus status;

    private Date date= new Date();


    // set the match ststus sccording to match comleted

    public void setMatchStatus(){
        if(textComplete.isEmpty()){
            this.status=MatchStatus.LIVE;
        }
        else{
            this.status=MatchStatus.COMPLETED;
        }
    }



}
