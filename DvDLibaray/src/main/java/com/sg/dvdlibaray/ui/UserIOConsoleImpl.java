/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibaray.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author colby
 */
public class UserIOConsoleImpl implements UserIO{

      @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public double readDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
        double d = 0;
        boolean Double = false;
        while (!Double) {

            try {
                print(prompt);
                d = sc.nextDouble();
                Double = true;
            } catch (InputMismatchException e) {
                sc.nextLine();

            }

        }
        return d;

    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        Scanner sc = new Scanner(System.in);
        double d = 0;
        boolean okayNumber = false;
        while (!okayNumber) {

            try {
                print(prompt);
                d = sc.nextDouble();
                if (d < min || d > max) {
                    okayNumber = false;

                } else {
                    okayNumber = true;
                }

            } catch (InputMismatchException e) {
                sc.nextLine();

            }

        }
        return d;
    }

    @Override
    public float readFloat(String prompt) {
        Scanner sc = new Scanner(System.in);
        float f = 0;
        boolean Double = false;
        while (!Double) {

            try {
                print(prompt);
                f = sc.nextFloat();
                Double = true;
            } catch (InputMismatchException e) {
                sc.nextLine();

            }

        }
        return f;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        Scanner sc = new Scanner(System.in);
        float f = 0;
        boolean okayNumber = false;
        while (!okayNumber) {

            try {
                print(prompt);
                f = sc.nextFloat();
                if (f < min || f > max) {
                    okayNumber = false;

                } else {
                    okayNumber = true;
                }

            } catch (InputMismatchException e) {
                sc.nextLine();

            }

        }
        return f;
    }

    @Override
    public int readInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        int f = 0;
        boolean Double = false;
        while (!Double) {

            try {
                print(prompt);
                f = sc.nextInt();
                Double = true;
            } catch (InputMismatchException e) {
                sc.nextLine();

            }

        }
        return f;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int f = 0;
        boolean okayNumber = false;
        while (!okayNumber) {

            try {
                print(prompt);
                f = sc.nextInt();
                if (f < min || f > max) {
                    okayNumber = false;

                } else {
                    okayNumber = true;
                }

            } catch (InputMismatchException e) {
                sc.nextLine();

            }

        }
        return f;
    }

    @Override
    public long readLong(String prompt) {
        Scanner sc = new Scanner(System.in);
        Long f = 0L;
        boolean Double = false;
        while (!Double) {

            try {
                print(prompt);
                f = sc.nextLong();
                Double = true;
            } catch (InputMismatchException e) {
                sc.nextLine();

            }

        }
        return f;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        Scanner sc = new Scanner(System.in);
        Long f = 0L;
        boolean okayNumber = false;
        while (!okayNumber) {

            try {
                print(prompt);
                f = sc.nextLong();
                if (f < min || f > max) {
                    okayNumber = false;

                } else {
                    okayNumber = true;
                }

            } catch (InputMismatchException e) {
                sc.nextLine();

            }

        }
        return f;
    }

    @Override
    public String readString(String prompt) {
        Scanner sc = new Scanner(System.in);
        print(prompt);
        String s = sc.nextLine();
        return s;

    }
}
