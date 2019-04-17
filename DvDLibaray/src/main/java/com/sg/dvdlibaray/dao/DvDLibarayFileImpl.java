/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibaray.dao;

import com.sg.dvdlibaray.dto.DvD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author colby
 */
public class DvDLibarayFileImpl implements DvDLibarayDao {
    
    private Map<String, DvD> DvDs = new HashMap<>();
    
    @Override
    public DvD addDvD(String title, DvD dvd) {
        DvD newDvD = DvDs.put(title, dvd);
        return newDvD;
        
    }

    @Override
    public DvD removeDvD(String title) {
        DvD removedDvD = DvDs.remove(title);
        return removedDvD;
    }

    @Override
    public List<DvD> getAllDvDs() {
        return new ArrayList<>(DvDs.values());
    }

    @Override
    public DvD getDvD(String title) {
       return DvDs.get(title);
    }
    
   
    
    

}
