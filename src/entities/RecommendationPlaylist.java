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
public class RecommendationPlaylist {
    private int IDRecommendation;
    private int IDPlaylist;
    private Date DateRecommend;

    public RecommendationPlaylist(int IDRecommendation, int IDMusic, Date DateRecommend) {
        this.IDRecommendation = IDRecommendation;
        this.IDPlaylist = IDPlaylist;
        this.DateRecommend = DateRecommend;
    }

    public int getIDRecommendation() {
        return IDRecommendation;
    }

    public void setIDRecommendation(int IDRecommendation) {
        this.IDRecommendation = IDRecommendation;
    }

    public int getIDPlaylist() {
        return IDPlaylist;
    }

    public void setIDPlaylist(int IDPlaylist) {
        this.IDPlaylist = IDPlaylist;
    }

    public Date getDateRecommend() {
        return DateRecommend;
    }

    public void setDateRecommend(Date DateRecommend) {
        this.DateRecommend = DateRecommend;
    }
}
