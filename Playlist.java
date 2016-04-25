
package pkg3380assignment4;

public class Playlist extends Component{
    //head for local list
    Component listHead = null;
   
    //local length
    int length = 0;
    
    public Playlist(String name){
        this.name = name;
    }
    
    //add given component to the playlist
    public void addComponent(Component inComponent){
        if(listHead == null){
            listHead = inComponent;
        }
        else{
            listHead.addChild(inComponent);
        }
        length++;
    }
    
    //removes first occurance of given component
    //from the component list
    public void removeComponent(Component remCom){
        if(listHead.equals(remCom)){
            listHead = (Song)listHead.next;
            length--;
        }
        if(listHead.contains(remCom)){
            listHead.removeChild(remCom);
            length--;
        }
    }
    
    //removes first occurance of given component
    //from the component list
    public void removeComponent(String name){
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
    public Component getComponent(int i){
        return listHead.getChild(i);
    }
    
    //reads the contents of the playlist as a string
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("(Playlist) "+name);
        builder.append(":");
        Component traverser = listHead;
        if(traverser!=null){
            for(int i = 0; i < length; i ++){
                builder.append("\n");
                builder.append(i+1+") ");
                builder.append(traverser.toString());
                traverser = traverser.next;
            }
        }
        return builder.toString();
    }
}
