package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        videojuegos LigaDeLeyendas = new videojuegos(1, "LeagueOfLegends", "Riot Games", LocalDate.of(2009,10,27), 0, "MOBA", "12", 67000000, "PC", 0);
        videojuegos JSRF = new videojuegos(2, "Jet Set Radio Future", "SEGA", LocalDate.of(2002,3,14), 10000000, "Arcade", "12", 1, "Xbox", 40);
        videojuegos GTASA = new videojuegos(3, "Grand theft auto San Andreas", "2K", LocalDate.of(2004,10,26), 0, "Acción", "12", 20000000, "PC", 2000000);
        videojuegos Zelda = new videojuegos(4, "The Legend of Zelda Majoras Mask", "Nintendo", LocalDate.of(2000,11,17), 1, "Aventura", "12", 570000, "Nintendo 64", 30);
        videojuegos Sonic = new videojuegos(5, "Sonic Heroes", "SEGA", LocalDate.of(2004,6,5), 1, "Plataformas", "TP", 600000, "Xbox", 60);
        videojuegos CounterStrike = new videojuegos(6, "Counter Strike Global Offensive", "Valve", LocalDate.of(2012,8,21), 600000, "Shooter", "18", 80000,"PC", 10);




    }
}
