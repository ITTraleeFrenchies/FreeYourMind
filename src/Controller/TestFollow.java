/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Follow;
import entities_DAO.FollowDAO;
import java.util.List;

/**
 *
 * @author t00178760
 */
public class TestFollow {
    public static void main(String[] args) {
        FollowDAO followDAO = new FollowDAO();

        //TEST FOR FIND BY ID_LIKELIST
        Follow follow = followDAO.find(1);
        System.out.println(follow.getIDFollowlist());

        //TEST FOR CREATE
        follow = new Follow(2, "T10000000", "nicknamemember1");
        System.out.println(followDAO.create(follow).getIDFollowlist());

        //TEST FOR UPDATE
        follow = new Follow(2, "T10000001", "nicknamemember2"); 
        followDAO.update(follow);

        //TEST FOR DELETE
        follow = new Follow(2, "T10000001", "nicknamemember2"); 
        followDAO.delete(follow);

        //TEST FOR FIND ALL
        List<Follow> list_follow = followDAO.findAll();
        for (Follow aFollow : list_follow) {
            System.out.println(aFollow.getIDFollowlist() + " - " + aFollow.getTnumber() + " - " + aFollow.getNicknameFollowed());
        }
    }
}
