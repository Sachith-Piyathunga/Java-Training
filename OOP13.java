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
        
    }
}














public class OOP13 {
    
}
