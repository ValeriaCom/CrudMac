/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmacedone;

/**
 *
 * @author marco
 */
public interface State {
    void next(Event e);
    
}
