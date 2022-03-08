package com.totaleclipse.client;

public class Client {
    public static void main(String[] args) {
        /* These outputs will likely be refactored into a separate class after their creation. */

        //Intro card to the game
        System.out.println("Total Eclipse of the .start()");
        System.out.println("A text-based mystery game full of conspiracy! " +
                "Are you human? Alien? Or something else entirely? " +
                "Uncover your past and discover your true identity!");
        System.out.println("Type \"start\" to start playing, or to exit the game, simply type \"quit\"\n\n");

        //player types start.

        //Explaining the start of the game
        System.out.println("""
                You wake up in a crop circle, surrounded by corn. Your leather jacket is dirty.
                You can't seem to remember who you are or how you ended up in the midst of all this corn, and you want answers.
                Over the corn in the distance, you can see a cow floating up into a disc-like shape in the sky, before it flies away.
                
                Type out the action you wish to perform, with a verb first an noun second.
                \tFor example, you can look around by typing "look north" or "look west".
                \t\tFor more commands, type "help".""");

    }
}