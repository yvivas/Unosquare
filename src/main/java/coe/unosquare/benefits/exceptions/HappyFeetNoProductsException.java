package coe.unosquare.benefits.exceptions;

/**
 * HappyFeetNoProductsException
 *
 * Validates that at least there are products to be processed.
 * @version 1.0
 * @since 2023-02-24
 *  call if there are no products
 */
public class HappyFeetNoProductsException extends RuntimeException{
    public HappyFeetNoProductsException(String message) {
        super(message);
    }
}
