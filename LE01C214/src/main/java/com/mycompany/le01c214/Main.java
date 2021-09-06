/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.le01c214;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        GameReader gr = new GameReader();

        List<Game> WiiGames = gr.listByPlataform("Wii");
        List<Game> ActivisionGames = gr.listByPublisher("Activision");

        for(int i = 0; i < WiiGames.size(); i++){
            System.out.println(WiiGames.get(i).getName());
        }
        System.out.println("");
        for(int i = 0; i < ActivisionGames.size(); i++){
            System.out.println(ActivisionGames.get(i).getName());
        }

    }

}