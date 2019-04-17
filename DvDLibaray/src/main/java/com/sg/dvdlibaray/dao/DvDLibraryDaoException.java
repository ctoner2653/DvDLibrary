/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibaray.dao;

/**
 *
 * @author colby
 */
public class DvDLibraryDaoException extends Exception {
    
        public DvDLibraryDaoException(String message){
            super(message);
        }
        public DvDLibraryDaoException(String message, Throwable clause){
            super(message,clause);
        }
}
