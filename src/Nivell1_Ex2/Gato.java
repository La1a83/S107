
package Nivell1_Ex2;




public class Gato extends Animal {

    @Override
    public void numPatas() {
       System.out.println("El gato tiene 4 patas");
    }

    @Override
    public String emiteSonido() {
        return "El gato maúlla.";
    }
    
    // Javadoc comment follows
    /**
     * @deprecated
     * Because it's no longer useful.
     */
    @Deprecated
    public void deprecatedMethod() { 
        System.out.println("Este método está 'deprecated'");
    
    }
    
}
