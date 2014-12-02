/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.LinkFollowersRecommendation_M;
import entities_DAO.LinkFollowersRecommendation_M_DAO;
import java.util.List;

/**
 *
 * @author t00178764
 */
public class TestLinkFollowersRecommendation_M {
    public static void main(String[] args) {
        
        LinkFollowersRecommendation_M_DAO link_M_DAO = new LinkFollowersRecommendation_M_DAO();

        //TEST FOR FIND BY ID_LIKELIST
        LinkFollowersRecommendation_M link_M = link_M_DAO.find(1);
        System.out.println(link_M.getId_link());

        //TEST FOR CREATE
        link_M = new LinkFollowersRecommendation_M(0, 11, 11);
        System.out.println(link_M_DAO.create(link_M).getId_link());

        //TEST FOR UPDATE
        link_M = new LinkFollowersRecommendation_M(0, 12,12); 
        link_M_DAO.update(link_M);

        //TEST FOR DELETE
        link_M = new LinkFollowersRecommendation_M(0, 12,12); 
        link_M_DAO.delete(link_M);

        //TEST FOR FIND ALL
        List<LinkFollowersRecommendation_M> list_link_M = link_M_DAO.findAll();
        for (LinkFollowersRecommendation_M aLink : list_link_M) {
            System.out.println(aLink.getId_link() + " - " + aLink.getId_followerlist() + " - " + aLink.getId_recommendation_music());
        }
    }
}
