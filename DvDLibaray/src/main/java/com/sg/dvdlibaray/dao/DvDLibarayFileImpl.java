/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibaray.dao;

import com.sg.dvdlibaray.dto.DvD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author colby
 */
public class DvDLibarayFileImpl implements DvDLibarayDao {

    public static final String ROSTER_FILE = "Library.txt";
    public static final String DELIMITER = "::";

    private Map<String, DvD> DvDs = new HashMap<>();

    @Override
    public DvD addDvD(String title, DvD dvd)
            throws DvDLibraryDaoException {
        DvD newDvD = DvDs.put(title, dvd);
        writeLibrary();
        return newDvD;

    }

    @Override
    public DvD removeDvD(String title)
            throws DvDLibraryDaoException {
        DvD removedDvD = DvDs.remove(title);
        writeLibrary();
        return removedDvD;
    }

    @Override
    public List<DvD> getAllDvDs()
            throws DvDLibraryDaoException {
        loadLibrary();
        return new ArrayList<>(DvDs.values());
    }

    @Override
    public DvD getDvD(String Id)
            throws DvDLibraryDaoException {
        loadLibrary();
        return DvDs.get(Id);
    }
    public void editDvD()
        throws DvDLibraryDaoException{
        writeLibrary();
        
    }
    
    public void loadLibrary() throws DvDLibraryDaoException {
        Scanner scanner;
        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new DvDLibraryDaoException("Could Not Load From Memory", e);

        }
        String currentLine;

        String[] currentTokens;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();

            currentTokens = currentLine.split(DELIMITER);

            DvD currentDvD = new DvD(currentTokens[0]);

            currentDvD.setTitle(currentTokens[1]);
            currentDvD.setReleaseDate(currentTokens[2]);
            currentDvD.setRating(currentTokens[3]);
            currentDvD.setDirectorName(currentTokens[4]);
            currentDvD.setStudio(currentTokens[5]);
            currentDvD.setUserRating(currentTokens[6]);

            DvDs.put(currentDvD.getId(), currentDvD);

        }
        scanner.close();
    }

    public void writeLibrary() throws DvDLibraryDaoException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));

        } catch (IOException e) {
            throw new DvDLibraryDaoException(
                    "Could not save DvD Data", e);
        }

        List<DvD> DvDList = this.getAllDvDs();
        for (DvD currentDvD : DvDList) {

            out.println(currentDvD.getId() + DELIMITER
                    + currentDvD.getTitle() + DELIMITER
                    + currentDvD.getReleaseDate() + DELIMITER
                    + currentDvD.getRating() + DELIMITER
                    + currentDvD.getDirectorName() + DELIMITER
                    + currentDvD.getStudio() + DELIMITER
                    + currentDvD.getUserRating());
            out.flush();

        }
        out.close();
    }
}
