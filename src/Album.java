import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    // write code here

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        // Check whether the song existed before adding Song
        Song newSong = this.findSong(title);
        if (newSong == null){
            songs.add(newSong);
            return true;
        }
        return false;
    }

    public Song findSong(String title){
        //traverse all the element in the songs to check whether the song title existed
        for (Song element : songs){
            // Exists
            if (element.getTitle().equals(title)){
                return element;
            }
            // Doesn't exists.

        }
        return null;
    }

    public boolean addToPlayList(int number, LinkedList<Song> playlist){
        Song newSong = songs.get(number - 1);
        ListIterator<Song> listIterator = playlist.listIterator();
        while(listIterator.hasNext()){
            if(listIterator.next().getTitle().equals(newSong.getTitle())){
                return false;
            }
        }
        playlist.addLast(newSong);
        return true;

    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song newSong = this.findSong(title);
        ListIterator<Song> listIterator = playlist.listIterator();
        while (listIterator.hasNext()){
            if(listIterator.next().getTitle().equals(title)){
                return false;
            }
        }
        playlist.addLast(newSong);
        return true;
    }

}