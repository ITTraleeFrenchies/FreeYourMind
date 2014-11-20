/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities_DAO;

import entities.Music;
import java.util.List;

/**
 *
 * @author t00178760
 */
public class MusicDAO implements DAO{

    @Override
    public Music find(long id) {
        return null;
    }

    public Music create(Music music) {
        return null;
    }

    public Music update(Music music) {
        return null;
    }

    public void delete(Music music) {
    }

    @Override
    public List<Music> findAll() {
        return null;
    }

    @Override
    public List<Music> findById() {
        return null;
    }

    @Override
    public Object create(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
