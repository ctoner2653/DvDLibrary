/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibaray.dto;

/**
 *
 * @author colby
 */
public class DvD {

    public String title;
    public String releaseDate;
    public String rating;
    public String DirectorName;
    public String studio;
    public String userRating;
    public String Id;
    
    public DvD(String Id) {
        this.Id= Id;
    }
    public String getId(){
        return Id;
    }
    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirectorName() {
        return DirectorName;
    }

    public void setDirectorName(String DirectorName) {
        this.DirectorName = DirectorName;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }

}
