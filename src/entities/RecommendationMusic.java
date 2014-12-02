/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.util.Date;

/**
 *
 * @author t00178760
 */
public class RecommendationMusic {
    private int idRecommendation;
    private String idMusic;
    private Date dateRecommend;

    public RecommendationMusic(int idRecommendation, String idMusic, Date dateRecommend) {
        this.idRecommendation = idRecommendation;
        this.idMusic = idMusic;
        this.dateRecommend = dateRecommend;
    }

    public int getIDRecommendation() {
        return idRecommendation;
    }

    public void setIDRecommendation(int IDRecommendation) {
        this.idRecommendation = idRecommendation;
    }

    public String getIDMusic() {
        return idMusic;
    }

    public void setIDMusic(String idMusic) {
        this.idMusic = idMusic;
    }

    public Date getDateRecommend() {
        return dateRecommend;
    }

    public void setDateRecommend(Date DateRecommend) {
        this.dateRecommend = dateRecommend;
    }
    
    
}
