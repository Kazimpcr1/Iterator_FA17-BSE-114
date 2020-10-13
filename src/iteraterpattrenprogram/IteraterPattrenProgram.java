/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteraterpattrenprogram;

/**
 *
 * @author KazimHussain
 */
public class IteraterPattrenProgram {

    public static void main(String[] args) {
        // TODO code application logic here
        NameRepositry mynamesCollection = new NameRepositry();
        
        
        for(Iterator myNameiter=mynamesCollection.getIterator(); myNameiter.hasNext();){
            String currentitemfromRepo = (String) myNameiter.next();
            System.out.println(currentitemfromRepo+" is the string from the collection");
        }
        
    }
    
}
