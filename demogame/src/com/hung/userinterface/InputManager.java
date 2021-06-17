/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hung.userinterface;

import com.hung.state.GameWorldState;
import com.hung.state.State;
import java.awt.event.KeyEvent;

/**
 *
 * @author phamn
 */
public class InputManager {
    
    private State gameState;
    
    public InputManager(State state){
        this.gameState = state;
    }
    
    public void setState(State state) {
        gameState = state;
    }
    
    public void setPressedButton(int code){
        gameState.setPressedButton(code);
    }
    
    public void setReleasedButton(int code){
        gameState.setReleasedButton(code);
    }
    
}
