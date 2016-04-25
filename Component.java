
package pkg3380assignment4;

public abstract class Component {
    // name
    public String name = "";
    // name of band
    public String band = "";
    // next component
    public Component next = null;
    
    
    //method for adding a child to the
    //end of the local branch of children
    public void addChild(Component newChild){
        if(next == null){
            next = newChild;
        }else{
            next.addChild(newChild);
        }
    }
    
    //removes given element from the list
    public void removeChild(Component remComp){
        if(next!=null){
            if(remComp.equals(next)){
                if(next.next!=null){
                    next = next.next;
                }
                else{
                    next = null;
                }
            }
            else{
                next.removeChild(remComp);
            }
        }
    }
    
    //removes element with given name
    public void removeChildByName(String name){
        if(next!=null){
            if(next.nameEquals(name)){
                if(next.next!=null){
                    next = next.next;
                }
                else{
                    next = null;
                }
            }
            else{
                next.nameEquals(name);
            }
        }
    }
    
    //returns a specific element of the 
    //component list from this child
    public Component getChild(int i){
        if( i == 0){
            return this;
        }
        if( i == 1){
            return next;
        }
        else{
            if(next!=null){
                i--;
                return next.getChild(i);
            }
            else{
                return null;
            }
        }
    }
    
    //checks if the list contains a component
    public boolean contains(Component checkComp){
        if(this.equals(checkComp)){
            return true;
        }
        if(next!=null){
            if(next.equals(checkComp)){
                return true;
            }
            else{
                return next.contains(checkComp);
            }
        }
        else{
            return false;
        }
    }
    
    //checks if the list contains a component
    //with the given name
    public boolean contains(String name){
        if(this.nameEquals(name)){
            return true;
        }
        if(next!=null){
            if(next.nameEquals(name)){
                return true;
            }
            else{
                return next.contains(name);
            }
        }
        else{
            return false;
        }
    }
    
    //checks if the names & bands of the components are =
    public boolean equals(Component check){
        return this.name.equals(check.name)&&this.band.equals(check.band);
    }
    
    //checks if the name is equal to the given one
    public boolean nameEquals(String name){
        return this.name.equals(name);
    }
    
    //returns the string of the name of the component
    public String toString(){
        return name+", "+band;
    }
}
