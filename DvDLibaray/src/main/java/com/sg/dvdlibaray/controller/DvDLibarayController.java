/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibaray.controller;

import com.sg.dvdlibaray.dao.DvDLibarayDao;
import com.sg.dvdlibaray.dao.DvDLibarayFileImpl;
import com.sg.dvdlibaray.dto.DvD;
import com.sg.dvdlibaray.ui.DvDLibarayView;

import java.util.List;

/**
 *
 * @author colby
 */
public class DvDLibarayController {

    DvDLibarayView view = new DvDLibarayView();
    DvDLibarayDao dao = new DvDLibarayFileImpl();
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    addDvD();
                    break;
                case 2:
                   removeDvD();
                    break;
                case 3:
                    viewAllDvD();
                    break;
                case 4:
                    getDvD();
                    break;
                case 5:
                    editDvD();
                    break;
                case 6:
                    keepGoing = false;
                    break;
                default:
                   unknownCommand();
            }
               goodBye();
        }
       
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    private void addDvD(){
        view.createDvDBanner();
        DvD currentDvD = view.getNewDvDInfo();
        dao.addDvD(currentDvD.getTitle(), currentDvD);
        view.createDvDSuccess();
    }
    private void viewAllDvD(){
        view.viewDvDsBanner();
        List<DvD> DvDList = dao.getAllDvDs();
        view.viewAllDvDs(DvDList);
    }
    private void removeDvD(){
        view.removeDvDBanner();
        dao.removeDvD(view.getTitleDvDSelection());
        view.removeDvDBannerSuccess();
    }
    private void getDvD(){
        view.displayDvDBanner();
        DvD dvd = dao.getDvD(view.getTitleDvDSelection());
        view.getDvD(dvd);
        
    }
    private void editDvD(){
        view.editDvDBanner();
        DvD oldDvD = dao.getDvD(view.getTitleDvDSelection());
        view.editDvD(oldDvD);
      
        
    }
    private void goodBye(){
        view.goodByeMessage();
    }
    private void unknownCommand(){
        view.errorMessage();
    }
}
