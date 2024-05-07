/*This is our main class - (not a main method!).
 * The point of this class it to keep a tree which represents our file system
 * We need to have a current directory (a position in the tree)
 */

public class FileSystem {
    private GeneralTree<Entry> sys;
    private Position<Entry> root;
    private Position<Entry> cur;
    /**
     * Constructor - creates a new FileSystem with a root node.
     */
    
    public FileSystem() {
        sys = new GeneralTree<>();
        sys.addRoot(new Directory("root"));
        cur = sys.root();
        root = sys.root();
    }
    
    //****** COMPLETE ALL METHODS BELOW HERE ******//
    /**
     * Accessor
     * @return the root of the file system as a Position
     */
    public Position<Entry> getRoot() {
        return root; //root is an instance variable
    }
    /**
     * Accessor
     * @return current Position (which is the current Directory).
     */
    public Position<Entry> getCur() {
        return cur; //cur is an instance variable
    }
    /**
     * Adds a directory as the child of the current directory
     * @param n name of the new directory
     * @return returns the position of the new directory
     */
    public Position<Entry> mkdir(String n) {
        return sys.addChild(cur, new Directory(n));
    }
    /**
     * Adds a new file to the file system with the given name and size.
     * @param n name of the new file
     * @param s size of the new file
     * @return the Position of the newly added file.
     */
    public Position<Entry> mkfile(String n, int s) {
        return sys.addChild(cur, new File(n, s));
    }
    /**
     * Print the name of the current directory, followed by the contents of the current directory.
     */
    public void ls() {
        System.out.println("Contents of current directory: "+cur.getElement().getName());
        for(Position<Entry> x : sys.children(cur)){
            if(x.getElement().isDirectory())
                System.out.println("\tDirectory: "+x.getElement().getName());
            else
                System.out.println("\tFile: "+x.getElement().getName());
        }
    }
    /**
     * Print the name of the current directory. See sample output for how to format this.
     */
    public void pwd() {
        System.out.println("Current Directory: "+cur.getElement().getName());
    }
    
    /**
     * Method to change directory to one of the children of current.
     * @param n name of the directory to change the current to.  If n does not match the name of any of the
     * children, return cur unchanged.  (no error).
     * @return the new current directory (position), or the old one if the parameter could not be found.
     */
    public Position<Entry> cd(String n) {
        for(Position<Entry> x : sys.children(cur)){
            if(x.getElement().isDirectory() && x.getElement().getName().equals(n)){
                cur = x;
            }
        }
        //no elements results in no change
        return getCur();
    }
    /**
     * A method to move up one folder.  If cur is already the root, just return the root.  (no error).
     * @return the new current position in the tree.
     */
    public Position<Entry> cd() { //overloaded method
        if(cur == root)
            return getRoot();
        else
            return cur = sys.parent(cur);
    }
    
    /**
     * A method to calculate the size of all the files and folders in the subtree rooted at start.
     * This is a recursive method.
     * @param start the position to start the calculation
     * @return the size calculated
     */
    
    public int du(Position<Entry> start) {
        int contains = 0; //size holder
        for(Position<Entry> x : sys.validate(start).getChildren()){
            if(x.getElement().isDirectory() && sys.isInternal(x)){
                contains += du(x);
            }
            if(!x.getElement().isDirectory()){
                contains += x.getElement().size();
            }
        }
        
        
        //always root, but a custom preorder could be made
        //change root() to start
        //for(Position<Entry> x : sys.preorder()){
         //   if(!x.getElement().isDirectory())
          //      contains += x.getElement().size();
        //}
        
        return contains;
    }
    
}
