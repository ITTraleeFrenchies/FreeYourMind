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
    private int IDRecommendation;
    private int IDMusic;
    private Date DateRecommend;

    public RecommendationMusic(int IDRecommendation, int IDMusic, Date DateRecommend) {
        this.IDRecommendation = IDRecommendation;
        this.IDMusic = IDMusic;
        this.DateRecommend = DateRecommend;
    }

    public int getIDRecommendation() {
        return IDRecommendation;
    }

    public void setIDRecommendation(int IDRecommendation) {
        this.IDRecommendation = IDRecommendation;
    }

    public int getIDMusic() {
        return IDMusic;
    }

    public void setIDMusic(int IDMusic) {
        this.IDMusic = IDMusic;
    }

    public Date getDateRecommend() {
        return DateRecommend;
    }

    public void setDateRecommend(Date DateRecommend) {
        this.DateRecommend = DateRecommend;
    }
    
    
}
