/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibaray.dao;

import com.sg.dvdlibaray.dto.DvD;
import java.util.List;

/**
 *
 * @author colby
 */
public interface DvDLibarayDao {
    
    DvD addDvD(String title, DvD dvd);
    
    DvD removeDvD(String title);
    
    List<DvD> getAllDvDs();
    
    DvD getDvD(String title);
    
  
    
}
