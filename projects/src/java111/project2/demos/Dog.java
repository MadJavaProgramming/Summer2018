/**
 *  This Dog class shows different behavior depending on size.
 *
 *@author    eknapp
 */
public class Dog {

    private int     size;
    private String  name;

    /** set the dog's size
     * @param newSize
     */
     public void setSize(int newSize) {
         size = newSize;
     }

     /** get the dog's name
      * @return dog's name
      */
     public String getName() {
         return name;
     }
    /**
     *  This method is the code for the bark action
     *  @param numberOfBarks number of times the dog should bark
     */
    void bark(int numberOfBarks) {
        int counter = 0;
        while (counter < numberOfBarks) {
            if (size > 60) {
                System.out.println("Wooof! Woooof!");
            } else if (size > 14) {
                System.out.println("Ruff! Ruff!");
            } else {
                System.out.println("Yip! Yip!");
            }
            counter++;
        }
    }

    /** demonstrates a method that returns a value, in this
     * a simple string.
     * @return dog's tellASecret
     */
    String tellASecret() {
        return "this is my secret...";
    }

}
