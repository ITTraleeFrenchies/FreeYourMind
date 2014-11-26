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
public class LinkFollowersRecommendation_M {
    private int id_link;
    private int id_recommendation_music;
    private int id_followerlist;
    
    public LinkFollowersRecommendation_M(int id_link, int id_recommendation_music, int id_followerlist){
        this.id_link=id_link;
        this.id_recommendation_music=id_recommendation_music;
        this.id_followerlist=id_followerlist;
    }
    
    public int getId_link(){
        return id_link;
    }
    
    public void setId_link(int id_link){
        this.id_link=id_link;
    }
    
    public int getId_recommendation_music(){
        return id_recommendation_music;
    }
    
    public void setId_recommendation_music(int id_recommendation_music){
        this.id_recommendation_music=id_recommendation_music;
    }
    
    public int getId_followerlist(){
        return id_followerlist;
    }
    
    public void setId_followerlist(int id_followerlist){
        this.id_followerlist=id_followerlist;
    }
    
}
