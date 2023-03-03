package coe.unosquare.benefits.exceptions;

import java.io.*;

/**
 * HappyFeetFranchiseNotFoundException
 *
 * verify that a known franchise is being processed.
 * @version 1.0
 * @since 2023-02-24
 * fired if there is not a known franchise
 */
  public class HappyFeetFranchiseNotFoundException extends RuntimeException{
    public HappyFeetFranchiseNotFoundException(String message) {
        super(message);
    }
}
