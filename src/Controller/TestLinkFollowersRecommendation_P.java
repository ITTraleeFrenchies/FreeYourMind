/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.LinkFollowersRecommendation_P;
import entities_DAO.LinkFollowersRecommendation_P_DAO;
import java.util.List;

/**
 *
 * @author t00178764
 */
public class TestLinkFollowersRecommendation_P {
    public static void main(String[] args) {
        
        LinkFollowersRecommendation_P_DAO link_P_DAO = new LinkFollowersRecommendation_P_DAO();

        //TEST FOR FIND BY ID_LIKELIST
        LinkFollowersRecommendation_P link_P = link_P_DAO.find(1);
        System.out.println(link_P.getId_link());

        //TEST FOR CREATE
        link_P = new LinkFollowersRecommendation_P(0, 11, 11);
        System.out.println(link_P_DAO.create(link_P).getId_link());

        //TEST FOR UPDATE
        link_P = new LinkFollowersRecommendation_P(0, 12,12); 
        link_P_DAO.update(link_P);

        //TEST FOR DELETE
        link_P = new LinkFollowersRecommendation_P(0, 12,12); 
        link_P_DAO.delete(link_P);

        //TEST FOR FIND ALL
        List<LinkFollowersRecommendation_P> list_link_P = link_P_DAO.findAll();
        for (LinkFollowersRecommendation_P aLink : list_link_P) {
            System.out.println(aLink.getId_link() + " - " + aLink.getId_followerlist() + " - " + aLink.getId_recommendation_playlist());
        }
    }
}
