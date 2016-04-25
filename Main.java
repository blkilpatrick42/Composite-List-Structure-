   /**
     * *****************************************
    */
    /*                                          */
    /*	         Brandon Kilpatrick             */
    /*          CSC 3380_45 Section 1           */
    /*              Assignment 4                */
    /*          Instructor: Douglas  	        */
    /*   Program due date:  April 26, 2016    */
    /**
     * *****************************************
     */   
    /*PROBLEM SPECIFICATION: To print the music
      inventory for a disc jockey by providing the
      song name and band name for each song. If the
      song is part of an album, print the album name
      before printing the list of songs on the album

      PROBLEM ANALYSIS: In order to fulfill the composite
      pattern, the Playlist, Album, and Song all must be
      interchangable and extend the same abstract class.
      The ultimate goal is that the containers and containees
      be interchangable, so that a container contains containees,
      which may also be containers. To this end, Albums, songs,
      and playlists, all extend a basic linked list structure,
      so that any number and combination of songs, albums, and playlists
      can be strung together as part of a playlist, with containers
      and lone containees being interacted with in the same way. Albums
      each contain a linked list of songs, and Playlists contain a linked list
      of single songs, albums, and playlists.

      IMPLEMENTATION DIRECTIONS:The program was coded in Java using the NetBeans IDE.
      In order to compile and run this program, compile it with any Java compiler.
         */
package pkg3380assignment4;

public class Main {

    public static void main(String[] args) {
        //declare several songs and two albums
        //for the DJ playlist test
        Album bivouac = new Album("Bivouac","Jawbreaker");
         Song SongA = new Song("Shield Your Eyes","Jawbreaker");
         Song SongB = new Song("Big","Jawbreaker");
         Song SongC = new Song("Chesterfield King","Jawbreaker");
         bivouac.addSong(SongA);
         bivouac.addSong(SongB);
         bivouac.addSong(SongC);
         Song SongD = new Song("Summer Babe-Winter Version","Pavement");
         Song SongE = new Song("Roland","Interpol");
         Album bullhead = new Album("Bullhead","Melvins");
         Song SongF = new Song("Boris","Melvins");
         Song SongG = new Song("Anaconda","Melvins");
         bullhead.addSong(SongF);
         bullhead.addSong(SongG);
         Song SongH = new Song("I Heard You Looking","Yo La Tengo");
         Song SongI = new Song("Repeater","Fugazi");
         Playlist playlist1 = new Playlist("DJ Playlist");
         
         //Can add Songs and Albums to Playlist
         //in the same way, Songs and Song Containers
         //act interchangably
         playlist1.addComponent(SongD);
         playlist1.addComponent(SongE);
         playlist1.addComponent(bivouac);
         playlist1.addComponent(SongH);
         playlist1.addComponent(bullhead);
         playlist1.addComponent(SongI);
         
         //fill and declare new playlist
         Song SongJ = new Song("Nosferatu Man","Slint");
         Song SongK = new Song("3rd Planet","Modest Mouse");
         Song SongL = new Song("Rhapsody in Blue","Gershwin");
         Playlist playlist2 = new Playlist("Sub List 1");
         playlist2.addComponent(SongJ);
         playlist2.addComponent(SongK);
         playlist2.addComponent(SongL);
         
         //show that you can add a playlist to a playlist,
         //once again containers are containees, containees
         //can also be containers
         playlist1.addComponent(playlist2);
         
         //print playlist 1
         System.out.print(playlist1.toString());
         
    }
    
}
