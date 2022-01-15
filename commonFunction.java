/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Bhojraj
 */
public class commonFunction
{
    public static void addImageBackgroung(JLabel lbl , String path)
    {
        BufferedImage img = null;
        try
        {
            img = ImageIO.read(new File(path));
            Image newing = img.getScaledInstance(lbl.getWidth(), lbl.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newing); 
            lbl.setIcon(icon);
        } catch (Exception e)
        {
        }
    }
    public static String getDate()
    {
        String mydate;
        Calendar cd = Calendar.getInstance();
        Date d = cd.getTime();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy  hh:mm:ss");
        mydate = sd.format(d);
        return mydate;
    }
     
    public static void isDigit(java.awt.event.KeyEvent evt)
    {
        char ch;
        ch = evt.getKeyChar();
        if(Character.isDigit(ch)==true)
        {
            
        }
        else
        {
            evt.consume();
        }
    }
    
    public static void isLetter(java.awt.event.KeyEvent evt)
    {
        char ch;
        ch  = evt.getKeyChar();
        if(Character.isLetter(ch)==true)
        {
            
        }
        else
        {
            evt.consume();
        }
    }
}
