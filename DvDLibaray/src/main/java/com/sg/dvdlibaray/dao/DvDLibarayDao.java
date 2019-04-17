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
    
    DvD addDvD(String title, DvD dvd)
            throws DvDLibraryDaoException;
    
    DvD removeDvD(String title)
            throws DvDLibraryDaoException;
    
    List<DvD> getAllDvDs()
            throws DvDLibraryDaoException;
    
    DvD getDvD(String title)
            throws DvDLibraryDaoException;
    
    void editDvD()
            throws DvDLibraryDaoException;
    
}
