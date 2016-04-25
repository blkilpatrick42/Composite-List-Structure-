
package pkg3380assignment4;
import java.util.ArrayList;
public class Album extends Component{
    //the length of the album
    int length = 0;
    
    Song listHead = null;
    
    //constructor
    public Album(String inName, String inBand){
        name = inName;
        band = inBand;
    }
    
    //adds a component to the local
    //component list
    public void addSong(Song newSong){
        if(listHead == null){
            listHead = newSong;
        }
        else{
            listHead.addChild(newSong);
        }
        length++;
    }
    
    //removes first occurance of given component
    //from the component list
    public void removeSong(Song remSong){
        if(listHead.equals(remSong)){
            listHead = (Song)listHead.next;
            length--;
        }
        if(listHead.contains(remSong)){
            listHead.removeChild(remSong);
            length--;
        }
    }
    
    //removes first occurance of given component
    //from the component list
    public void removeSong(String name){
        if(listHead.nameEquals(name)){
            listHead = (Song)listHead.next;
            length--;
        }
        if(listHead.contains(name)){
            listHead.removeChildByName(name);
            length--;
        }
    }
    
    //returns a specific element of the 
    //component list
    public Component getSong(int i){
        return listHead.getChild(i);
    }
    
    
    //returns the whole album as a formatted
    //string with the album name first
    //and then the song list
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(" by ");
        builder.append(band);
        builder.append(":");
        Component traverser = listHead;
        if(traverser!=null){
            for(int i = 0; i < length; i ++){
                builder.append("\n   ");
                builder.append(i+1+") ");
                builder.append(traverser.toString());
                traverser = traverser.next;
            }
        }
        return builder.toString();
    }
    
}
