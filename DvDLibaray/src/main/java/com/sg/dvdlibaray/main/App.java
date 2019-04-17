/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibaray.main;

import com.sg.dvdlibaray.controller.DvDLibarayController;

/**
 *
 * @author colby
 */

public class App {

    public static void main(String[] args) {
        
        DvDLibarayController controller = new DvDLibarayController();
        
        controller.run();
    }
}
