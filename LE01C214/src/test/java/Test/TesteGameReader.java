/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.mycompany.le01c214.GameReader;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class TesteGameReader {

    private static GameReader gameReader;

    @BeforeClass
    public static void init(){
        gameReader = new GameReader();
    }

    @Test
    public void GamesAmountTest(){
        Assert.assertEquals(155,gameReader.games.size());
    }

    @Test
    public void WiiGamesAmountTest(){
        List<Game> WiiGames = gameReader.listByPlataform("Wii");
        Assert.assertEquals(5,gamesPS4.size());
    }

    @Test
    public void ActivisionGamesAmountTest(){
        List<Game> ActivisionGames = gameReader.listByPublisher("Activision");
        Assert.assertEquals(15,gamesSony.size());
    }

    @Test
    public void WiiGamesTest(){
        List<Game> WiiGames = gameReader.listByPlataform("Wii");
        boolean flag = false;
        if(WiiGames.get(0).getPlatform().equals("Wii"))
            flag = true;
        Assert.assertTrue(flag);
    }

    @Test
    public void testeGameSony(){
        List<Game> gamesPS4 = gameReader.listarPorPublisher("Sony Computer Entertainment");
        boolean flag = false;
        if(gamesPS4.get(0).getPublisher().equals("Sony Computer Entertainment"))
            flag = true;
        Assert.assertTrue(flag);
    }


}