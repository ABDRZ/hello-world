/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr7githelloworld;

/**
 *
 * @author Le Padre
 */
public class Hello {
    private String message;

    public Hello(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return  message ;
    }
    
}
