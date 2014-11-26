/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 *
 * @author t00178764
 */
public class LinkFollowersRecommendation_P {
    private int id_link;
    private int id_recommendation_playlist;
    private int id_followerlist;
    
    public LinkFollowersRecommendation_P(int id_link, int id_recommendation_playlist, int id_followerlist){
        this.id_link=id_link;
        this.id_recommendation_playlist=id_recommendation_playlist;
        this.id_followerlist=id_followerlist;
    }
    
    public int getId_link(){
        return id_link;
    }
    
    public void setId_link(int id_link){
        this.id_link=id_link;
    }
    
    public int getId_recommendation_playlist(){
        return id_recommendation_playlist;
    }
    
    public void setId_recommendation_playlist(int id_recommendation_playlist){
        this.id_recommendation_playlist=id_recommendation_playlist;
    }
    
    public int getId_followerlist(){
        return id_followerlist;
    }
    
    public void setId_followerlist(int id_followerlist){
        this.id_followerlist=id_followerlist;
    }
    
}