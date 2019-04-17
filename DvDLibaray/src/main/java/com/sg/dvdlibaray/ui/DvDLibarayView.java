/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibaray.ui;

import com.sg.dvdlibaray.dao.DvDLibarayDao;
import com.sg.dvdlibaray.dao.DvDLibarayFileImpl;
import com.sg.dvdlibaray.dto.DvD;
import java.util.List;

/**
 *
 * @author colby
 */
public class DvDLibarayView {

    UserIO io = new UserIOConsoleImpl();
    DvDLibarayDao dao = new DvDLibarayFileImpl();
    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. Add DVD");
        io.print("2. Remove DVD");
        io.print("3. View All DVDs");
        io.print("4. View Specific DVD");
        io.print("5. Edit Specific DVD");
        io.print("6. Exit");

        return io.readInt("Please select from the"
                + " above choices.", 1, 6);
    }

    public DvD getNewDvDInfo() {
        String title = io.readString("What is the DvDs Title?");
        String releaseDate = io.readString("What is the DvDs Release Date?");
        String rating = io.readString("What is the DvDs Rating?");
        String directorName = io.readString("What is the DvDs Directors Name?");
        String studio = io.readString("What is the DvDs production studio?");
        String userRating = io.readString("What is your personal rating of the DvD?");
        DvD currentDvD = new DvD(title);
        currentDvD.setReleaseDate(releaseDate);
        currentDvD.setRating(rating);
        currentDvD.setDirectorName(directorName);
        currentDvD.setStudio(studio);
        currentDvD.setUserRating(userRating);
        return currentDvD;

    }

    public void createDvDBanner() {
        io.print("=== CREATE DVD ===");
    }

    public void createDvDSuccess() {
        io.print("=== DVD CREATED ===");
    }

    public void viewAllDvDs(List<DvD> dvdList) {
        for (DvD currentDvD : dvdList) {
            io.print("Title: " + currentDvD.getTitle() + "|| "
                    + "Release Date: " + currentDvD.getReleaseDate() + "|| "
                    + "Rating: " + currentDvD.getRating() + "|| "
                    + "Director's Name: " + currentDvD.getDirectorName() + "|| "
                    + "Studio Name: " + currentDvD.getStudio() + "|| "
                    + "User Rating: " + currentDvD.getUserRating());
        }
        io.readString("Please Hit Enter To Continue");
    }

    public void viewDvDsBanner() {
        io.print("=== VIEW ALL DVDS");
    }

    public void removeDvDBanner() {
        io.print("=== REMOVE DVD ===");
    }

    public String getTitleDvDSelection() {
        String selection = io.readString("What is the DvDs title?");
        return selection;
    }

    public void removeDvDBannerSuccess() {
        io.print("=== DVD REMOVED ===");
    }

    public void displayDvDBanner() {
        io.print("=== DISPLAY DVD ===");
    }

    public void getDvD(DvD currentDvD) {
        if (currentDvD != null) {
            io.print("Title: " + currentDvD.getTitle() + "|| "
                    + "Release Date: " + currentDvD.getReleaseDate() + "|| "
                    + "Rating: " + currentDvD.getRating() + "|| "
                    + "Director's Name: " + currentDvD.getDirectorName() + "|| "
                    + "Studio Name: " + currentDvD.getStudio() + "|| "
                    + "User Rating: " + currentDvD.getUserRating());

        } else {
            io.print("DvD does not exist");
        }
        io.readString("Press Enter To Continue");
    }

    public void editDvDBanner() {
        io.print("=== EDIT DVD ===");
    }

    public void editDvD(DvD currentDvD) {
        dao.removeDvD(currentDvD.getTitle());
        if (currentDvD != null) {
            io.print("1. Release Date");
            io.print("2. Rating");
            io.print("3. Studio Name");
            io.print("4. User Rating ");
            io.print("5. Director Name");

            int selection = io.readInt("Please select from the"
                    + " above choices.", 1, 4);
            switch (selection) {
                case 5:
                    String directorName = io.readString("What is the new Directors Name?");
                    currentDvD.setTitle(directorName);
                    break;
                case 1:
                    String releaseDate = io.readString("What is the new Release Date?");
                    currentDvD.setReleaseDate(releaseDate);
                    break;
                case 2:
                    String rating = io.readString("What is the new Rating?");
                    currentDvD.setReleaseDate(rating);
                    break;
                case 3:
                    String studioName = io.readString("What is the new Studio Name?");
                    currentDvD.setReleaseDate(studioName);
                    break;
                case 4:
                    String userRating = io.readString("What is the new User Rating?");
                    currentDvD.setReleaseDate(userRating);
                    break;
                default:
                    break;
            }
        } else {
            io.print("DvD does not exist");
        }
       
      
    }
    public void errorMessage(){
        io.print("Unknown Command");
    }
    public void goodByeMessage(){
        io.print("GoodBye");
    }
}
