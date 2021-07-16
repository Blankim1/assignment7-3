/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7.pkg3;

import java.io.FileNotFoundException;

/**
 *
 * @author qianjiahui
 */

interface FileIO
{
    public abstract void saveFile(String a_fileName) throws FileNotFoundException;
    
    public abstract void loadFile(String a_fileName) throws FileNotFoundException;
    
}
