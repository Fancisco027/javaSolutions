/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberintos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author francisco
 */
public class Laberintos {

    static class laberinto{
        List<Integer> listVertex;
        public laberinto( List<Integer> lista ){
            
            listVertex = lista;
            
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ArrayList<Integer> p[] = new ArrayList<Integer>[5]();
        laberinto arrVertex[] = new laberinto[3];
        
        
        List<Integer> L0 = new ArrayList<Integer>();
        List<Integer> L1 = new ArrayList<Integer>();
        List<Integer> L2 = new ArrayList<Integer>();
        
        
        for (int i = 0; i < 3; i++) {
            L0.add(i + 1);
            L1.add( i + 2 );
            L1.add( i + 3 );
            
        }
        
        arrVertex[0] = new laberinto(L0);
        arrVertex[1] = new laberinto(L1);
        arrVertex[2] = new laberinto(L2);
        
        for (int i = 0; i < arrVertex.length; i++) {
            for (int j = 0; j < arrVertex[i].listVertex.size(); j++) {
                
                System.out.println("Value arr[" + i + "] = " + arrVertex[i].listVertex.get(j));
                
                
            }
        }
        

    
        
        
    }
    
}
