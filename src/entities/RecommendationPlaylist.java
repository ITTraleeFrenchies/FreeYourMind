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
    private int idRecommendation;
    private String idPlaylist;
    private Date dateRecommend;

    public RecommendationPlaylist(int idRecommendation, String idPlaylist, Date dateRecommend) {
        this.idRecommendation = idRecommendation;
        this.idPlaylist = idPlaylist;
        this.dateRecommend = dateRecommend;
    }

    public int getIDRecommendation() {
        return idRecommendation;
    }

    public void setIDRecommendation(int idRecommendation) {
        this.idRecommendation = idRecommendation;
    }

    public String getIDPlaylist() {
        return idPlaylist;
    }

    public void setIDPlaylist(String idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public Date getDateRecommend() {
        return dateRecommend;
    }

    public void setDateRecommend(Date dateRecommend) {
        this.dateRecommend = dateRecommend;
    }
}
