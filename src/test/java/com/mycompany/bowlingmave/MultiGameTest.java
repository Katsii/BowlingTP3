package com.mycompany.bowlingmave;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.bowlingmave.MultiGame;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Morgane Tuffery
 */
public class MultiGameTest {
    
    private MultiGame game;
    private String[] playersName = {"Killian", "Marjorie", "Clément", "Maxime"};

    @Before
    public void setUp() {
        game = new MultiGame();
    }

    /**
     * Test of startNewGame method, of class MultiGame.
     */
    @Test
    public void testStartNewGame() {
        
        try {
            game.startNewGame(null);
            fail("Succced but was false");
        } catch (Exception ex) {
            System.out.println("StartNewGame(null) -> OK");
        }
        
        try {
            game.startNewGame(new String[]{});
            fail("Succced but was false");
        } catch (Exception ex) {
            System.out.println("StartNewGame({}) -> OK");
        }
        
        try {    
            game.startNewGame(playersName);
            //assertTrue(game.joueurs[0].score() == 22);
            
        } catch (Exception ex) {
            //Logger.getLogger(MultiGameTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("Failed but was correct" + ex);
        }
        
    }

    /**
     * Test of lancer method, of class MultiGame.
     */
    @Test
    public void testLancer() throws Exception {
        System.out.println("lancer");
        int nombreDeQuillesAbattues = 0;
        MultiGame instance = new MultiGame();
        String expResult = "";
        String result = instance.lancer(nombreDeQuillesAbattues);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scoreFor method, of class MultiGame.
     */
    @Test
    public void testScoreFor() throws Exception {
        System.out.println("scoreFor");
        String playerName = "";
        MultiGame instance = new MultiGame();
        int expResult = 0;
        int result = instance.scoreFor(playerName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    

   
}
