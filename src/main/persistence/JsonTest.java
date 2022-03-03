package persistence;

import model.Song;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonTest {
    protected void checkSong(String name, String artist, String album, String genre, Song song) {
        assertEquals(name, song.getName());
        assertEquals(artist, song.getArtist());
        assertEquals(album, song.getAlbum());
        assertEquals(genre, song.getGenre());
    }
}