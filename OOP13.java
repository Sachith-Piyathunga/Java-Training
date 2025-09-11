/**
 * Write a Java program to create a class called "MusicLibrary" with a collection 
 * of songs and methods to add and remove songs, and to play a random song.
 */

// Import the java ArrayList class
import java.util.ArrayList;

// Import java random class
import java.util.Random;

// MusicLibrary.java
// Define the MusicLibray class
/* public */ class MusicLibrary {

    // Declare the private field
    private ArrayList<Song> songs;

    // Constructor for the music library class 
    public MusicLibrary() {
        // Create a new array list to hold the song objects
        songs = new ArrayList<Song>();
    }

    // Method to add a song to the library
    public void addSong(Song song) {
        // Add the song to the list
        songs.add(song);
    }

    // Method to remove a song from the library
    public void removeSong(Song song) {
        // Remove the song from the list
        songs.remove(song);
    }

    // Method to get the all songs list
    public ArrayList<Song> getSongs() {
        // Return the songs
        return songs;
    }

    // Method to play random songs
    public void playRandomSong() {
        // Get the number of songs
        int size = songs.size();

        // Check if the library is empty
        if (size == 0) {
            // Print the message
            System.out.println("No songs in the library.");
            // Exit the method
            return;
        }

        // Create a new random object
        Random rand = new Random();

        // Genarate a random index
        int index = rand.nextInt(size);

        // Print the title and artist
        System.out.println("Now playing: " + songs.get(index).getTitle() + " by " + songs.get(index).getArtist());
    }  
}


/**
 * Explantion
 * 
 * The above “MusicLibrary” class represents a library of songs. It uses an ArrayList 
 * to store the songs, and provides methods to add and remove songs from the library. 
 * It also has a method to get a list of all the songs in the library, and a method 
 * to play a random song from the library.
 * 
 */


// Song.java
// Define the public lass Song
/* public */ class Song {

    // Create the private field
    private String title;
    private String artist;
}











public class OOP13 {
    
}
