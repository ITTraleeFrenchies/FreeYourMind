/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Followers;
import entities_DAO.FollowersDAO;
import java.util.List;

/**
 *
 * @author t00178760
 */
public class TestFollowers {
    public static void main(String[] args) {
        FollowersDAO followersDAO = new FollowersDAO();

        //TEST FOR FIND BY ID_LIKELIST
      /*  Followers follower = followersDAO.find(1);
        System.out.println(follower.getId_followerslist());

        //TEST FOR CREATE
        follower = new Followers(2, "T10000000","T10000001");
        System.out.println(followersDAO.create(follower).getId_followerslist());

        //TEST FOR UPDATE
        follower = new Followers(2, "T10000001","T10000001"); 
        followersDAO.update(follower);

        //TEST FOR DELETE
        follower = new Followers(2, "T10000001","T10000001"); 
        followersDAO.delete(follower);

        //TEST FOR FIND ALL
        List<Followers> list_followers = followersDAO.findAll();
        for (Followers aFollower : list_followers) {
            System.out.println(aFollower.getId_followerslist() + " - " + aFollower.getTnumber());
        }*/
        System.out.println(followersDAO.count("T11111114"));
    }
}
