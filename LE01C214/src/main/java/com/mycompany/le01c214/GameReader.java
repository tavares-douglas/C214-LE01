/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.le01c214;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GameReader {

    List<Game> games = new ArrayList<>();

    public GameReader(){
        listGames();
    }

    public void listGames(){

        try {
            Reader reader = Files.newBufferedReader(Paths.get("vendas-games.csv"));
            CsvToBean<Game> csvToBean = new CsvToBeanBuilder(reader).withType(Game.class).withIgnoreLeadingWhiteSpace(true).build();
            games = csvToBean.parse();
        }catch (IOException e){
            System.out.println("Deu ruim");
        }

    }

    public List<Game> listByPlataform(String plataforma){

        List<Game> gamesByPlatform = new ArrayList<>();

        for(int i = 0; i < games.size(); i++)
            if(games.get(i).getPlatform().equals(plataforma))
                gamesByPlatform.add(games.get(i));

        return gamesByPlatform;

    }

    public List<Game> listByPublisher(String publisher){

        List<Game> gamesByPublisher = new ArrayList<>();

        for(int i = 0; i < games.size(); i++)
            if(games.get(i).getPublisher().equals(publisher))
                gamesByPublisher.add(games.get(i));

        return gamesByPublisher;

    }

}